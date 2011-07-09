package org.kjmx.praycards.entities;

import java.util.Set;

public class PCRoleGroup {
	
	private int rgId;
	
	private String rgName;
	
	private int rgType;
	
	private Set<PCUser> pcUsers;

	public int getRgId() {
		return rgId;
	}

	public void setRgId(int rgId) {
		this.rgId = rgId;
	}

	public String getRgName() {
		return rgName;
	}

	public void setRgName(String rgName) {
		this.rgName = rgName;
	}

	public int getRgType() {
		return rgType;
	}

	public void setRgType(int rgType) {
		this.rgType = rgType;
	}

	public Set<PCUser> getPcUsers() {
		return pcUsers;
	}

	public void setPcUsers(Set<PCUser> pcUsers) {
		this.pcUsers = pcUsers;
	}
	
	
}
