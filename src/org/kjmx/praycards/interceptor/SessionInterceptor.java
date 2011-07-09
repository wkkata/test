package org.kjmx.praycards.interceptor;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.kjmx.praycards.action.user.LoginAction;
import org.kjmx.praycards.constants.Session;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SessionInterceptor extends AbstractInterceptor{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4784817559684501634L;
	
	private Logger logger = LogManager.getLogger(getClass());
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		
		try{
			ActionSupport action = (ActionSupport)invocation.getAction();
			
			if(action instanceof LoginAction){
				
				return invocation.invoke();
				
			}
		}catch (Exception e) {
		}
		if(!session.containsKey(Session.USER)) return "login";
		
		return invocation.invoke();
	}
	
	
}
