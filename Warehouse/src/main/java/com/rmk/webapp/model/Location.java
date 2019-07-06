package com.rmk.webapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Location {
	@Id
	private int lid;
	
	@ManyToMany(cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	private List<Products> products;
	
	public Location() {}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public Location(int lid, List<Products> products) {
		super();
		this.lid = lid;
		this.products = products;
	}

	@Override
	public String toString() {
		return "Location [lid=" + lid + ", products=" + products + "]";
	}
	
	
}