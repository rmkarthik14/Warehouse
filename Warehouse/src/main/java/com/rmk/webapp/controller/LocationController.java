package com.rmk.webapp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rmk.webapp.dao.LocationRepo;
import com.rmk.webapp.dao.ProdRepo;
import com.rmk.webapp.model.Location;
import com.rmk.webapp.model.Products;

@Controller
public class LocationController {
	
	@Autowired
	private LocationRepo repo;
	private ProdRepo prodRepo;

	@RequestMapping("/location")
	public String location() {
		return "addLocation.jsp";
	}
	
	@RequestMapping("/addLocation")
	public String addLocation(Location location) {
		repo.save(location);
		return "addLocation.jsp";
	}
	
	@RequestMapping("/addProductLocation")
	public String addProductLocation(@RequestParam int lid, int pid) {
		Products products = new Products();
		products.setPid(pid);
		
		Location location = repo.findById(lid).orElse(new Location());
		location.setLid(lid);
		location.getProducts().add(products);
		repo.save(location);
		return "addLocation.jsp";
	}
	
	@RequestMapping("/getLocationProd")
	public ModelAndView getLocationProd(@RequestParam int lid) {
		ModelAndView mv = new ModelAndView("addLocation.jsp");
		Location location = repo.findById(lid).orElse(new Location());
		List<Products> product = location.getProducts();
		List<Object> obj = new ArrayList<>();
		List<Location> locationList = new ArrayList<>();
		obj.add(location);
		obj.add(product);
		locationList.add(location);
		mv.addObject(locationList);
		return mv;
	}
}

*/@RequestMapping("/addProductLocation")
	public String addProductLocation(@RequestParam int lid, int pid) {
		Products products = new Products();
		products.setPid(pid);
		
		Location location = repo.findById(lid).orElse(new Location());
		location.setLid(lid);
		location.getProducts().add(products);
		repo.save(location);
		return "addLocation.jsp";
	}*/
