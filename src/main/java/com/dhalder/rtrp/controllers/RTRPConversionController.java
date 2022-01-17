package com.dhalder.rtrp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhalder.rtrp.model.ConversionRule;
import com.dhalder.rtrp.services.ConversionServices;

@RestController
@CrossOrigin
public class RTRPConversionController {

	@Autowired
	private ConversionServices conversionServices;

	@GetMapping("/conversionrules")
	public ResponseEntity<List<ConversionRule>> conversionrules() {
		List<ConversionRule> conversionrules = new ArrayList<>();
		try {
			conversionrules = conversionServices.getConversionrules();
		} catch (Exception e) {

			e.printStackTrace();
			return new ResponseEntity<List<ConversionRule>>(conversionrules,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<List<ConversionRule>>(conversionrules, HttpStatus.OK);
	}

	@GetMapping("/conversionrules/{cardType}")
	public ResponseEntity<List<ConversionRule>> conversionrulesbyCardType(@PathVariable String cardType) {

		List<ConversionRule> conversionrulesbyCardType = new ArrayList<>();
		try {
			conversionrulesbyCardType = conversionServices.conversionrulesbyCardType(cardType);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<ConversionRule>>(conversionrulesbyCardType,
					HttpStatus.INTERNAL_SERVER_ERROR);

		}
		return new ResponseEntity<List<ConversionRule>>(conversionrulesbyCardType, HttpStatus.OK);
	}

	@GetMapping("/conversionrules/{cardType}/{version}")
	public ResponseEntity<List<ConversionRule>> conversionrulesbyCardTypeVersion(@PathVariable String cardType,
			@PathVariable String version) {

		List<ConversionRule> conversionrulesbyCardType = new ArrayList<>();
		try {
			conversionrulesbyCardType = conversionServices.conversionrulesbyCardType(cardType, version);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<ConversionRule>>(conversionrulesbyCardType,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<List<ConversionRule>>(conversionrulesbyCardType, HttpStatus.OK);
	}

	@PostMapping("/conversionrules")
	public ResponseEntity<HttpStatus> createConversionrules(@RequestBody ConversionRule rule) {

		try {
			conversionServices.createConversionrules(rule);
		} catch (Exception e) {

			e.printStackTrace();
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}

	@PutMapping("/conversionrules")
	public ResponseEntity<HttpStatus> updateConversionrules(@RequestBody ConversionRule rule) {

		try {
			conversionServices.updateConversionrules(rule);
		} catch (Exception e) {

			e.printStackTrace();
			return new ResponseEntity<HttpStatus>(HttpStatus.EXPECTATION_FAILED);
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
	}
}
