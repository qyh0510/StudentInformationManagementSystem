package cn.cuc.sims.inter;

public interface UserService {
	//ʹ���˺š������½�˻����ɹ���¼����0���˺Ŵ��󷵻�1���ʺ����û����Ͳ�ƥ�䷵��2��������󷵻�3
	int login(String type, String id, String PWD);
	
	//�޸�����,����Ϊ��������û��˺�
	//���޸ĳɹ��򷵻�1�������������������ͬ�򷵻�0
	int changePassword(String newPWD, String id);
}
