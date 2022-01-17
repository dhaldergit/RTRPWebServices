package com.dhalder.rtrp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhalder.rtrp.model.TransactionUnit;
import com.dhalder.rtrp.services.RewardServices;

@RestController
public class RTRPComputeRewardController {
	@Autowired
	private RewardServices rewardServices;

	@PutMapping("/storeTransaction")
	public ResponseEntity<HttpStatus> storeTransaction(@RequestBody TransactionUnit transactionUnit) {

		try {
			rewardServices.storeTransaction(transactionUnit);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/transactions/{month}")
	public ResponseEntity<List<TransactionUnit>> getStoreTransactions(@PathVariable String month) {
		
		List<TransactionUnit> transactions = new ArrayList<>();
		try {
			transactions= rewardServices.getTransactions(month);
		} catch (Exception e) {
			e.printStackTrace();
			return  new ResponseEntity<List<TransactionUnit>>(transactions, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<List<TransactionUnit>>(transactions, HttpStatus.OK);
	}

	@PutMapping("/storeTransaction/{month}")
	public ResponseEntity<HttpStatus> storeTransaction(@RequestBody TransactionUnit transactionUnit,
			@PathVariable String month) {

		try {
			rewardServices.storeTransaction(transactionUnit, month);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
	}
}
