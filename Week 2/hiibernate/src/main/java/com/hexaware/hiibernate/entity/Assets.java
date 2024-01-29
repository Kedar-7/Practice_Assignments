package com.hexaware.hiibernate.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries(
		{
			@NamedQuery(name="getAllAssets", query ="SELECT a FROM Assets a"),
			@NamedQuery(name="getAssetById", query ="SELECT a FROM Assets a where a.assetId = :assetId"),
			@NamedQuery(name = "deleteAssetById", query = "DELETE FROM Assets a WHERE a.assetId = :assetId"),
			@NamedQuery(name = "updateAsset", query = "UPDATE Assets a SET a.assetNo = :assetNo, a.assetName = :assetName, a.assetCategory = :assetCategory WHERE a.assetId = :assetId")

		})
public class Assets {
	@Id
	private int assetId;
    private String assetNo;
    private String assetName;
    private String assetCategory;
    private String assetModel;
    private Date manufacturingDate;
    private Date expiryDate;
    private BigDecimal assetValue;
    private String status;
    
    public Assets() {
        // Default constructor
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
		return "Asset [assetId=" + assetId + ", assetNo=" + assetNo + ", assetName=" + assetName + ", assetCategory="
				+ assetCategory + ", assetModel=" + assetModel + ", manufacturingDate=" + manufacturingDate
				+ ", expiryDate=" + expiryDate + ", assetValue=" + assetValue + ", status=" + status + "]";
	}
}
