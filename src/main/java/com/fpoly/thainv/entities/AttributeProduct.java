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
 * AttributeProduct generated by hbm2java
 */
@Entity
@Table(name = "attribute_product", schema = "dbo", catalog = "TMDT")
public class AttributeProduct implements java.io.Serializable {

	private Integer attrPrdId;
	private Attributes attributes;
	private Products products;
	private Integer quantity;

	public AttributeProduct() {
	}

	public AttributeProduct(Attributes attributes, Products products) {
		this.attributes = attributes;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "attr_prd_id", unique = true, nullable = false)
	public Integer getAttrPrdId() {
		return this.attrPrdId;
	}

	public void setAttrPrdId(Integer attrPrdId) {
		this.attrPrdId = attrPrdId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "attribute_id")
	public Attributes getAttributes() {
		return this.attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
	
	@Column(name = "quantity")
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
}