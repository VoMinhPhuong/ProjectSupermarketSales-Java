package entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String password;

	@Id
	@OneToOne
	@MapsId
	@JoinColumn(name = "username")
	private Staff staff;

	public Account(Staff username, String password) {
		super();
		this.password = password;
		this.staff = username;
	}

	public Account() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Account [password=" + password + ", staff=" + staff + "]";
	}
}
