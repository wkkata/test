/**
 * 
 */
package org.kjmx.praycards.action.user;

import java.util.Map;

import org.kjmx.praycards.constants.Session;
import org.kjmx.praycards.entities.PCUser;
import org.kjmx.praycards.manager.IUserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

/**
 * 
 * ע��Action
 * @author wkkata
 *
 */
public class RegisterAction extends ActionSupport {

	/**
	 * ���к�
	 */
	private static final long serialVersionUID = -3004451067562582800L;
	
	private IUserService userService;
	
	private String userEmailAddress;
	
	private String userName;
	
	private int userGender;
	
	private String userNo;
	
	private String userPassword;
	
	private String userPasswordReInput;
	
	private String userTel;
	
	private PCUser pcUser;
	
	@Override
	public String execute() throws Exception {
		
		PCUser pcUser = new PCUser();
		
		pcUser.setUserEmailAddress(userEmailAddress);
		
		pcUser.setUserName(userName);
		
		pcUser.setUserGender(userGender);
		
		pcUser.setUserNo(userNo);
		
		pcUser.setUserPassword(userPassword);
		
		pcUser.setUserTel(userTel);
		
		if(userService.save(pcUser)){
			
			this.setPcUser(pcUser);
			
			Map<String, Object> session = ActionContext.getContext().getSession();
			
			session.put(Session.USER, pcUser);//����session
			
			return SUCCESS;
		}
		
		return INPUT;
	}


	
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}



	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	
	@RequiredFieldValidator(
		message="����������",
		type=ValidatorType.FIELD,
		shortCircuit = true
	)
	@EmailValidator(
		type = ValidatorType.FIELD,
		message="������Ϸ�������",
		shortCircuit=true
	)
	public void setUserEmailAddress(String userEmailAddress) {
		if(userEmailAddress!= null && userEmailAddress.length() > 0)
			this.userEmailAddress = userEmailAddress;
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

	public String getUserNo() {
		return userNo;
	}


	@RequiredFieldValidator(
		message="�������¼��",
		type=ValidatorType.FIELD,
		shortCircuit = true
	)
	@StringLengthFieldValidator(
		maxLength="10",
		minLength="1",
		shortCircuit=true,
		trim=true,
		message="��¼��Ӧ��Ϊ1-10���ַ�֮��"
	)
	public void setUserNo(String userNo) {
		if(userNo != null && userNo.length() > 0)
			this.userNo = userNo;
	}



	public String getUserPassword() {
		return userPassword;
	}


	@RequiredFieldValidator(
		message="����������",
		type=ValidatorType.FIELD,
		shortCircuit = true
	)
	@StringLengthFieldValidator(
		maxLength="10",
		minLength="6",
		shortCircuit=true,
		trim=true,
		message="����Ӧ��Ϊ1-10���ַ�֮��"
	)
	public void setUserPassword(String userPassword) {
		if(userPassword != null && userPassword.length() > 0)
			this.userPassword = userPassword;
	}



	public String getUserTel() {
		return userTel;
	}


	
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}


	@RequiredFieldValidator(
		message="����������ƥ��",
		type=ValidatorType.FIELD,
		shortCircuit = true
	)
	public void setUserPasswordReInput(String userPasswordReInput) {
		if(userPasswordReInput != null && userPasswordReInput.length() > 0)
			this.userPasswordReInput = userPasswordReInput;
	}



	public String getUserPasswordReInput() {
		return userPasswordReInput;
	}

	public void setPcUser(PCUser pcUser) {
		this.pcUser = pcUser;
	}

	public PCUser getPcUser() {
		return pcUser;
	}
	
	
}
