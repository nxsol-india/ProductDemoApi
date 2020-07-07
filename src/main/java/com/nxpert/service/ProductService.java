package com.nxpert.service;

import com.nxpert.entity.Product;

public interface ProductService extends IFinder<Product> , IService<Product>{

	Product findByProductAndCountry(Long productId, Long countryId) throws Exception;

	
		
}