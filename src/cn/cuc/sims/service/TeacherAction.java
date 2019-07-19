package cn.cuc.sims.service;

import java.util.ArrayList;

import cn.cuc.sims.data.DataOperation;
import cn.cuc.sims.inter.Loggable;
import cn.cuc.sims.inter.TeacherService;

public class TeacherAction implements TeacherService {
	Log log;
	DataOperation data;
	
	public TeacherAction() {
		log = new Log("MyLog.log");
		data = new DataOperation();
	}
	
	@Override
	public int addCourse(String id, String cno) {
		String jno = data.searchCourseTeacher(cno);
		if(jno == null) {
			data.setCourseTeacher(data.findJno(id), cno);
			log.addLog(Loggable.TYPE.INFORMATION, "教师" + id + "增加课程" + cno);
			return 1;
		}
		return 0;
	}
	
	@Override
	public int deleteCourse(String id, String cno) {
		String jno = data.findJno(id);
		if(jno.equals(data.searchCourseTeacher(cno))) {
			data.deleteCourse(jno, cno);
			log.addLog(Loggable.TYPE.INFORMATION, "教师" + id + "删除课程" + cno);
			return 1;
		}
		return 0;
	}
	
	@Override
	public ArrayList<String> searchCourseInfo(String id) {
		String jno = data.findJno(id);
		return data.searchCourseInfo(jno);
	}
	
	@Override
	public int editGrade(String id, String cno, String sno, String grade) {
		if(Integer.valueOf(grade) >= 0 && Integer.valueOf(grade) <= 150) {
			if(data.findCourseStudent(sno, cno) == 1){
				data.setStuGrade(cno, sno, grade);
				log.addLog(Loggable.TYPE.INFORMATION, "教师" + id + "将学生" + sno + "的" + cno + "号课程成绩设置为" + grade);
				return 1;
			}
			return 0;
		}
		return 2;
	}

	@Override
	public int deleteGrade(String id, String cno, String sno) {
		if(data.findCourseStudent(sno, cno) == 1) {
			if(data.searchScGrade(sno, cno) != null) {
				data.setStuGrade(cno, sno, null);
				log.addLog(Loggable.TYPE.INFORMATION, "教师" + id + "将学生" + sno + "的" + cno + "号课程成绩删除");
				return 1;
			}
			return 2;
		}
		return 0;
	}

	@Override
	public ArrayList<String> searchGrade(String cno) {
		return data.searchGrade(cno);
	}

	@Override
	public ArrayList<String> searchCourse() {
		return data.findCourse();
	}

	@Override
	public int searchCourseTeacher(String id, String cno) {
		if(data.findCourseCno(cno) == 1) {
			String jno1 = data.searchCourseTeacher(cno);
			String jno2 = data.findJno(id);
			if(jno1 != null) {
				if(jno1.equals(jno2)) {
					return 1;
				}
			}
			return 0;
		}
		return 2;
	}

}
