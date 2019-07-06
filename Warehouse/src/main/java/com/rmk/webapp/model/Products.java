package com.rmk.webapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Products {
	@Id
	private int pid;
	private String pname;
	private int pquantity;
	
	@ManyToMany(cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	private List<Location> location;

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

	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}

	public Products(int pid, String pname, int pquantity, List<Location> location) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pquantity = pquantity;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", pquantity=" + pquantity + ", location=" + location
				+ "]";
	}

	
	
}
