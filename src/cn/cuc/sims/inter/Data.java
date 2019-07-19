package cn.cuc.sims.inter;

import java.util.ArrayList;

public interface Data {
	//判断id是否存在，是则返回1，否则返回0
	int findUserId(String id);
	
	//判断id是否为学生id，是则返回1，否则返回0
	int findStuId(String id);
	
	//判断id是否为教师id，是则返回1，否则返回0
	int findTeacherId(String id);
	
	//判断id是否为管理员id，是则返回1，否则返回0
	int findAdminId(String id);
	
	//查找用户密码
	String findPWD(String id);
	
	//设置用户密码
	void setPWD(String newPWD, String id);
	
	//查找学生学号
	String findSno(String id);
	
	//查找用户姓名
	String findName(String id);
	
	//查找用户性别
	String findSex(String id);
	
	//查找用户年龄
	String findAge(String id);
	
	//查找学生选课
	ArrayList<String> findStuCourse(String sno);
	
	//查找教师工号
	String findJno(String id);
	
	//查找某一教师的所教课程信息
	ArrayList<String> searchCourseInfo(String jno);
	
	//查找某一课程的所有学生成绩
	ArrayList<String> searchGrade(String cno);
	
	//设置某一课程某一学生的成绩
	void setStuGrade(String cno, String sno, String grade);
	
	//删除某一教师所教的某一课程
	void deleteCourse(String jno, String cno);
	
	//查找某一课程的教师jno
	String searchCourseTeacher(String cno);
	
	//设置某一课程的教师
	void setCourseTeacher(String jno, String cno);
	
	//设置用户姓名
	void setName(String id, String name);
		
	//设置用户性别
	void setSex(String id, String sex);
		
	//设置用户年龄
	void setAge(String id, String age);
	
	//设置学生学分
	void setCredit(String id, String credit);
	
	//判断cno是否存在，是则返回1，否则返回0
	int findCourseCno(String cno);
	
	//判断jno是否存在，是则返回1，否则返回0
	int findTeacherJno(String jno);
	
	//查找所有课程
	ArrayList<String> findCourse();
	
	//判断学生是否选了某一课程，是则返回1，否则返回0
	int findCourseStudent(String sno, String cno);
	
	//查看某一学生某一课程的成绩
	String searchScGrade(String sno, String cno);
}
