package cn.cuc.sims.inter;

import java.util.ArrayList;

public interface StuService {
	//��ѯ������Ϣ������Ϊ�˺�
	//���ر�����Ϣ�ַ�����ѧ�� ���� �Ա� ���䣩
	String searchSno(String id);
	String searchName(String id);
	String searchSex(String id);
	String searchAge(String id);
	
	//��ѯ���пγ̳ɼ�������Ϊѧ������
	//�����������򷵻ر��ˡ��γ̺�	�γ��� �ɼ����ַ������飬���򷵻ؿ�ֵ
	ArrayList<String> searchGrade(String id);
}
