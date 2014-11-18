package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
	
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "system";
		String pwd = "ok";
		
		ResultSet rs = null;
		PreparedStatement stmt = null;
		Connection conn = null;
		
		try {
			Class.forName(driver);
			// new oracle.jdbc.driver.OracleDriver();
			conn = DriverManager.getConnection(url,userName,pwd);
			stmt = conn.prepareStatement("select * from users");
			rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("name"));
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
