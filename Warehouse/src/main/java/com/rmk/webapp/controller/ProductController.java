package com.rmk.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rmk.webapp.dao.ProdRepo;
import com.rmk.webapp.model.Products;

@Controller
public class ProductController {
	@Autowired
	ProdRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/products")
	public String products() {
		return "addProducts.jsp";
	}
	
	@RequestMapping("/addProducts")
	public String addProducts(Products products) {
		repo.save(products);
		return "addProducts.jsp";
	}
	
	@RequestMapping("/deleteProducts")
	public String deleteProducts(@RequestParam int pid) {
		repo.deleteById(pid);
		return "addProducts.jsp";
	}
	
	@RequestMapping("/viewProducts")
	public ModelAndView viewProducts(@RequestParam int pid) {
		ModelAndView mv = new ModelAndView("ProductDisplay.jsp");
		Products products = repo.findById(pid).orElse(new Products());
		mv.addObject(products);
		return mv;
	}
}
