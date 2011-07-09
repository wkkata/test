package org.kjmx.praycards.constants;

public enum RoleGroupEnum {
	
	Admin(1, "����Ա"),
	NormalMember(2, "��ͨ��Ա"),
	Vip(3, "Vip��Ա");
	
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
