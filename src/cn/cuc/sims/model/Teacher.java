package cn.cuc.sims.model;

public class Teacher extends User {
	private String jno;		//¹¤ºÅ
	
	public Teacher(String id, String password, String name, String sex, int age, String jno) {
		super(id, password, name, sex, age);
		this.jno  = jno;
	}
	public Teacher(Teacher t) {
		super(t);
		this.jno  = t.jno;
	}
	
	public void setJno(String jno) {
		this.jno = jno;
	}
	public String getJno() {
		return jno;
	}
}
