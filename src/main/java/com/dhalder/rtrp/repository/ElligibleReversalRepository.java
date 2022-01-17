package com.dhalder.rtrp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhalder.rtrp.model.ElligibleReversal;

@Repository
public interface ElligibleReversalRepository extends JpaRepository<ElligibleReversal, Long>{

	
}
