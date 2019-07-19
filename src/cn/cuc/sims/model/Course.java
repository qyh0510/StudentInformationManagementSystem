package cn.cuc.sims.model;

public class Course {
	private String cno;		//课程号
	private String jno;		//教工号
	private String cname;		//课程名
	private int credit;		//学分
	
	public Course(String cno, String jno, String cname, int credit) {
		this.cno = cno;
		this.jno = jno;
		this.cname = cname;
		this.credit = credit;
	}
	public Course(Course c) {
		this.cno = c.cno;
		this.jno = c.jno;
		this.cname = c.cname;
		this.credit = c.credit;
	}
	
	public void setCno(String cno) {
		this.cno = cno;
	}
	public void setJno(String jno) {
		this.jno = jno;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getCno() {
		return cno;
	}
	public String getJno() {
		return jno;
	}
	public String getCname() {
		return cname;
	}
	public int getCredit() {
		return credit;
	}
}
