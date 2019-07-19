package cn.cuc.sims.model;

public class User {
	private String id;		//�˺�
	private String password;		//����
	private String name;		//����
	private String sex;		//�Ա�
	private int age;		//����
	
	//���캯��
	//���ݾ�������趨�û�
	public User(String id, String password, String name, String sex, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//�����Ѵ����û��趨�û�
	public User(User u) {
		this.id = u.id;
		this.password = u.password;
		this.name = u.name;
		this.sex = u.sex;
		this.age = u.age;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
}
