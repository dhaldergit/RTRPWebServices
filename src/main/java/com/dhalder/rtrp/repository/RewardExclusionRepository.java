package com.dhalder.rtrp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhalder.rtrp.model.RewardExclusion;

@Repository
public interface RewardExclusionRepository extends JpaRepository<RewardExclusion, Long>{

	
}
