package com.movesale.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBC_Oracle {

	// 链接数据库的工具类
	private Connection conn = null;

	// 定义方法 获取数据库链接
	public Connection getConnection() {
		// 获取配置文件
		ResourceBundle bundle = ResourceBundle.getBundle("ConnDB");
		String driver = bundle.getString("driver");
		String url = bundle.getString("url");
		String username = bundle.getString("username");
		String password = bundle.getString("password");

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return conn;
	}

	// 关闭数据流
	public void closeConn(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("数据库关闭异常");
			// e.printStackTrace();
		}
	}

	public void closeConn(PreparedStatement pstmt, Connection conn) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("数据库关闭异常");
			// e.printStackTrace();
		}
	}
}
