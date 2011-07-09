package org.kjmx.praycards.constants;

public enum RoleGroupEnum {
	
	Admin(1, "管理员"),
	NormalMember(2, "普通会员"),
	Vip(3, "Vip会员");
	
	int rgType;
	
	String desc;
	
	RoleGroupEnum(int rgType, String desc){
		this.rgType = rgType;
		
		this.desc = desc;
	}
	
	public int getRgType(){
		return rgType;
	}
	
	public String getDesc(){
		return desc;
	}
}
