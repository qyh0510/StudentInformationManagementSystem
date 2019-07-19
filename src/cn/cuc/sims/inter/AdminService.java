package cn.cuc.sims.inter;


public interface AdminService {
	//修改学生信息（姓名/性别/年龄/学分），参数为信息类型、新信息和id1学生账号、id2管理员账号
	//若修改成功则返回1，学号有误则返回2，类型有误返回0
	int setStudentInfo(String type, String info, String id1, String id2);
	
	//设置某一课程的教师，参数为课程号和教工号
	//若修改成功则返回1，课程号或教工号有误则返回0
	int setTeacher(String cno, String jno);
}
