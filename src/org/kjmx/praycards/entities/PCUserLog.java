package org.kjmx.praycards.entities;

import java.sql.Timestamp;

public class PCUserLog {
	private int logId;
	
	private int logType;
	
	private String logDesc;
	
	private byte[] logData;
	
	private int logState;
	
	private Timestamp logDate;
	
	private String reserved1;
	
	private String reserved2;
	
	private PCUser pcUser;
	
	private PCProduct pcProduct;

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public int getLogType() {
		return logType;
	}

	public void setLogType(int logType) {
		this.logType = logType;
	}

	public String getLogDesc() {
		return logDesc;
	}

	public void setLogDesc(String logDesc) {
		this.logDesc = logDesc;
	}

	public byte[] getLogData() {
		return logData;
	}

	public void setLogData(byte[] logData) {
		this.logData = logData;
	}

	public int getLogState() {
		return logState;
	}

	public void setLogState(int logState) {
		this.logState = logState;
	}

	public Timestamp getLogDate() {
		return logDate;
	}

	public void setLogDate(Timestamp logDate) {
		this.logDate = logDate;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
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
	
	
}
