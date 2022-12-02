package dao;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import db.MyEMFactory;
import entity.Product;
import entity.ProductType;
import service.IProductService;

public class ProductDAO extends UnicastRemoteObject implements IProductService {
	private static final long serialVersionUID = 1L;
	private OgmSessionFactory sessionFactory;
	public ProductDAO() throws Exception {
		sessionFactory = MyEMFactory.getInstance().getEntityManagerFactory();
	}

	@Override
	public Product findProductById(String id) throws Exception {
		Session session = sessionFactory.openSession();
		try {
			Product product =  session
					.createNativeQuery("db.products.find({_id: ObjectId('"+id+"'), selling: true})",
							Product.class).getSingleResult();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	@Override
	public List<Product> getAllProduct() throws Exception {
		Session session = sessionFactory.openSession();
		try {
			List<Product> products = session
					.createNativeQuery("db.products.find({selling: true})", Product.class).list();
			return products;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Product> getAllProductByProductTypeId(String product_type_id) throws Exception {
		Session session = sessionFactory.openSession();
		try {
			List<Product> entities = session
					.createNativeQuery("db.products.find({product_type_id: '"+product_type_id+"', selling: true})",
							Product.class).list();
			return entities;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean addOrUpdateProduct(Product product) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			session.merge(product);
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
	public boolean deleteProduct(String productId) throws Exception {
		OgmSession session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			Product pr = session.find(Product.class, productId);
			session.delete(pr);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		return false;

	}


	@Override
	public Product findProductByName(String name) throws Exception {
		Session session = sessionFactory.openSession();
		try {
			Product product = session
					.createNativeQuery("db.product.find({type_name: '"+name+"', selling: true})",
							Product.class).getSingleResult();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
