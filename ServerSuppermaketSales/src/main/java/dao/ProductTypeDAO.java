package dao;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import org.bson.types.ObjectId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSessionFactory;

import db.MyEMFactory;
import entity.Product;
import entity.ProductType;
import service.IProductTypeService;

public class ProductTypeDAO extends UnicastRemoteObject implements IProductTypeService {
	private static final long serialVersionUID = 1L;
	private OgmSessionFactory factory;

	public ProductTypeDAO() throws Exception {
		super();
		this.factory = MyEMFactory.getInstance().getEntityManagerFactory();
	}

	@Override
	public ProductType findProductTypeById(String id) throws Exception {
		Session session = factory.openSession();
		try {
			ProductType productType = session
					.createNativeQuery("db.product_types.find({_id: ObjectId('"+id+"'), selling: true})",
							ProductType.class).getSingleResult();
			return productType;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductType> findListProductTypeByName(String name) throws Exception {
		Session session = factory.openSession();
		try {
			List<ProductType> listProductType = session
					.createNativeQuery("db.product_types.find({type_name: '"+name+"', selling: true})",
							ProductType.class).list();
			return listProductType;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addOrUpdateProductType(ProductType productType) throws Exception {
		Session session = factory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			session.saveOrUpdate(productType);
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
	public boolean deleteProductType(ProductType productType) throws Exception {
		Session session = factory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			session.delete(productType);
			transaction.commit();

			return false;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public List<ProductType> getAllProductType() throws Exception {
		Session session = factory.openSession();
		try {
			List<ProductType> productTypes = session
					.createNativeQuery("db.product_types.find({selling: true})", ProductType.class).list();
			return productTypes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
