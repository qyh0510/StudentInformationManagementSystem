package cn.cuc.sims.inter;

import java.util.ArrayList;

public interface Data {
	//�ж�id�Ƿ���ڣ����򷵻�1�����򷵻�0
	int findUserId(String id);
	
	//�ж�id�Ƿ�Ϊѧ��id�����򷵻�1�����򷵻�0
	int findStuId(String id);
	
	//�ж�id�Ƿ�Ϊ��ʦid�����򷵻�1�����򷵻�0
	int findTeacherId(String id);
	
	//�ж�id�Ƿ�Ϊ����Աid�����򷵻�1�����򷵻�0
	int findAdminId(String id);
	
	//�����û�����
	String findPWD(String id);
	
	//�����û�����
	void setPWD(String newPWD, String id);
	
	//����ѧ��ѧ��
	String findSno(String id);
	
	//�����û�����
	String findName(String id);
	
	//�����û��Ա�
	String findSex(String id);
	
	//�����û�����
	String findAge(String id);
	
	//����ѧ��ѡ��
	ArrayList<String> findStuCourse(String sno);
	
	//���ҽ�ʦ����
	String findJno(String id);
	
	//����ĳһ��ʦ�����̿γ���Ϣ
	ArrayList<String> searchCourseInfo(String jno);
	
	//����ĳһ�γ̵�����ѧ���ɼ�
	ArrayList<String> searchGrade(String cno);
	
	//����ĳһ�γ�ĳһѧ���ĳɼ�
	void setStuGrade(String cno, String sno, String grade);
	
	//ɾ��ĳһ��ʦ���̵�ĳһ�γ�
	void deleteCourse(String jno, String cno);
	
	//����ĳһ�γ̵Ľ�ʦjno
	String searchCourseTeacher(String cno);
	
	//����ĳһ�γ̵Ľ�ʦ
	void setCourseTeacher(String jno, String cno);
	
	//�����û�����
	void setName(String id, String name);
		
	//�����û��Ա�
	void setSex(String id, String sex);
		
	//�����û�����
	void setAge(String id, String age);
	
	//����ѧ��ѧ��
	void setCredit(String id, String credit);
	
	//�ж�cno�Ƿ���ڣ����򷵻�1�����򷵻�0
	int findCourseCno(String cno);
	
	//�ж�jno�Ƿ���ڣ����򷵻�1�����򷵻�0
	int findTeacherJno(String jno);
	
	//�������пγ�
	ArrayList<String> findCourse();
	
	//�ж�ѧ���Ƿ�ѡ��ĳһ�γ̣����򷵻�1�����򷵻�0
	int findCourseStudent(String sno, String cno);
	
	//�鿴ĳһѧ��ĳһ�γ̵ĳɼ�
	String searchScGrade(String sno, String cno);
}
