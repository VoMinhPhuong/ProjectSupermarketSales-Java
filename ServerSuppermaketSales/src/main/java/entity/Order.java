package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.persistence.*;

import org.bson.types.ObjectId;
import org.hibernate.mapping.Set;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "order_id")
	private ObjectId id;

	@Column(name = "order_date", nullable = false)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "staff_id", referencedColumnName = "staff_id")
	private Staff staff;
	
	
//	@OneToMany(mappedBy = "order",fetch = FetchType.LAZY)
//	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	
	@ElementCollection(fetch = FetchType.EAGER)
//	@OneToMany(mappedBy = "order", targetEntity = OrderDetail.class)
//	@CollectionTable(name = "order_details", joinColumns = @JoinColumn(name = "order"))
	private List<OrderDetail> details;

	public Order(Date date, Staff staff) {
		super();
		this.date = date;
		this.staff = staff;
	}

	public Order() {
		super();
	}

	public double getTotal() {
		double total = 0;
		System.out.println("details" +details);
		for (OrderDetail orderDetail : details) {
			System.out.println("orderDetail.getTotalOrderDetail()"+orderDetail.getTotalOrderDetail());
			total += orderDetail.getTotalOrderDetail();
		}
		System.out.println("total"+total);
		return total;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public List<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", staff=" + staff + ", details=" + details + "]";
	}

	

}
