package org.kjmx.praycards.entities;

import java.util.Set;

public class PCProduct {
	
	private int productId;
	
	private String productCode;
	
	private String productName;
	
	private String productState;
	
	private String importDate;
	
	private String productDes;
	
	private String productPrice;
	
	private Set<PCCart> pcCarts;
	
	private Set<PCUser> pcUserLogs;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductState() {
		return productState;
	}

	public void setProductState(String productState) {
		this.productState = productState;
	}

	public String getImportDate() {
		return importDate;
	}

	public void setImportDate(String importDate) {
		this.importDate = importDate;
	}

	public String getProductDes() {
		return productDes;
	}

	public void setProductDes(String productDes) {
		this.productDes = productDes;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public Set<PCCart> getPcCarts() {
		return pcCarts;
	}

	public void setPcCarts(Set<PCCart> pcCarts) {
		this.pcCarts = pcCarts;
	}

	public Set<PCUser> getPcUserLogs() {
		return pcUserLogs;
	}

	public void setPcUserLogs(Set<PCUser> pcUserLogs) {
		this.pcUserLogs = pcUserLogs;
	}
	
	
}
