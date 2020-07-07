package com.nxpert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nxpert.entity.Tax;

@Repository
public interface TaxRepository extends JpaRepository<Tax, Long>, JpaSpecificationExecutor<Tax>{

	@Query(value = "select tx from Tax tx where tx.countryId.id = ?1")
	Tax findByCountryId(Long countryId) throws Exception;

}
