package db;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.ogm.OgmSessionFactory;
import org.hibernate.ogm.boot.OgmSessionFactoryBuilder;
import org.hibernate.ogm.cfg.OgmProperties;
import org.hibernate.service.ServiceRegistry;

import entity.Account;
import entity.Order;
import entity.OrderDetail;
import entity.OrderProductId;
import entity.Product;
import entity.ProductType;
import entity.Staff;

public class MyEMFactory {
	private static MyEMFactory instance = null;
//	private SessionFactory sessionFactory;
	private OgmSessionFactory sessionFactory;
	
	
	
	private MyEMFactory() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySetting(OgmProperties.ENABLED, true)
		        .configure().build();

		Metadata metadata = new MetadataSources(serviceRegistry)
			.addAnnotatedClass(Staff.class)
			.addAnnotatedClass(Account.class)
			.addAnnotatedClass(ProductType.class)
			.addAnnotatedClass(Product.class)
			.addAnnotatedClass(Staff.class)
			.addAnnotatedClass(Order.class)
			.addAnnotatedClass(OrderProductId.class)
			.addAnnotatedClass(OrderDetail.class)
			.getMetadataBuilder().build();
		
		 sessionFactory = metadata.getSessionFactoryBuilder().unwrap(OgmSessionFactoryBuilder.class).build();
	}

	public static MyEMFactory getInstance() {
		if (instance == null) {
			instance = new MyEMFactory();
		}

		return instance;
	}

	public OgmSessionFactory getEntityManagerFactory() {
		return sessionFactory;
	}
}
