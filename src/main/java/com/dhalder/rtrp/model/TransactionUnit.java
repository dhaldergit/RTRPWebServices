package com.dhalder.rtrp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TransactionUnit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7400342960465501072L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionId; // from DB Auto generated
	private Date processDate; // from DB Sysdate
	private Date transactionDate; // from file
	private String description; // from file
	private String category; // from file
	private Double amount; // from file
	private String cardNumber; // from file

	private Long cardTypeId; // from DB using SQL join inside producer component 

	private Double rewardPoints;
	private String status; // from DB I (INITIAL), P-PROCESSED
	private long errorCode; // error code if any will be populated by Consumers
	private String errorMsg; // error message if any will be populated by Consumers

	public TransactionUnit() {

	}

	public TransactionUnit(Date processDate, Date transactionDate, String description, String category, Double amount,
			String cardNumber, Long cardTypeId, Double rewardPoints, String status, long errorCode, String errorMsg) {
		super();
		this.processDate = processDate;
		this.transactionDate = transactionDate;
		this.description = description;
		this.category = category;
		this.amount = amount;
		this.cardNumber = cardNumber;
		this.cardTypeId = cardTypeId;
		this.rewardPoints = rewardPoints;
		this.status = status;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Long getCardTypeId() {
		return cardTypeId;
	}

	public void setCardTypeId(Long cardTypeId) {
		this.cardTypeId = cardTypeId;
	}

	public Double getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(Double rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "TransactionUnit [transactionId=" + transactionId + ", processDate=" + processDate + ", transactionDate="
				+ transactionDate + ", description=" + description + ", category=" + category + ", amount=" + amount
				+ ", cardNumber=" + cardNumber + ", cardTypeId=" + cardTypeId + ", rewardPoints=" + rewardPoints
				+ ", status=" + status + ", errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}

	
}
