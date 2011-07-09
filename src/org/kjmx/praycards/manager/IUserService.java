package org.kjmx.praycards.manager;

import org.kjmx.praycards.entities.PCUser;

public interface IUserService extends IService<PCUser>{
	
	PCUser isExist(String userName, String password);
	
}
