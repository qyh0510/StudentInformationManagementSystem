package cn.cuc.sims.inter;


public interface AdminService {
	//�޸�ѧ����Ϣ������/�Ա�/����/ѧ�֣�������Ϊ��Ϣ���͡�����Ϣ��id1ѧ���˺š�id2����Ա�˺�
	//���޸ĳɹ��򷵻�1��ѧ�������򷵻�2���������󷵻�0
	int setStudentInfo(String type, String info, String id1, String id2);
	
	//����ĳһ�γ̵Ľ�ʦ������Ϊ�γ̺źͽ̹���
	//���޸ĳɹ��򷵻�1���γ̺Ż�̹��������򷵻�0
	int setTeacher(String cno, String jno);
}
