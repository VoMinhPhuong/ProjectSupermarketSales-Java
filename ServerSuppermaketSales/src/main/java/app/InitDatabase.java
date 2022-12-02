package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.AccountDAO;
import dao.OrderDAO;
import dao.OrderDetailDAO;
import dao.ProductDAO;
import dao.StaffDAO;
import db.MyEMFactory;
import entity.Account;
import entity.Order;
import entity.OrderDetail;
import entity.Product;
import entity.ProductType;
import entity.Staff;
import service.IAccountService;
import service.IOrderDetailService;
import service.IProductService;
import service.IProductTypeService;
import service.IStaffService;
import service.IOrderService;
import service.impl.AccountServiceImpl;
import service.impl.OrderDetailServiceImpl;
import service.impl.OrderServiecImpl;
import service.impl.ProductServiceImpl;
import service.impl.ProductTypeServiceImpl;
import service.impl.StaffServiceImpl;

public class InitDatabase {
	public static void main(String[] args) {
		try {
//			Session session = MyEMFactory.getInstance().getEntityManagerFactory().getCurrentSession();
//			Transaction transaction = session.getTransaction();
//			Account account = new Account(staff, "123456");
//			ProductType productType = new ProductType("Nuoc uong", "Chai");
//
//			Product product = new Product("AquaPhina", 100, 5000, productType);
//			Order order = new Order(new Date(), staff, null);
//			OrderDetail orderDetail = new OrderDetail(product, order, 3);
			
			// Test
			IAccountService ioAccountService = new AccountServiceImpl();
			IStaffService ioStaffService = new StaffServiceImpl();
			IOrderService ioOrderService = new OrderServiecImpl();
			IOrderDetailService ioOrderDetailIO = new OrderDetailServiceImpl();
			IProductService ioProductService = new ProductServiceImpl();
			IProductTypeService ioProductTypeService = new ProductTypeServiceImpl();
//			
//			Order order = ioOrderService.findOrderById("638968dff4681b46603bad6e");
//			System.out.println("order " +order.getDetails());
//			Account account = ioAccountService.findAccountByUserName("admin");
//			System.out.println("account" + account);
//			ProductType productType = new ProductType("Nuoc uong", "Chai1");
//			ioProductTypeService.addOrUpdateProductType(productType);
//			Product product = new Product("AquaPhina 9", 100, 5000, productType);
//			ioProductService.addOrUpdateProduct(product);
//			ioProductService.getAllProduct().forEach(pro -> {
//				System.out.println(pro);
//			});;
//			ProductType res = ioProductTypeService.findProductTypeById("63887b38f4681b52a874afd3");
//			res.setSelling(false);
//			ioProductTypeService.addOrUpdateProductType(res);
//			System.out.println(res);
//			ioProductTypeService.getAllProductType().forEach(pro -> {
//				System.out.println(pro);
//			});
//			Staff _staff = new Staff("NV001", "Nguyen Duc Huy", "11113", "11113", "Nghe An", false, false, false, null);
//			Account _newAccount = new Account(_staff, "123456");
////			System.out.println(_newAccount);
//			ioStaffService.addOrUpdateStaff(_staff);
//			ioAccountService.addAccount(_newAccount);

//			System.out.println(ioOrderService.getAllOrderDateNow("2022-11-09"));
//			System.out.println(ioAccountService.findAccountByUserName("NV001"));

//			System.out.println(ioOrderService.filter("2022-11-02", "2022-11-08"));
//			System.out.println(ioProductService.findProductByName("BĂ¡nh bao"));
//			System.out.println(ioProductTypeService.findListProductTypeByName("NÆ°á»›c giáº£i khĂ¡t"));
			// System.out.println(ioProductService.findProductByName("Cafe"));
//			List<Product> res = ioProductService.getAllProductByProductTypeId(1);
//			System.out.println(res);
//			Staff staff = ioStaffService.findStaffById("NV001");
//			System.out.println(staff);
//			Order order = new Order(new Date(), staff);
//			ObjectId id = ioOrderService.addOrUpdateOrder(order);
//			System.out.println("IDDDD" + id);
//			System.out.println(ioProductService.getAllProduct());

//			
//			List<OrderDetail> list = new ArrayList<>();
//			list = ioOrderDetailIO.getAllOrderDetail();
//			for(OrderDetail detail : list) {
//				System.out.println("all" + detail.getQuantity());
//			}

//			List<OrderDetail> list2 = new ArrayList<>();
//			list2 = ioOrderDetailIO.getAllByOrderId(2);
//			for(OrderDetail detail : list2) {
//				System.out.println("id = 2" + detail.getQuantity());
//			}
//			List<Product> accounts = new ArrayList<>();
//			accounts = ioAccountService.get();
//			accounts = ioProductService.getAllProductByProductTypeId(1);
//			System.out.println(accounts);
//			for(Product account : accounts) {
//				System.out.println(account.getName());
//			}

//			List<ProductType> list = new ArrayList<>();
//			list = ioProductTypeService.getAllProductType();
//			System.out.println(list);
//			for(ProductType account : list) {
//				System.out.println(account.getName());
//			}

//			Account _account = ioAccountService.findAccountByUserName("NV001");
//			_account.setPassword("111111");
//			System.out.println(_account.getPassword());
//			ioAccountService.changePassWord(_account);

//			Staff _staff = ioStaffService.findStaffById("NV001");
//			_staff.setName("Name 1");
//			ioStaffService.updateStaff(_staff);
//			System.out.println(_staff.toString());
//			Staff _staff = new Staff("admin", "Võ Minh Phương", "11113", "11113", "BT", true, true, true,null);
//			Account _newAccount = new Account(_staff, "123456");
//			ioStaffService.addOrUpdateStaff(_staff);
//			ioAccountService.addAccount(_newAccount);
//			
//			ProductType _productType = ioProductTypeService.findProductTypeById(4);
//			System.out.println(_productType.toString());
//			ProductType _newProductType = new ProductType("Vit", "Troi");
//			ioProductTypeService.addProductType(_newProductType);

			// Product
//			ioOrderService.getAllOrderDateNow("2022-12-01").forEach(date -> {
//				System.out.println("date"+ date);
//			});
//			//System.out.println(ioOrderService.findOrderById("638898fef4681b3354c0fa02")); 
//			Product _product1 = ioProductService.findProductById("6388c74ff4681b1338112c21");
//			System.out.println(_product1);
//			Product _product2= ioProductService.findProductById("638878d6f4681b365c729ae6");
//			System.out.println(_product.toString());
//			Product _newProduct = new Product("Product vit troi", 20, 100000, productType);
//			ioProductService.addOrUpdateProduct(_newProduct);

//			Order _order = ioOrderService.findOrderById("63895dacf4681b14fce8006c");
//			System.out.println(_order.getDetails());
//			Staff _staff = ioStaffService.findStaffById("NV001");
//			System.out.println(_staff);
//			Order _newOrder = new Order(new Date(), _staff);
//			ioOrderService.addOrUpdateOrder(_newOrder);
//			Order _order = ioOrderService.findOrderById("638898fef4681b3354c0fa02");
//			System.out.println("_order" + _order);
//			OrderDetail detail1 = new OrderDetail(_newProduct, _newOrder, 3);
//			System.out.println("detail1"+detail1);
//			OrderDetail detail2 = new OrderDetail(_product2, _order, 3);
//			System.out.println("detail2"+detail2);
//			ioOrderDetailIO.addOrUpdateOrderDetail(detail2);
//			ioOrderDetailIO.addOrUpdateOrderDetail(detail1);
//			ioOrderService.filter("2022-11-20", "2022-12-01").forEach(date ->{
//				System.out.println("date" +date);
//			});;
//			List<OrderDetail> list = new ArrayList<>();
//			list.add(detail1);
//			list.add(detail2);
//			_order.setDetails(list);
//			ioOrderService.addOrUpdateOrder(_order);

//			ioOrderService.addOrder(_newOrder);
//			OrderDetail _orderDetail = ioOrderDetailIO.findOrderDetailById(1,1);
//			System.out.println(_orderDetail.getQuantity());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
