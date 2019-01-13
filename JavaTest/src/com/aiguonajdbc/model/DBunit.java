package com.aiguonajdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBunit {
	private static final String URL = "jdbc:mysql://localhost:3306/imooc?characterEncoding=utf-8&useSSL=true";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private static Connection conn = null;
	static {
		// 1.��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2.�������
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return conn;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.��������
		Class.forName("com.mysql.jdbc.Driver");
		// 2.�������
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		// 3.�������ݿ�
		Statement stmt = conn.createStatement();
		// 4.��ѯ
		ResultSet re = stmt.executeQuery("select  user_name,age from imooc_goddess");

		// 5.��ӡ
		while (re.next()) {
			System.out.println(re.getString("user_name") + "," + re.getInt("age"));
		}
	}
}
