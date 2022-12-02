package dao;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import org.bson.types.ObjectId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSessionFactory;

import db.MyEMFactory;
import entity.Order;
import entity.Product;
import service.IOrderService;

public class OrderDAO extends UnicastRemoteObject implements IOrderService {
	private static final long serialVersionUID = 1L;
	private OgmSessionFactory factory;

	public OrderDAO() throws Exception {
		this.factory = MyEMFactory.getInstance().getEntityManagerFactory();
	}

	@SuppressWarnings("deprecation")
	@Override
	public ObjectId addOrUpdateOrder(Order order) throws Exception {
		Session session = factory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			ObjectId id = new ObjectId();
			order.setId(id);
			session.saveOrUpdate(order); // save or saveOrUpdate -> have order.getId else 0
			transaction.commit();
			System.out.println("Order ID" + id);
			return id;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public Order findOrderById(String id) throws Exception {
		Session session = factory.openSession();
		try {
			Order order = session.createNativeQuery("db.orders.find({_id: ObjectId('" + id + "')})", Order.class)
					.getSingleResult();
			return order;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> getAllOrder() throws Exception {
		Session session = factory.openSession();
		try {
			List<Order> entities = session.createNativeQuery("db.orders.find({})", Order.class).list();
			return entities;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> filter(String dateStart, String dateEnd) throws Exception {
		Session session = factory.openSession();
		try {
			List<Order> orders = session.createNativeQuery(" db.orders.find({ order_date: { $gte: ISODate('" + dateStart
					+ "T00:00:00Z'), $lt: ISODate('" + dateEnd + "T23:59:59Z') } }).pretty()", Order.class).list();
			return orders;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> getAllOrderDateNow(String dateNow) throws Exception {
		Session session = factory.openSession();
		try {
			List<Order> orders =session.createNativeQuery(" db.orders.find({ order_date: { $gte: ISODate('" + dateNow
					+ "T00:00:00Z'), $lt: ISODate('" + dateNow + "T23:59:59Z') } }).pretty()", Order.class).list();
			return orders;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
