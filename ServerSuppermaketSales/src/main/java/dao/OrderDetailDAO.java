package dao;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSessionFactory;

import db.MyEMFactory;
import entity.Order;
import entity.OrderDetail;
import entity.Product;
import service.IOrderDetailService;

public class OrderDetailDAO extends UnicastRemoteObject implements IOrderDetailService {
	private static final long serialVersionUID = 1L;
	private OgmSessionFactory sessionFactory;

	public OrderDetailDAO() throws Exception {
		this.sessionFactory = MyEMFactory.getInstance().getEntityManagerFactory();
	}

	@Override
	public OrderDetail findOrderDetailById(int order_id, int product_id) throws Exception {
		Session session = sessionFactory.openSession();
		try {
			OrderDetail orderDetail = session
					.createNativeQuery("db.order_details.find({order_id: '"+order_id+"', product_id: '"+product_id+"'})",
							OrderDetail.class).getSingleResult();
			return orderDetail;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean addOrUpdateOrderDetail(OrderDetail orderDetail) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			session.merge(orderDetail);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return false;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean deleteOrderDetail(OrderDetail orderDetail) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			session.delete(orderDetail);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<OrderDetail> getAllOrderDetail() throws Exception {
		Session session = sessionFactory.openSession();
		try {
			List<OrderDetail> entities = session.createNativeQuery("db.order_details.find({})", OrderDetail.class).list();
			return entities;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<OrderDetail> getAllByOrderId(int order_id) throws Exception {
		Session session = sessionFactory.openSession();
		try {
			List<OrderDetail> entities = session
					.createNativeQuery("db.order_details.find({order_id: '"+order_id+"'})",
							OrderDetail.class).list();
			return entities;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
