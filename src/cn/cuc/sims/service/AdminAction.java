package cn.cuc.sims.service;

import cn.cuc.sims.data.DataOperation;
import cn.cuc.sims.inter.AdminService;
import cn.cuc.sims.inter.Loggable;

public class AdminAction extends TeacherAction implements AdminService {
	Log log;
	DataOperation data;
	
	public AdminAction() {
		log = new Log("MyLog.log");
		data = new DataOperation();
	}
	
	@Override
	public int setStudentInfo(String type, String info, String id1, String id2) {
		if(data.findSno(id1) == null) {
			return 2;
		}
		if(type.equals("姓名")) {
			data.setName(id1, info);
			log.addLog(Loggable.TYPE.INFORMATION, "管理员" + id2 + "修改学生" + id1 + "的姓名为" + info);
		}else if(type.equals("性别")) {
			data.setSex(id1, info);
			log.addLog(Loggable.TYPE.INFORMATION, "管理员" + id2 + "修改学生" + id1 + "的性别为" + info);
		}else if(type.equals("年龄")) {
			data.setAge(id1, info);
			log.addLog(Loggable.TYPE.INFORMATION, "管理员" + id2 + "修改学生" + id1 + "的年龄为" + info);
		}else if(type.equals("学分")) {
			data.setCredit(id1, info);
			log.addLog(Loggable.TYPE.INFORMATION, "管理员" + id2 + "修改学生" + id1 + "的学分为" + info);
		}else {
			return 0;
		}
		return 1;
	}

	@Override
	public int setTeacher(String cno, String jno) {
		if(data.findCourseCno(cno) == 1 && data.findTeacherJno(jno) == 1) {
			data.setCourseTeacher(jno, cno);
			return 1;
		}
		return 0;
	}

}
