package cn.cuc.sims.inter;

public interface UserService {
	//使用账号、密码登陆账户，成功登录返回0，账号错误返回1，帐号与用户类型不匹配返回2，密码错误返回3
	int login(String type, String id, String PWD);
	
	//修改密码,参数为新密码和用户账号
	//若修改成功则返回1，若新密码与旧密码相同则返回0
	int changePassword(String newPWD, String id);
}
