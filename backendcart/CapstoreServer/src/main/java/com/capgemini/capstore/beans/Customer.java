package com.capgemini.capstore.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customerdetail")
public class Customer {

	@Id
	@Column(name = "customerid")
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	/*@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	private User user;*/
	@Column(name = "customername")
	@NotNull
	private String customerName;
	@Column(name = "email")
	@NotNull
	private String customerEmail;
	@Column(name = "mobileno")
	@NotNull
	private String customerMobileNumber;
	@Column(name = "address")
	private String customerAddress;
	@Column(name = "pincode")
	@NotNull
	private String customerPincode;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}

}
