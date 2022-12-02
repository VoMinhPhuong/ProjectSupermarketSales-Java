package entity;

import java.io.Serializable;

import javax.persistence.*;

import org.bson.types.ObjectId;

@Entity
@Table(name = "product_types")
public class ProductType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "product_type_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId id;

	@Column(name = "type_name", nullable = false, columnDefinition = "nvarchar(255)")
	private String name;

	@Column(nullable = false, columnDefinition = "nvarchar(255)")
	private String unit;

	@Column(name = "selling")
	private boolean isSelling;

	public ProductType(String name, String unit) {
		super();
		this.name = name;
		this.unit = unit;
		this.isSelling = true;
	}

	public ProductType() {
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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public boolean isSelling() {
		return isSelling;
	}

	public void setSelling(boolean isSelling) {
		this.isSelling = isSelling;
	}

	@Override
	public String toString() {
		return "ProductType [id=" + id + ", name=" + name + ", unit=" + unit + ", isSelling=" + isSelling + "]";
	}

}
