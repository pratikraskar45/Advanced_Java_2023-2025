package spring_core;

public class Employee {
	
	private String name;
	private double fees;
	//generate constructor using filds alt_shift+s and select 
	public Employee(String name, double fees) {
		super();
		this.name = name;
		this.fees = fees;
	}
	//generate toString method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", fees=" + fees + "]";
	}
	
	
}
