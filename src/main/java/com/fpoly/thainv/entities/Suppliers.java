package com.fpoly.thainv.entities;
// Generated Jun 6, 2024, 12:44:43 AM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;

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
 * Suppliers generated by hbm2java
 */
@Entity
@Table(name = "suppliers", schema = "dbo", catalog = "TMDT")
public class Suppliers implements java.io.Serializable {

	private Integer supplierId;
	private Addresses addresses;
	private String supplierName;
	private String contactName;
	private String email;
	private String phone;
	private Boolean isDeleted;
	private Set<PurchaseOrders> purchaseOrderses = new HashSet<PurchaseOrders>(0);

	public Suppliers() {
	}

	public Suppliers(String supplierName) {
		this.supplierName = supplierName;
	}

	public Suppliers(Addresses addresses, String supplierName, String contactName, String email, String phone,
			Boolean isDeleted, Set<PurchaseOrders> purchaseOrderses) {
		this.addresses = addresses;
		this.supplierName = supplierName;
		this.contactName = contactName;
		this.email = email;
		this.phone = phone;
		this.isDeleted = isDeleted;
		this.purchaseOrderses = purchaseOrderses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "supplier_id", unique = true, nullable = false)
	public Integer getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	public Addresses getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}

	@Column(name = "supplier_name", nullable = false, length = 100)
	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Column(name = "contact_name", length = 100)
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suppliers")
	public Set<PurchaseOrders> getPurchaseOrderses() {
		return this.purchaseOrderses;
	}

	public void setPurchaseOrderses(Set<PurchaseOrders> purchaseOrderses) {
		this.purchaseOrderses = purchaseOrderses;
	}

}
