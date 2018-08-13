package com.movesale.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBC_Oracle {

	// �������ݿ�Ĺ�����
	private Connection conn = null;

	// ���巽�� ��ȡ���ݿ�����
	public Connection getConnection() {
		// ��ȡ�����ļ�
		ResourceBundle bundle = ResourceBundle.getBundle("ConnDB");
		String driver = bundle.getString("driver");
		String url = bundle.getString("url");
		String username = bundle.getString("username");
		String password = bundle.getString("password");

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return conn;
	}

	// �ر�������
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
			System.out.println("���ݿ�ر��쳣");
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
			System.out.println("���ݿ�ر��쳣");
			// e.printStackTrace();
		}
	}
}
