package com.rmk.webapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rmk.webapp.dao.PoRepo;
import com.rmk.webapp.dao.RestPo;
import com.rmk.webapp.model.Products;
import com.rmk.webapp.model.PurchaseOrder;
import com.rmk.webapp.service.PoService;

@RestController
public class PoController {
	
	@Autowired
	private PoService poService;
	
	@Autowired
	RestPo restPo;
	
	@RequestMapping("/po")
	public String po() {
		return "PurchaseOrder.jsp";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/product/{prodId}/purchaseOrder")
	public void createPo(@RequestBody PurchaseOrder purchaseOrder, @RequestParam int prodId) {
		purchaseOrder.setPid(new Products(prodId," ",0,null));
		poService.savePo(purchaseOrder);
	}
	
	@RequestMapping("/purchaseOrder/view/{poid}")
	@ResponseBody
	public Optional<PurchaseOrder> viewLocation(@PathVariable("poid") int poid) {
		return poService.getLocation(poid);
	}
	
}
