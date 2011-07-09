package org.kjmx.praycards.entities;

import java.sql.Timestamp;
import java.util.Set;

/**
 * ”√ªß
 * @author wkkata
 *
 */
public class PCUser {
	private int userId;
	
	private String userNo;
	
	private String userName;
	
	private String userPassword;
	
	private int userGender;
	
	private String userEmailAddress;
	
	private String userTel;
	
	private int userState;
	
	private Timestamp userRegDate;
	
	private Set<PCFDestUser> pcfDestUsers;
	
	private Set<PCManageLog> pcManageLogs;
	
	private Set<PCCart> pcCarts;
	
	private Set<PCUserLog> pcUserLogs;
	
	private PCRoleGroup pcRoleGroup;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserGender() {
		return userGender;
	}

	public void setUserGender(int userGender) {
		this.userGender = userGender;
	}

	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public int getUserState() {
		return userState;
	}

	public void setUserState(int userState) {
		this.userState = userState;
	}

	public Timestamp getUserRegDate() {
		return userRegDate;
	}

	public void setUserRegDate(Timestamp userRegDate) {
		this.userRegDate = userRegDate;
	}

	public Set<PCFDestUser> getPcfDestUsers() {
		return pcfDestUsers;
	}

	public void setPcfDestUsers(Set<PCFDestUser> pcfDestUsers) {
		this.pcfDestUsers = pcfDestUsers;
	}

	public Set<PCManageLog> getPcManageLogs() {
		return pcManageLogs;
	}

	public void setPcManageLogs(Set<PCManageLog> pcManageLogs) {
		this.pcManageLogs = pcManageLogs;
	}

	public Set<PCCart> getPcCarts() {
		return pcCarts;
	}

	public void setPcCarts(Set<PCCart> pcCarts) {
		this.pcCarts = pcCarts;
	}

	public Set<PCUserLog> getPcUserLogs() {
		return pcUserLogs;
	}

	public void setPcUserLogs(Set<PCUserLog> pcUserLogs) {
		this.pcUserLogs = pcUserLogs;
	}

	public PCRoleGroup getPcRoleGroup() {
		return pcRoleGroup;
	}

	public void setPcRoleGroup(PCRoleGroup pcRoleGroup) {
		this.pcRoleGroup = pcRoleGroup;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPassword() {
		return userPassword;
	}
	
	
}
