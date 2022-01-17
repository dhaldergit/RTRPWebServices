package com.dhalder.rtrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhalder.rtrp.model.ConversionRule;
import com.dhalder.rtrp.repository.ConversionRepository;

@Service
public class ConversionServices {
	@Autowired
	private ConversionRepository conversionRepository; 
	
	
	public List<ConversionRule> getConversionrules()  throws Exception {

		return conversionRepository.findAll();
		
		  
	}


	public List<ConversionRule> conversionrulesbyCardType(String cardType)  throws Exception  {
		return conversionRepository.conversionrulesbyCardType(cardType);
	}


	public List<ConversionRule> conversionrulesbyCardType(String cardType, String version)  throws Exception  {
		return conversionRepository.conversionrulesbyCardType(cardType, version);
	}


	public ConversionRule createConversionrules(ConversionRule rule)  throws Exception {
	 
		return conversionRepository.save(rule );
	}


	public ConversionRule updateConversionrules(ConversionRule rule) throws Exception {
		return conversionRepository.save(rule );
	}

}
