package cn.cuc.sims.data;

import java.sql.*;

public class DatabaseConnection {
	public Connection connectDB() {
		try {
			// ����URL����jdbc:mysql://��������ַ/���ݿ��� ����½�û��������� ��
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement?serverTimezone=UTC", "root","qyh051064728525!");
			System.out.println("����MySql server�ɹ�!");
			return connect;
		} catch (SQLException e) {
			System.out.println("����Mysql serverʧ��!");
	    	System.out.println(e.toString());
		}
		return null;
	}
}
