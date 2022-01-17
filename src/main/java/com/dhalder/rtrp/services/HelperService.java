package com.dhalder.rtrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhalder.rtrp.model.CardType;
import com.dhalder.rtrp.model.ElligibleReversal;
import com.dhalder.rtrp.model.RewardExclusion;
import com.dhalder.rtrp.repository.CardTypeRepository;
import com.dhalder.rtrp.repository.ElligibleReversalRepository;
import com.dhalder.rtrp.repository.RewardExclusionRepository;

@Service
public class HelperService {

	
	@Autowired
	private CardTypeRepository cardTypeRepository;
	
	@Autowired
	private RewardExclusionRepository exclusionRepository;
	
	@Autowired
	private ElligibleReversalRepository reversalRepository;
	
	public List<CardType> getAllCardTypes() {
	 
		return cardTypeRepository.findAll();
		

	}
	
	
	public List<ElligibleReversal> getElligibleReversals() {
		 
		return reversalRepository.findAll();
		

	}
	
	
	public List<RewardExclusion> getRewardExclusions() {
		 
		return exclusionRepository.findAll();
		

	}
}
