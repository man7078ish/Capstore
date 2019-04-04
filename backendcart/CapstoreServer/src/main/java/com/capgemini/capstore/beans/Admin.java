package com.capgemini.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "admindetail")
public class Admin {

	@Id
	@Column(name = "adminid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int adminId;
	@Column(name = "adminname")
	@NotNull
	private String adminName;
	@Column(name = "email")
	@NotNull
	private String adminEmail;
	@Column(name = "mobileno")
	@NotNull
	private String adminMobileNumber;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminMobileNumber() {
		return adminMobileNumber;
	}

	public void setAdminMobileNumber(String adminMobileNumber) {
		this.adminMobileNumber = adminMobileNumber;
	}

}
