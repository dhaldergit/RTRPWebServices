package com.dhalder.rtrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dhalder.rtrp.model.ConversionRule;

@Repository
public interface ConversionRepository extends JpaRepository<ConversionRule, Long>{
	
	@Query(value = "SELECT u FROM Conversion_Rule u, CARD_TYPE c   where c.card_Type_Id=u.card_Type_Id and  u.card_Type=?" , nativeQuery = true)
	List<ConversionRule> conversionrulesbyCardType(String cardType);

	@Query(value = "SELECT u FROM Conversion_Rule u where u.card_Type_Id=? and version=?" , nativeQuery = true)
	List<ConversionRule> conversionrulesbyCardType(String cardType, String version);

}
