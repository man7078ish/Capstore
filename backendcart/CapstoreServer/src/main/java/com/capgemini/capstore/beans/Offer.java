package com.capgemini.capstore.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "offer")
public class Offer {

	@Id
	@Column(name = "offerid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int offerId;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Merchant merchant;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Product product;
	@Column(name = "offerdescription")
	private String offerDescription;
	@Column(name = "offerstartdate")
	@NotNull
	private Date offerStartDate;
	@Column(name = "offerenddate")
	@NotNull
	private Date offerEndDate;
	@Column(name = "discountoffered")
	@NotNull
	private double discountOffered;
	@Column(name = "softdelete")
	@NotNull
	@Pattern(regexp = "^[AI] {1}$")
	private SoftDelete softDelete;

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public Date getOfferStartDate() {
		return offerStartDate;
	}

	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
	}

	public Date getOfferEndDate() {
		return offerEndDate;
	}

	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}

	public double getDiscountOffered() {
		return discountOffered;
	}

	public void setDiscountOffered(double discountOffered) {
		this.discountOffered = discountOffered;
	}

	public SoftDelete getSoftDelete() {
		return softDelete;
	}

	public void setSoftDelete(SoftDelete softDelete) {
		this.softDelete = softDelete;
	}

}
