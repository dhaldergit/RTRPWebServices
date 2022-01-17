package com.dhalder.rtrp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CardType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cardtypeId;
	
	private String name;
	private String Description;
	
	private Long portfolioId;
	
	private String isActive;

	public CardType(Long cardtypeId, String name, String description, Long portfolioId, String isActive) {
		super();
		this.cardtypeId = cardtypeId;
		this.name = name;
		Description = description;
		this.portfolioId = portfolioId;
		this.isActive = isActive;
	}

	public CardType() {
		super();
	}

	public Long getCardtypeId() {
		return cardtypeId;
	}

	public void setCardtypeId(Long cardtypeId) {
		this.cardtypeId = cardtypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	
	
	
}
