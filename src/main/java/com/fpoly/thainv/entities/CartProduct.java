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
 * CartProduct generated by hbm2java
 */
@Entity
@Table(name = "cart_product", schema = "dbo", catalog = "TMDT")
public class CartProduct implements java.io.Serializable {

	private Integer cartPrdId;
	private Products products;
	private ShoppingCarts shoppingCarts;
	private int quantity;
	private AttributeProduct size;
	private AttributeProduct color;

	public CartProduct() {
	}

	public CartProduct(int quantity) {
		this.quantity = quantity;
	}

	public CartProduct(Products products, ShoppingCarts shoppingCarts, int quantity, AttributeProduct size, AttributeProduct color) {
		this.products = products;
		this.shoppingCarts = shoppingCarts;
		this.quantity = quantity;
		this.size =size;
		this.color =color;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_prd_id", unique = true, nullable = false)
	public Integer getCartPrdId() {
		return this.cartPrdId;
	}

	public void setCartPrdId(Integer cartPrdId) {
		this.cartPrdId = cartPrdId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_id")
	public ShoppingCarts getShoppingCarts() {
		return this.shoppingCarts;
	}

	public void setShoppingCarts(ShoppingCarts shoppingCarts) {
		this.shoppingCarts = shoppingCarts;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "size_id")
	public AttributeProduct getSize() {
		return this.size;
	}

	public void setSize(AttributeProduct size) {
		this.size = size;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "color_id")
	public AttributeProduct getColor() {
		return this.color;
	}

	public void setColor(AttributeProduct color) {
		this.color = color;
	}
}