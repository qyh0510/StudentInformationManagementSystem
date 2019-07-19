package cn.cuc.sims.inter;

import java.util.ArrayList;

public interface StuService {
	//查询本人信息，参数为账号
	//返回本人信息字符串（学号 姓名 性别 年龄）
	String searchSno(String id);
	String searchName(String id);
	String searchSex(String id);
	String searchAge(String id);
	
	//查询所有课程成绩，参数为学生本人
	//若该生存在则返回本人“课程号	课程名 成绩”字符串数组，否则返回空值
	ArrayList<String> searchGrade(String id);
}
