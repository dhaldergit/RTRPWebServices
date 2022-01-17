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
public class ConversionRule implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8984528374205950016L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long conversionId;
	private Long conversionVersion;
	private Long cardTypeId;
	private String cardType;
	private Double unitBlock;
	private Double reward;
	private String fractionAllowed;
	
	private Date entryDate;
	private Date effectiveDate;
	
	
	
	public ConversionRule() {
		super();
	}



	public ConversionRule(Long conversionId, Long conversionVersion, Long cardTypeId, String cardType, Double unitBlock,
			Double reward, String fractionAllowed, Date entryDate, Date effectiveDate) {
		super();
		this.conversionId = conversionId;
		this.conversionVersion = conversionVersion;
		this.cardTypeId = cardTypeId;
		this.cardType = cardType;
		this.unitBlock = unitBlock;
		this.reward = reward;
		this.fractionAllowed = fractionAllowed;
		this.entryDate = entryDate;
		this.effectiveDate = effectiveDate;
	}



	public Long getConversionId() {
		return conversionId;
	}



	public void setConversionId(Long conversionId) {
		this.conversionId = conversionId;
	}



	public Long getConversionVersion() {
		return conversionVersion;
	}



	public void setConversionVersion(Long conversionVersion) {
		this.conversionVersion = conversionVersion;
	}



	public Long getCardTypeId() {
		return cardTypeId;
	}



	public void setCardTypeId(Long cardTypeId) {
		this.cardTypeId = cardTypeId;
	}



	public String getCardType() {
		return cardType;
	}



	public void setCardType(String cardType) {
		this.cardType = cardType;
	}



	public Double getUnitBlock() {
		return unitBlock;
	}



	public void setUnitBlock(Double unitBlock) {
		this.unitBlock = unitBlock;
	}



	public Double getReward() {
		return reward;
	}



	public void setReward(Double reward) {
		this.reward = reward;
	}



	public String getFractionAllowed() {
		return fractionAllowed;
	}



	public void setFractionAllowed(String fractionAllowed) {
		this.fractionAllowed = fractionAllowed;
	}



	public Date getEntryDate() {
		return entryDate;
	}



	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}



	public Date getEffectiveDate() {
		return effectiveDate;
	}



	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}



	@Override
	public String toString() {
		return "ConversionRule [conversionId=" + conversionId + ", conversionVersion=" + conversionVersion
				+ ", cardTypeId=" + cardTypeId + ", cardType=" + cardType + ", unitBlock=" + unitBlock + ", reward="
				+ reward + ", fractionAllowed=" + fractionAllowed + ", entryDate=" + entryDate + ", effectiveDate="
				+ effectiveDate + "]";
	}


 
	
	
	
	
}
