package com.hexaware.springrestprac.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Assets")
public class Assets {
	
	@Id
	//@Column(name = "AssetId")
	private int assetId;
	// @Column(name = "AssetNo")
    private String assetNo;
	// @Column(name = "AssetName")
    private String assetName;
	// @Column(name = "AssetCategory")
    private String assetCategory;
	// @Column(name = "AssetModel")
    private String assetModel;
	// @Column(name = "ManufacturingDate")
    private Date manufacturingDate;
	// @Column(name = "ExpiryDate")
    private Date expiryDate;
	// @Column(name = "AssetNo")
    private BigDecimal assetValue;
	// @Column(name = "AssetNo")
    private String status;
    
	public Assets() {
		super();
	}

	public Assets(int assetId, String assetNo, String assetName, String assetCategory, String assetModel,
			Date manufacturingDate, Date expiryDate, BigDecimal assetValue, String status) {
		super();
		this.assetId = assetId;
		this.assetNo = assetNo;
		this.assetName = assetName;
		this.assetCategory = assetCategory;
		this.assetModel = assetModel;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.assetValue = assetValue;
		this.status = status;
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetCategory() {
		return assetCategory;
	}

	public void setAssetCategory(String assetCategory) {
		this.assetCategory = assetCategory;
	}

	public String getAssetModel() {
		return assetModel;
	}

	public void setAssetModel(String assetModel) {
		this.assetModel = assetModel;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public BigDecimal getAssetValue() {
		return assetValue;
	}

	public void setAssetValue(BigDecimal assetValue) {
		this.assetValue = assetValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Assets [assetId=" + assetId + ", assetNo=" + assetNo + ", assetName=" + assetName + ", assetCategory="
				+ assetCategory + ", assetModel=" + assetModel + ", manufacturingDate=" + manufacturingDate
				+ ", expiryDate=" + expiryDate + ", assetValue=" + assetValue + ", status=" + status + "]";
	}
}
