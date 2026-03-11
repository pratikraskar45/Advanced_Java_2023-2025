package cascade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  //DB
public class Aadhar {
	@Id //id as a F key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id is a auto generated
	//attribute for Aadhar1
	private int id;
	private String name;
	private String address;
	
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	//toString method
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
