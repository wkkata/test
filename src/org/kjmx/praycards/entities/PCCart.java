package org.kjmx.praycards.entities;

import java.sql.Date;

public class PCCart {
	private int cartId;
	
	private Date pickDate;
	
	private int cartState;
	
	private String fromAddr;
	
	private String toAddr;
	
	private String content;
	
	private byte[] pic;
	
	private String fromName;
	
	private String toName;
	
	private PCUser pcUser;
	
	private PCProduct pcProduct;


	public Date getPickDate() {
		return pickDate;
	}

	public void setPickDate(Date pickDate) {
		this.pickDate = pickDate;
	}

	public int getCartState() {
		return cartState;
	}

	public void setCartState(int cartState) {
		this.cartState = cartState;
	}

	public String getFromAddr() {
		return fromAddr;
	}

	public void setFromAddr(String fromAddr) {
		this.fromAddr = fromAddr;
	}

	public String getToAddr() {
		return toAddr;
	}

	public void setToAddr(String toAddr) {
		this.toAddr = toAddr;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	public PCUser getPcUser() {
		return pcUser;
	}

	public void setPcUser(PCUser pcUser) {
		this.pcUser = pcUser;
	}

	public PCProduct getPcProduct() {
		return pcProduct;
	}

	public void setPcProduct(PCProduct pcProduct) {
		this.pcProduct = pcProduct;
	}

	public void setCartId(int cardId) {
		this.cartId = cardId;
	}

	public int getCartId() {
		return cartId;
	}
	
	
}
