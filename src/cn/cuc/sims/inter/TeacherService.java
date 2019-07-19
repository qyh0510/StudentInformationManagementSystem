package cn.cuc.sims.inter;

import java.util.ArrayList;

public interface TeacherService {	
	//添加本人课程，参数为教师账号和课程号
	//若该课程已有教师则不做操作并返回0，否则执行添加操作并返回1
	int addCourse(String id, String cno);
	
	//删除本人课程，参数为教师账号和课程号
	//若该教师不是该课程的教师则返回0，否则执行删除操作并返回1
	int deleteCourse(String id, String cno);
	
	//查看本人所有课程信息，参数为教师账号
	//若教师存在，则返回该教师所教课程的全部信息（课程号 课程名 学分），否则返回空值
	ArrayList<String> searchCourseInfo(String id);
	
	//增加或修改某一课程某一学生的成绩，参数为教师账号、课程号、学号、成绩
	//若成绩不在合法范围内则返回2，修改成功则返回1，学生未选择该课程则返回0
	int editGrade(String id, String cno, String sno, String grade);
	
	//删除某一课程某一学生的成绩，参数为教师账号、课程号、学号
	//若学生未选择该课程则返回0，删除成功则返回1，学生原本无成绩则返回2
	int deleteGrade(String id, String cno, String sno);
	
	//查询某一课程的所有学生成绩，参数为课程号
	//返回学生选课成绩信息数组（学号 姓名 成绩）
	ArrayList<String> searchGrade(String cno);
	
	//查询所有课程信息
	ArrayList<String> searchCourse();
	
	//判断教师是否为某一课程的老师，是则返回1，否则返回0，课程号不存在则返回2
	int searchCourseTeacher(String id, String cno);
}
