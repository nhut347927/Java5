package com.fpoly.thainv.entities;
// Generated Jun 6, 2024, 12:44:43 AM by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fpoly.thainv.models.AttributeProductModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Products generated by hbm2java
 */
@Entity
@Table(name = "products", schema = "dbo", catalog = "TMDT")
public class Products implements java.io.Serializable {

	private Integer productId;
	private Categories categories;
	private Manufacturers manufacturers;
	private String productName;
	private BigDecimal retailPrice;
	private BigDecimal wholesalePrice;
	private BigDecimal importPrice;
	private String description;
	private Integer stockQuantity;
	private Boolean isDeleted;
	private Set<AttributeProduct> attributeProducts = new HashSet<AttributeProduct>(0);
	private Set<Feedbacks> feedbackses = new HashSet<Feedbacks>(0);
	private Set<OrderDetails> orderDetailses = new HashSet<OrderDetails>(0);
	private Set<CartProduct> cartProducts = new HashSet<CartProduct>(0);
	private Set<ProductCoupons> productCouponses = new HashSet<ProductCoupons>(0);
	private Set<Images> imageses = new HashSet<Images>(0);
	private Set<PurchaseOrderDetails> purchaseOrderDetailses = new HashSet<PurchaseOrderDetails>(0);

	public Products() {
	}

	public Products(String productName, BigDecimal retailPrice, BigDecimal wholesalePrice, BigDecimal importPrice) {
		this.productName = productName;
		this.retailPrice = retailPrice;
		this.wholesalePrice = wholesalePrice;
		this.importPrice = importPrice;
	}

	public Products(Categories categories, Manufacturers manufacturers, String productName, BigDecimal retailPrice,
			BigDecimal wholesalePrice, BigDecimal importPrice, String description, Integer stockQuantity,
			Boolean delete, Set<AttributeProduct> attributeProducts, Set<Feedbacks> feedbackses,
			Set<OrderDetails> orderDetailses, Set<CartProduct> cartProducts, Set<ProductCoupons> productCouponses,
			Set<Images> imageses, Set<PurchaseOrderDetails> purchaseOrderDetailses) {
		this.categories = categories;
		this.manufacturers = manufacturers;
		this.productName = productName;
		this.retailPrice = retailPrice;
		this.wholesalePrice = wholesalePrice;
		this.importPrice = importPrice;
		this.description = description;
		this.stockQuantity = stockQuantity;
		this.isDeleted = delete;
		this.attributeProducts = attributeProducts;
		this.feedbackses = feedbackses;
		this.orderDetailses = orderDetailses;
		this.cartProducts = cartProducts;
		this.productCouponses = productCouponses;
		this.imageses = imageses;
		this.purchaseOrderDetailses = purchaseOrderDetailses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "product_id", unique = true, nullable = false)
	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manufacturer_id")
	public Manufacturers getManufacturers() {
		return this.manufacturers;
	}

	public void setManufacturers(Manufacturers manufacturers) {
		this.manufacturers = manufacturers;
	}

	@Column(name = "product_name", nullable = false, length = 100)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "retail_price", nullable = false, precision = 10)
	public BigDecimal getRetailPrice() {
		return this.retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	@Column(name = "wholesale_price", nullable = false, precision = 10)
	public BigDecimal getWholesalePrice() {
		return this.wholesalePrice;
	}

	public void setWholesalePrice(BigDecimal wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	@Column(name = "import_price", nullable = false, precision = 10)
	public BigDecimal getImportPrice() {
		return this.importPrice;
	}

	public void setImportPrice(BigDecimal importPrice) {
		this.importPrice = importPrice;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "stock_quantity")
	public Integer getStockQuantity() {
		return this.stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

    @Column(name = "is_deleted")
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<AttributeProduct> getAttributeProducts() {
		return this.attributeProducts;
	}

	public void setAttributeProducts(Set<AttributeProduct> attributeProducts) {
		this.attributeProducts = attributeProducts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<Feedbacks> getFeedbackses() {
		return this.feedbackses;
	}

	public void setFeedbackses(Set<Feedbacks> feedbackses) {
		this.feedbackses = feedbackses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<OrderDetails> getOrderDetailses() {
		return this.orderDetailses;
	}

	public void setOrderDetailses(Set<OrderDetails> orderDetailses) {
		this.orderDetailses = orderDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<CartProduct> getCartProducts() {
		return this.cartProducts;
	}

	public void setCartProducts(Set<CartProduct> cartProducts) {
		this.cartProducts = cartProducts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<ProductCoupons> getProductCouponses() {
		return this.productCouponses;
	}

	public void setProductCouponses(Set<ProductCoupons> productCouponses) {
		this.productCouponses = productCouponses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<Images> getImageses() {
		return this.imageses;
	}

	public void setImageses(Set<Images> imageses) {
		this.imageses = imageses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<PurchaseOrderDetails> getPurchaseOrderDetailses() {
		return this.purchaseOrderDetailses;
	}

	public void setPurchaseOrderDetailses(Set<PurchaseOrderDetails> purchaseOrderDetailses) {
		this.purchaseOrderDetailses = purchaseOrderDetailses;
	}

}
