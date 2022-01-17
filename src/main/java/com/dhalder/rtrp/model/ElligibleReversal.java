package com.dhalder.rtrp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ElligibleReversal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1695447402553496139L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transaction_type;
	
	private String typeName;
	
	private String description;

	public ElligibleReversal() {
		super();
	}

	public ElligibleReversal(Long transaction_type, String typeName, String description) {
		super();
		this.transaction_type = transaction_type;
		this.typeName = typeName;
		this.description = description;
	}

	public Long getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(Long transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ElligibleReversal [transaction_type=" + transaction_type + ", typeName=" + typeName + ", description="
				+ description + "]";
	}

	 
	
	
	
	
	
	
}
