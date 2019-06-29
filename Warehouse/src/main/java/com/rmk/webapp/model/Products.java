package com.rmk.webapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Products {
	@Id
	private int pid;
	private String pname;
	private int pquantity;
	

	public Products() {}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getPquantity() {
		return pquantity;
	}


	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}


	public Products(int pid, String pname, int pquantity) {
		this.pid = pid;
		this.pname = pname;
		this.pquantity = pquantity;
	}


	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", pquantity=" + pquantity + "]";
	}
		
	
	

}
