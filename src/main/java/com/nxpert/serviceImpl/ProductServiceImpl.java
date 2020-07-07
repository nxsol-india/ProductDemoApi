package com.nxpert.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nxpert.entity.Product;
import com.nxpert.entity.Tax;
import com.nxpert.repository.ProductRepository;
import com.nxpert.service.BasicService;
import com.nxpert.service.ProductService;
import com.nxpert.service.TaxService;

@Service
public class ProductServiceImpl extends BasicService<Product, ProductRepository> implements ProductService{

	
	@Autowired
	TaxService taxService;
	
	@Override
	public Product findByProductAndCountry(Long productId, Long countryId) throws Exception {
	
		// findybyId get Product if no found then throw Exception
		Optional<Product>  productOptional= findById(productId);
		if(!productOptional.isPresent()) {
			throw new Exception("Product Not Found");
		}
		Product product = productOptional.get();
		
		// findByCountryId get Country Wise tax
		Tax tax = taxService.findByCountryId(countryId);
		
		
		//we calculate discount using price
		Long countDiscount = 0l;
		if(product.getDiscount() != 0) {
			countDiscount = product.getPrice()*product.getDiscount()/100;
		}
		
		
		//check tax is not null
		if(tax != null) {
			Long countTax = 0l;
			
			// checked tax ExclusiveTax is not zero and calculate tax using price
			if(tax.getExclusiveTax() != 0) {
				countTax = product.getPrice()*tax.getExclusiveTax()/100;	
			}
			
			// set calculate tax in to responce and calculate discount.
			product.setFinalAfterTaxPrice(product.getPrice()+countTax-countDiscount);
		}else {
			
			// if tax is null then we calculate price using discount
			product.setFinalAfterTaxPrice(product.getPrice()-countDiscount);
		}
		
		return product;
	}
		
}