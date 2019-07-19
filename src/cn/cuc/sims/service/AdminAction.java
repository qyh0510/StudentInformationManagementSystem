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
		if(type.equals("����")) {
			data.setName(id1, info);
			log.addLog(Loggable.TYPE.INFORMATION, "����Ա" + id2 + "�޸�ѧ��" + id1 + "������Ϊ" + info);
		}else if(type.equals("�Ա�")) {
			data.setSex(id1, info);
			log.addLog(Loggable.TYPE.INFORMATION, "����Ա" + id2 + "�޸�ѧ��" + id1 + "���Ա�Ϊ" + info);
		}else if(type.equals("����")) {
			data.setAge(id1, info);
			log.addLog(Loggable.TYPE.INFORMATION, "����Ա" + id2 + "�޸�ѧ��" + id1 + "������Ϊ" + info);
		}else if(type.equals("ѧ��")) {
			data.setCredit(id1, info);
			log.addLog(Loggable.TYPE.INFORMATION, "����Ա" + id2 + "�޸�ѧ��" + id1 + "��ѧ��Ϊ" + info);
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
