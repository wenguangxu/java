package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
	
	//String driver = "oracle.jdbc.driver.OracleDriver";
	static String driver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://127.0.0.1:3306/test";
	static String userName = "root";
	static String pwd = "ok";
	
	public static void main(String[] args) {
		
		
		
		ResultSet rs = null;
		PreparedStatement stmt = null;
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,userName,pwd);
			stmt = conn.prepareStatement("select * from log");
			rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("uname"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
