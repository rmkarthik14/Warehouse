package com.rmk.webapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.rmk.webapp.dao.PoRepo;
import com.rmk.webapp.dao.RestPo;
import com.rmk.webapp.model.PurchaseOrder;

@Service
public class PoService {
	
	@Autowired
	PoRepo restPo;
	
	public void savePo(PurchaseOrder purchaseOrder) {
		restPo.save(purchaseOrder);
	}
	
	public Optional<PurchaseOrder> getLocation(@PathVariable("poid") int poid) {
		return restPo.findById(poid);
	}
	
}
