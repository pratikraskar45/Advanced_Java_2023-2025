package spring_core;

public class Gurukul implements School{
	private double fees;

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	public void name() {
		System.out.println("gurukul is called");
		
	}

}
