package com.nxpert.serviceImpl;

import org.springframework.stereotype.Service;

import com.nxpert.entity.Tax;
import com.nxpert.repository.TaxRepository;
import com.nxpert.service.BasicService;
import com.nxpert.service.TaxService;

@Service
public class TaxServiceImpl extends BasicService<Tax, TaxRepository> implements TaxService{

	@Override
	public Tax findByCountryId(Long countryId) throws Exception {
		// TODO Auto-generated method stub
		return repository.findByCountryId(countryId);
	}

			
}