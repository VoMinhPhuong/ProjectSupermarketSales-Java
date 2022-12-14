package service;

import java.rmi.Remote;
import java.util.List;

import org.bson.types.ObjectId;

import entity.ProductType;

public interface IProductTypeService extends Remote {
	public List<ProductType> getAllProductType() throws Exception;

	public ProductType findProductTypeById(String id) throws Exception;
	
	public List<ProductType> findListProductTypeByName(String name) throws Exception;

	public boolean addOrUpdateProductType(ProductType productType) throws Exception;

	public boolean deleteProductType(ProductType productType) throws Exception;
}
