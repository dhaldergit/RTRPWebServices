package com.dhalder.rtrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhalder.rtrp.model.TransactionUnit;
import com.dhalder.rtrp.repository.RewardRepository;

@Service
public class RewardServices {

	@Autowired
	private RewardRepository rewardRepository;

	public void storeTransaction(TransactionUnit transactionUnit, String month) throws Exception {

		List<TransactionUnit> monthlyTransactions = rewardRepository.getTransactionsByMonth(month);

		monthlyTransactions.forEach(t -> {
			rewardRepository.save(t);
		});

	}

	public void storeTransaction(TransactionUnit transactionUnit) throws Exception {
		rewardRepository.save(transactionUnit);
	}

	public List<TransactionUnit> getTransactions(String month) throws Exception {

		return rewardRepository.getTransactionsByMonth(month);
	}
}
