package org.kjmx.praycards.action.user;

import java.util.Map;

import org.kjmx.praycards.constants.ActionResult;
import org.kjmx.praycards.constants.Session;
import org.kjmx.praycards.entities.PCUser;
import org.kjmx.praycards.manager.IUserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;


public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9211428864526728364L;
	
	private String userName;
	
	private String userPassword;
	
	private PCUser pcUser;
	
	private IUserService userService;
	
	@Override
	public String execute() throws Exception {
		if((pcUser = userService.isExist(userName, userPassword)) != null) {
			
			Map<String, Object> session = ActionContext.getContext().getSession();
			
			session.put(Session.USER, pcUser);//保存session
			
			return SUCCESS;
		}
		else{
			
			this.addFieldError("userName", "用户名或密码错误！");
			
			return ActionResult.LOGIN;
		}
	}
	
	public PCUser getPcUser() {
		return pcUser;
	}
	
	
	
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@RequiredFieldValidator(
			type = ValidatorType.FIELD,
            message = "请输入密码!",
            shortCircuit = true
    )
	public void setUserPassword(String userPassword) {
		if(userPassword!= null && userPassword.length() > 0)
			this.userPassword = userPassword;
	}

	@RequiredFieldValidator(
			type = ValidatorType.FIELD,
            message = "请输入用户名!",
            shortCircuit=true
    )
	public void setUserName(String userName) {
		if(userName!= null && userName.length() > 0)
			this.userName = userName;
	}
	
	//note : if you used RequireFieldValidateor annotation , you must specified the 'get' method to make the ognl component get the value of this object
	public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}
	
	
}
