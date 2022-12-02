package service;

import java.rmi.Remote;
import java.util.List;

import org.bson.types.ObjectId;

import entity.Order;

public interface IOrderService extends Remote {
	public List<Order> getAllOrder() throws Exception;

	public Order findOrderById(String id) throws Exception;

	public ObjectId addOrUpdateOrder(Order order) throws Exception;

	public List<Order> filter(String dateStart, String dateEnd) throws Exception;
	
	public List<Order> getAllOrderDateNow(String dateNow) throws Exception;
}
