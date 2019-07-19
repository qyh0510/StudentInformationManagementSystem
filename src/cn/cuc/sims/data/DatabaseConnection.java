package cn.cuc.sims.data;

import java.sql.*;

public class DatabaseConnection {
	public Connection connectDB() {
		try {
			// 连接URL：“jdbc:mysql://服务器地址/数据库名 ，登陆用户名，密码 ”
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement?serverTimezone=UTC", "root","qyh051064728525!");
			System.out.println("连接MySql server成功!");
			return connect;
		} catch (SQLException e) {
			System.out.println("连接Mysql server失败!");
	    	System.out.println(e.toString());
		}
		return null;
	}
}
