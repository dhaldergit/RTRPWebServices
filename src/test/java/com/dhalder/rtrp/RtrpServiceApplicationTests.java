package com.dhalder.rtrp;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dhalder.rtrp.controllers.RTRPComputeRewardController;
import com.dhalder.rtrp.model.TransactionUnit;

@SpringBootTest
class RtrpServiceApplicationTests {

	@Autowired
	private RTRPComputeRewardController controller;
	@Test
	void contextLoads() {
		
	}

	@Test
	void conversionrulesTest() {
		TransactionUnit transactionUnit= new TransactionUnit(new Date(), new Date(), "Black Card- Super", "Online Purchase", 
							1200.50d, "####99998888", 4L, 8.00d, "Processed", 0, null);
		controller.storeTransaction(transactionUnit);
	}
}
