package com.rmk.webapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PurchaseOrder {
	@Id
	private int poid;
	private int quantity;
	private String PoStatus;
	@ManyToOne
	private Products pid;
	
	
	
	public PurchaseOrder(int poid, int quantity, String poStatus, Products pid) {
		super();
		this.poid = poid;
		this.quantity = quantity;
		PoStatus = poStatus;
		this.pid = pid;
	}
	
	public int getPoid() {
		return poid;
	}
	public void setPoid(int poid) {
		this.poid = poid;
	}
	public Products getPid() {
		return pid;
	}
	public void setPid(Products pid) {
		this.pid = pid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPoStatus() {
		return PoStatus;
	}
	public void setPoStatus(String poStatus) {
		PoStatus = poStatus;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [poid=" + poid + ", pid=" + pid + ", quantity=" + quantity + ", PoStatus=" + PoStatus
				+ "]";
	}
	
	
	
}
