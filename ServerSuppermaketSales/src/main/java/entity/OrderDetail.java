package entity;

import java.io.Serializable;

import javax.persistence.*;

import org.bson.types.ObjectId;

@Entity
@Table(name = "order_details")
@IdClass(OrderProductId.class)
public class OrderDetail implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@Column(nullable = false)
	private Integer quantity;

	public OrderDetail(Product product, Order order, int quantity) {
		super();
		this.product = product;
		this.order = order;
		this.quantity = quantity;
	}

	public OrderDetail() {
		super();
	}

	public double getTotalOrderDetail() {
		return quantity * product.getPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderDetail [product=" + product + ", order=" + order + ", quantity=" + quantity + "]";
	}

}
