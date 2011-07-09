package org.kjmx.praycards.manager.imp;

import org.kjmx.praycards.constants.RoleGroupEnum;
import org.kjmx.praycards.dao.IDao;
import org.kjmx.praycards.entities.PCRoleGroup;
import org.kjmx.praycards.entities.PCUser;
import org.kjmx.praycards.manager.AbstractService;
import org.kjmx.praycards.manager.IUserService;
import org.kjmx.praycards.util.StringUtil;

public class UserService extends AbstractService<PCUser> implements IUserService {

	IDao<PCRoleGroup> roleGroupDao;
	
	public PCUser isExist(String userName, String password) {
		return this.getDao().findObject(" and obj.userNo=? and obj.userPassword=?", userName, password);
	}
	
	/**
	 * ×¢²á»áÔ±
	 */
	@Override
	public boolean save(PCUser user) {
		
		user.setUserRegDate(StringUtil.getNowTimestamp());
		
		user.setPcRoleGroup(roleGroupDao.findObject(" and obj.rgType=?", RoleGroupEnum.NormalMember.getRgType()));
		
		return super.save(user);
	}
	
	public static void main(String[] args) {
		System.out.println(StringUtil.getNowTimestamp());
	}

	public void setRoleGroupDao(IDao<PCRoleGroup> roleGroupDao) {
		this.roleGroupDao = roleGroupDao;
	}
	
}
