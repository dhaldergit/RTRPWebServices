package com.dhalder.rtrp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhalder.rtrp.model.CardType;

@Repository
public interface CardTypeRepository extends JpaRepository<CardType, Long>{

	
}
