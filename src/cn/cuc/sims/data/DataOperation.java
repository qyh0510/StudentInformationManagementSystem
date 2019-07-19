package cn.cuc.sims.data;

import java.sql.*;
import java.util.ArrayList;

import cn.cuc.sims.inter.Data;

public class DataOperation implements Data {
	DatabaseConnection db;
	Connection connect;
	
	public DataOperation() {
		db = new DatabaseConnection();
		connect = db.connectDB();
	}
	
	@Override
	public int findUserId(String id) {
		String sql="select * from user where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				return 1;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public int findStuId(String id) {
		String sql="select * from student where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				return 1;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public int findTeacherId(String id) {
		String sql="select * from teacher where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				return 1;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public int findAdminId(String id) {
		String sql="select * from admin where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				return 1;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public String findPWD(String id) {
		String sql="select * from user where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String password = rs.getString("password");
			    System.out.println(password);
			    return password;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public void setPWD(String newPWD, String id) {
		String sql = "update user set password='" + newPWD + "' where id='" + id + "'";
		db = new DatabaseConnection();
		Connection connect = db.connectDB();
		try{
			//预处理
			PreparedStatement presta = connect.prepareStatement(sql);
			presta.execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public String findSno(String id) {
		String sql="select * from student where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String sno = rs.getString("sno");
			    System.out.println(sno);
			    return sno;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public String findName(String id) {
		String sql="select * from user where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String name = rs.getString("name");
			    System.out.println(name);
			    return name;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public String findSex(String id) {
		String sql="select * from user where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String sex = rs.getString("sex");
			    System.out.println(sex);
			    return sex;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public String findAge(String id) {
		String sql="select * from user where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String age = rs.getString("age");
			    System.out.println(age);
			    return age;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<String> findStuCourse(String sno) {
		ArrayList<String> s = new ArrayList<String>();
		String sql="select * from SC,course where SC.cno=course.cno and sno='" + sno + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String cno = rs.getString("SC.cno");
				String cname = rs.getString("cname");
				String grade = rs.getString("grade");
				String result = cno + "     " + cname + "     " + grade;
			    System.out.println(result);
			    s.add(result);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return s;
	}

	@Override
	public String findJno(String id) {
		String sql="select * from teacher where id='" + id + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String jno = rs.getString("jno");
			    System.out.println(jno);
			    return jno;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<String> searchCourseInfo(String jno) {
		ArrayList<String> s = new ArrayList<String>();
		String sql="select * from course,teacher where course.jno=teacher.jno and teacher.jno='" + jno + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String cno = rs.getString("cno");
			    String cname = rs.getString("cname");
			    String credit = rs.getString("credit");
			    String result = cno + "     " + cname + "     " + credit;
			    System.out.println(result);
			    s.add(result);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return s;
	}

	@Override
	public ArrayList<String> searchGrade(String cno) {
		ArrayList<String> s = new ArrayList<String>();
		String sql="select * from SC,student,user where SC.sno=student.sno and student.id=user.id and SC.cno='" + cno + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String sno = rs.getString("SC.cno");
			    String name = rs.getString("name");
			    String grade = rs.getString("grade");
			    String result = sno + "     " + name + "     " + grade;
			    System.out.println(result);
			    s.add(result);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return s;
	}

	@Override
	public void setStuGrade(String cno, String sno, String grade) {
		String sql="update SC set grade=" + grade + " where cno='" + cno + "' and sno='" + sno + "'";
		try{
			//预处理
			PreparedStatement presta = connect.prepareStatement(sql);
			presta.execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteCourse(String jno, String cno) {
		String sql="update course set jno=null where cno='" + cno + "' and jno='" + jno + "'";
		try{
			//预处理
			PreparedStatement presta = connect.prepareStatement(sql);
			presta.execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public String searchCourseTeacher(String cno) {
		String sql="select * from course where cno='" + cno + "'";
		String jno = null;
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				jno = rs.getString("jno");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return jno;
	}

	@Override
	public void setCourseTeacher(String jno, String cno) {
		String sql="update course set jno='" + jno + "' where cno='" + cno + "'";
		try{
			//预处理
			PreparedStatement presta = connect.prepareStatement(sql);
			presta.execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public void setName(String id, String name) {
		String sql="update user set name='" + name + "' where id='" + id + "'";
		try{
			//预处理
			PreparedStatement presta = connect.prepareStatement(sql);
			presta.execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public void setSex(String id, String sex) {
		String sql="update user set sex='" + sex + "' where id='" + id + "'";
		try{
			//预处理
			PreparedStatement presta = connect.prepareStatement(sql);
			presta.execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public void setAge(String id, String age) {
		String sql="update user set age=" + age + " where id='" + id + "'";
		try{
			//预处理
			PreparedStatement presta = connect.prepareStatement(sql);
			presta.execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public void setCredit(String id, String credit) {
		String sql="update student set credit=" + credit + " where id='" + id + "'";
		try{
			//预处理
			PreparedStatement presta = connect.prepareStatement(sql);
			presta.execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	public int findCourseCno(String cno) {
		String sql="select * from course where cno='" + cno + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				return 1;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public int findTeacherJno(String jno) {
		String sql="select * from teacher where jno='" + jno + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				return 1;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<String> findCourse() {
		ArrayList<String> s = new ArrayList<String>();
		String sql="select * from Course";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String cno = rs.getString("cno");
			    String cname = rs.getString("cname");
			    String credit = rs.getString("credit");
			    String result = cno + "     " + cname + "     " + credit;
			    System.out.println(result);
			    s.add(result);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return s;
	}

	@Override
	public int findCourseStudent(String sno, String cno) {
		String sql="select * from sc where cno='" + cno + "' and sno='" + sno + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				return 1;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public String searchScGrade(String sno, String cno) {
		String sql="select * from sc where cno='" + cno + "' and sno='" + sno + "'";
		try{
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String grade = rs.getString("grade");
			    System.out.println(grade);
			    return grade;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
	
}
