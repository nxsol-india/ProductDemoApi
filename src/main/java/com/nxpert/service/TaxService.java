package com.nxpert.service;

import com.nxpert.entity.Tax;

public interface TaxService extends IFinder<Tax> , IService<Tax>{

	Tax findByCountryId(Long countryId) throws Exception;

	
		
}