package com.rmk.webapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Location {
	@Id
	private int lid;
	
	@ManyToOne (fetch = FetchType.LAZY)
	private Products products;
	
	public Location() {}
	
	public Location(int lid, Products products) {
		this.lid = lid;
		this.products = products;
	}

	public int getLid() {
		return lid;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	@Override
	public String toString() {
		return "Location [lid=" + lid + ", products=" + products + "]";
	}
}