package com.dhalder.rtrp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RewardExclusion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5582293313822169556L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String shrtDesc;
	
	private String description;

	public RewardExclusion() {
		super();
	}

	public RewardExclusion(Long id, String shrtDesc, String description) {
		super();
		this.id = id;
		this.shrtDesc = shrtDesc;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShrtDesc() {
		return shrtDesc;
	}

	public void setShrtDesc(String shrtDesc) {
		this.shrtDesc = shrtDesc;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RewardExclusion [id=" + id + ", shrtDesc=" + shrtDesc + ", description=" + description + "]";
	}
	
	
	
	
	
	
	
}
