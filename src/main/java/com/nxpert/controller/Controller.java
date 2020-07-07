package com.nxpert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nxpert.entity.Country;
import com.nxpert.entity.Product;
import com.nxpert.service.CountryService;
import com.nxpert.service.ProductService;

@RestController
@CrossOrigin("*")
public class Controller {

	@Autowired
	ProductService productService;
	
	@Autowired
	CountryService countryService;
	
	@GetMapping("/product/{productId}/{countryId}")
	public Product getProduct(@PathVariable("productId") Long productId,@PathVariable("countryId") Long countryId) throws Exception {
		return productService.findByProductAndCountry(productId,countryId);
	}
	
	@GetMapping("/country")
	public List<Country> findAllCountry() throws Exception {
		return countryService.findAll();
	}
}