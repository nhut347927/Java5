package com.fpoly.thainv.entities;
// Generated Jun 6, 2024, 12:44:43 AM by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * Coupons generated by hbm2java
 */
@Entity
@Table(name = "coupons", schema = "dbo", catalog = "TMDT")
public class Coupons implements java.io.Serializable {

	private Integer couponId;
	private String couponCode;
	private BigDecimal discountPercent;
	private Date startDate;
	private Date endDate;
	private Set<ProductCoupons> productCouponses = new HashSet<ProductCoupons>(0);
	private Set<Orders> orderses = new HashSet<Orders>(0);

	public Coupons() {
	}

	public Coupons(String couponCode, BigDecimal discountPercent, Date startDate, Date endDate) {
		this.couponCode = couponCode;
		this.discountPercent = discountPercent;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Coupons(String couponCode, BigDecimal discountPercent, Date startDate, Date endDate,
			Set<ProductCoupons> productCouponses, Set<Orders> orderses) {
		this.couponCode = couponCode;
		this.discountPercent = discountPercent;
		this.startDate = startDate;
		this.endDate = endDate;
		this.productCouponses = productCouponses;
		this.orderses = orderses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "coupon_id", unique = true, nullable = false)
	public Integer getCouponId() {
		return this.couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	@Column(name = "coupon_code", nullable = false, length = 50)
	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	@Column(name = "discount_percent", nullable = false, precision = 5)
	public BigDecimal getDiscountPercent() {
		return this.discountPercent;
	}

	public void setDiscountPercent(BigDecimal discountPercent) {
		this.discountPercent = discountPercent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "start_date", nullable = false, length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date", nullable = false, length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coupons")
	public Set<ProductCoupons> getProductCouponses() {
		return this.productCouponses;
	}

	public void setProductCouponses(Set<ProductCoupons> productCouponses) {
		this.productCouponses = productCouponses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coupons")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

}
