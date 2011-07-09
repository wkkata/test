package org.kjmx.praycards.entities;

public class PCFDestUser {
	private int fduId;
	
	private String fduName;
	
	private String fduAddr;
	
	private String fduMailCode;
	
	private String fduTel;
	
	private PCUser pcUser;

	public int getFduId() {
		return fduId;
	}

	public void setFduId(int fduId) {
		this.fduId = fduId;
	}

	public String getFduName() {
		return fduName;
	}

	public void setFduName(String fduName) {
		this.fduName = fduName;
	}

	public String getFduAddr() {
		return fduAddr;
	}

	public void setFduAddr(String fduAddr) {
		this.fduAddr = fduAddr;
	}

	public String getFduMailCode() {
		return fduMailCode;
	}

	public void setFduMailCode(String fduMailCode) {
		this.fduMailCode = fduMailCode;
	}

	public String getFduTel() {
		return fduTel;
	}

	public void setFduTel(String fduTel) {
		this.fduTel = fduTel;
	}

	public PCUser getPcUser() {
		return pcUser;
	}

	public void setPcUser(PCUser pcUser) {
		this.pcUser = pcUser;
	}
	
	
}
