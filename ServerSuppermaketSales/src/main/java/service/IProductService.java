package service;

import java.rmi.Remote;
import java.util.List;

import entity.Product;

public interface IProductService extends Remote {
	public List<Product> getAllProduct() throws Exception;

	public List<Product> getAllProductByProductTypeId(String product_type_id) throws Exception;

	public Product findProductById(String id) throws Exception;
	
	public Product findProductByName(String name) throws Exception;
	
	public boolean addOrUpdateProduct(Product product) throws Exception;

	public boolean deleteProduct(String productId) throws Exception;
}
