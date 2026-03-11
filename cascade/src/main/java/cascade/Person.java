package cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity //DB
public class Person {
	@Id //ID as a F key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id is auto generated 
	//attribute for person
	private int id;
	private String name;
	private long phone;
	//Aadhar1 class reference
	@OneToOne (cascade = CascadeType.ALL,fetch = FetchType.EAGER )// all is used for 1-persist2-merge3-remove  //fetching the data use feching
	private Aadhar aadhar;

	//getters and setters for all attribute also aadhar class
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	//toString method  for eager
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", aadhar=" + aadhar + "]"; //if you want get details both side dont remove aadhar
	}

	//toString method lazy
	
	
//	@Override  
	
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]"; //remove addhar is only fetching  lazy only details person
//	}
	
	
	

}
