package cn.cuc.sims.service;

import cn.cuc.sims.data.DataOperation;
import cn.cuc.sims.inter.Loggable;
import cn.cuc.sims.inter.UserService;

public class UserAction implements UserService {
	Log log;
	DataOperation data;
	
	public UserAction() {
		log = new Log("MyLog.log");
		data = new DataOperation();
	}
	
	@Override
	public int login(String type, String id, String PWD) {
		if(data.findUserId(id) == 0) {
			return 1;
		}
		if(type.equals("ѧ��")) {		//ѧ��
			if(data.findStuId(id) == 1) {
				if(data.findPWD(id).equals(PWD)) {
					log.addLog(Loggable.TYPE.INFORMATION, "ѧ��" + id + "����ϵͳ");
					return 0;
				}
			}
			else {
				return 2;
			}
		}else if(type.equals("��ʦ")) {		//��ʦ
			if(data.findTeacherId(id) == 1) {
				if(data.findPWD(id).equals(PWD)) {
					log.addLog(Loggable.TYPE.INFORMATION, "��ʦ" + id + "����ϵͳ");
					return 0;
				}
			}
			else {
				return 2;
			}
		}else {		//����Ա
			if(data.findAdminId(id) == 1) {
				if(data.findPWD(id).equals(PWD)) {
					log.addLog(Loggable.TYPE.INFORMATION, "����Ա" + id + "����ϵͳ");
					return 0;
				}
			}
			else {
				return 2;
			}
		}
		return 3;
	}
	
	@Override
	public int changePassword(String newPWD, String id) {
		String nowPWD = data.findPWD(id);
		if(nowPWD.equals(newPWD)) {
			return 0;
		}
		data.setPWD(newPWD, id);
		log.addLog(Loggable.TYPE.INFORMATION, "�û�" + id + "�޸�����");
		return 1;
	}

}
