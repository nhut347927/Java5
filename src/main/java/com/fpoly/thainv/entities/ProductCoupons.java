package com.fpoly.thainv.entities;
// Generated Jun 6, 2024, 12:44:43 AM by Hibernate Tools 4.3.6.Final

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * ProductCoupons generated by hbm2java
 */
@Entity
@Table(name = "product_coupons", schema = "dbo", catalog = "TMDT")
public class ProductCoupons implements java.io.Serializable {

	private Integer prdCoupId;
	private Coupons coupons;
	private Products products;

	public ProductCoupons() {
	}

	public ProductCoupons(Coupons coupons, Products products) {
		this.coupons = coupons;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "prd_coup_id", unique = true, nullable = false)
	public Integer getPrdCoupId() {
		return this.prdCoupId;
	}

	public void setPrdCoupId(Integer prdCoupId) {
		this.prdCoupId = prdCoupId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coupon_id")
	public Coupons getCoupons() {
		return this.coupons;
	}

	public void setCoupons(Coupons coupons) {
		this.coupons = coupons;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

}
