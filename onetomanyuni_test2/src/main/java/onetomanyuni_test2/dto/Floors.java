package onetomanyuni_test2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Floors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String fname;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Floors [fid=" + fid + ", fname=" + fname + "]";
	}
	
	
	
	

}
