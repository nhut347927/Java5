package com.fpoly.thainv.entities;
// Generated Jun 6, 2024, 12:44:43 AM by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * OrderDetails generated by hbm2java
 */
@Entity
@Table(name = "order_details", schema = "dbo", catalog = "TMDT")
public class OrderDetails implements java.io.Serializable {

	private Integer orderDetailId;
	private Orders orders;
	private Products products;
	private int quantity;
	private BigDecimal unitPrice;
	private Integer sizeId;
	private Integer colorId;
	private Attributes size;
	private Attributes color;

	public OrderDetails() {
	}

	public OrderDetails(int quantity, BigDecimal unitPrice) {
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public OrderDetails(Orders orders, Products products, int quantity, BigDecimal unitPrice) {
		this.orders = orders;
		this.products = products;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "order_detail_id", unique = true, nullable = false)
	public Integer getOrderDetailId() {
		return this.orderDetailId;
	}

	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "unit_price", nullable = false, precision = 10)
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "size_id")
	public Attributes getSize() {
		return this.size;
	}

	public void setSize(Attributes size) {
		this.size = size;
		this.sizeId = size != null ? size.getAttributeId() : null;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "color_id")
	public Attributes getColor() {
		return this.color;
	}

	public void setColor(Attributes color) {
		this.color = color;
		this.colorId = color != null ? color.getAttributeId() : null;
	}
	@Column(name = "size_id", insertable = false, updatable = false)
	public Integer getSizeId() {
		return this.sizeId;
	}

	public void setSizeId(Integer sizeId) {
		this.sizeId = sizeId;
	}

	@Column(name = "color_id", insertable = false, updatable = false)
	public Integer getColorId() {
		return this.colorId;
	}

	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}

}