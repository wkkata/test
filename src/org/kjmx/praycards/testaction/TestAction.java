package org.kjmx.praycards.testaction;


import org.kjmx.praycards.entities.PCUser;
import org.kjmx.praycards.manager.IUserService;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	
	private IUserService service;
	
	private PCUser pcUser;
	
	private boolean res;
	
	@Override
	public String execute() throws Exception {
		
		this.res = service.isExist(pcUser.getUserName(), pcUser.getUserPassword()) != null;
		
		return super.execute();
	}


	public PCUser getPcUser() {
		return pcUser;
	}


	public void setPcUser(PCUser pcUser) {
		this.pcUser = pcUser;
	}


	public void setService(IUserService service) {
		this.service = service;
	}




	public boolean isRes() {
		return res;
	}

	
	
}
