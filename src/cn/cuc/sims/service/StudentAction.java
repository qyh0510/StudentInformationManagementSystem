package cn.cuc.sims.service;

import java.util.ArrayList;

import cn.cuc.sims.data.DataOperation;
import cn.cuc.sims.inter.StuService;

public class StudentAction implements StuService {
	DataOperation data;
	
	public StudentAction() {
		data = new DataOperation();
	}

	@Override
	public String searchSno(String id) {
		String s = data.findSno(id);
		//System.out.println(s);
		return s;
	}

	@Override
	public String searchName(String id) {
		String s = data.findName(id);
		//System.out.println(s);
		return s;
	}

	@Override
	public String searchSex(String id) {
		String s = data.findSex(id);
		//System.out.println(s);
		return s;
	}

	@Override
	public String searchAge(String id) {
		String s = data.findAge(id);
		//System.out.println(s);
		return s;
	}

	@Override
	public ArrayList<String> searchGrade(String id) {
		String sno = data.findSno(id);
		return data.findStuCourse(sno);
	}

}
