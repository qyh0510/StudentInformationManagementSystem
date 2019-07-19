package cn.cuc.sims.inter;

import java.util.ArrayList;

public interface TeacherService {	
	//��ӱ��˿γ̣�����Ϊ��ʦ�˺źͿγ̺�
	//���ÿγ����н�ʦ��������������0������ִ����Ӳ���������1
	int addCourse(String id, String cno);
	
	//ɾ�����˿γ̣�����Ϊ��ʦ�˺źͿγ̺�
	//���ý�ʦ���Ǹÿγ̵Ľ�ʦ�򷵻�0������ִ��ɾ������������1
	int deleteCourse(String id, String cno);
	
	//�鿴�������пγ���Ϣ������Ϊ��ʦ�˺�
	//����ʦ���ڣ��򷵻ظý�ʦ���̿γ̵�ȫ����Ϣ���γ̺� �γ��� ѧ�֣������򷵻ؿ�ֵ
	ArrayList<String> searchCourseInfo(String id);
	
	//���ӻ��޸�ĳһ�γ�ĳһѧ���ĳɼ�������Ϊ��ʦ�˺š��γ̺š�ѧ�š��ɼ�
	//���ɼ����ںϷ���Χ���򷵻�2���޸ĳɹ��򷵻�1��ѧ��δѡ��ÿγ��򷵻�0
	int editGrade(String id, String cno, String sno, String grade);
	
	//ɾ��ĳһ�γ�ĳһѧ���ĳɼ�������Ϊ��ʦ�˺š��γ̺š�ѧ��
	//��ѧ��δѡ��ÿγ��򷵻�0��ɾ���ɹ��򷵻�1��ѧ��ԭ���޳ɼ��򷵻�2
	int deleteGrade(String id, String cno, String sno);
	
	//��ѯĳһ�γ̵�����ѧ���ɼ�������Ϊ�γ̺�
	//����ѧ��ѡ�γɼ���Ϣ���飨ѧ�� ���� �ɼ���
	ArrayList<String> searchGrade(String cno);
	
	//��ѯ���пγ���Ϣ
	ArrayList<String> searchCourse();
	
	//�жϽ�ʦ�Ƿ�Ϊĳһ�γ̵���ʦ�����򷵻�1�����򷵻�0���γ̺Ų������򷵻�2
	int searchCourseTeacher(String id, String cno);
}
