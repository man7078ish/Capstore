package com.capgemini.capstore.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "promo")
public class Promo {
	@Id
	@Column(name = "promocode")
	@NotNull
	private String promoCode;
	@Column(name = "discountoffered")
	@NotNull
	private double discountOffered;
	@Column(name = "promovalidity")
	@NotNull
	private Date promoValidity;
	@Column(name = "softdelete")
	@NotNull
	@Pattern(regexp = "^[AI] {1}$")
	private SoftDelete softDelete;

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public double getDiscountOffered() {
		return discountOffered;
	}

	public void setDiscountOffered(double discountOffered) {
		this.discountOffered = discountOffered;
	}

	public Date getPromoValidity() {
		return promoValidity;
	}

	public void setPromoValidity(Date promoValidity) {
		this.promoValidity = promoValidity;
	}

	public SoftDelete getSoftDelete() {
		return softDelete;
	}

	public void setSoftDelete(SoftDelete softDelete) {
		this.softDelete = softDelete;
	}

}
