package com.capgemini.capstore.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "merchantdetail")
public class Merchant {

	@Id
	@Column(name = "merchantid")
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int merchantId;
	/*@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	private User user;*/
	@Column(name = "merchantname")
	@NotNull
	private String merchantName;
	@Column(name = "email")
	@NotNull
	private String merchantEmail;
	@Column(name = "mobileno")
	@NotNull
	private String merchantMobileNumber;
	@Column(name = "address")
	private String merchantAddress;
	@Column(name = "storename")
	private String merchantStoreName;
	
    
	 /*public Merchant() {
			this.merchantId= 100;
		}*/
	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantEmail() {
		return merchantEmail;
	}

	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}

	public String getMerchantMobileNumber() {
		return merchantMobileNumber;
	}

	public void setMerchantMobileNumber(String merchantMobileNumber) {
		this.merchantMobileNumber = merchantMobileNumber;
	}


	public String getMerchantAddress() {
		return merchantAddress;
	}

	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public String getMerchantStoreName() {
		return merchantStoreName;
	}

	public void setMerchantStoreName(String merchantStoreName) {
		this.merchantStoreName = merchantStoreName;
	}

}
