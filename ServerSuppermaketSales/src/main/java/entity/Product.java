package entity;

import java.io.Serializable;

import javax.persistence.*;

import org.bson.types.ObjectId;


@Entity
@Table(name = "products")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "product_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId id;

	@Column(nullable = false, columnDefinition = "nvarchar(255)")
	private String name;

	@Column(nullable = false)
	private int number;

	@Column(nullable = false)
	private double price;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "product_type_id")
	private ProductType type;

	@Column(name = "selling")
	private boolean isSelling;

	public Product(String name, int number, double price, ProductType type) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
		this.type = type;
		this.isSelling = true;
	}

	public Product() {
		super();
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public boolean isSelling() {
		return isSelling;
	}

	public void setSelling(boolean isSelling) {
		this.isSelling = isSelling;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", number=" + number + ", price=" + price + ", type=" + type
				+ "]";
	}
}
