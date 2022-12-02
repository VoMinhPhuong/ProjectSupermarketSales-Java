package entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

import org.bson.types.ObjectId;

@Embeddable
public class OrderProductId implements Serializable {

	private static final long serialVersionUID = 1L;
	private ObjectId product;
	private ObjectId order;

	public OrderProductId(ObjectId product, ObjectId order) {
		super();
		this.product = product;
		this.order = order;
	}

	public OrderProductId() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderProductId other = (OrderProductId) obj;
		return order.equals(other.order) && product.equals(other.product) ;
	}

}
