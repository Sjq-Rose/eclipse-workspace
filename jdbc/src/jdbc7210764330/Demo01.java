package jdbc7210764330;

import java.sql.*;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useUnicode=true&characterEncoding=UTF-8";
		String username = "root";
		String password = "123456";
		con = DriverManager.getConnection(url, username, password);
		String sql = "select * from  xs  where name =? ";
		pstmt = con.prepareStatement(sql);
		System.out.println("«Î ‰»Î–’√˚£∫");
		Scanner scanner = new Scanner(System.in);
		String xm = scanner.next();
		pstmt.setObject(1, xm);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			String name = rs.getString("name");
			int id = rs.getInt("id");
			Double code = rs.getDouble("code");
			System.out.println(name + "  |  " + id + "    |   " + code);
		}

		if (rs != null) {
			rs.close();
		}

		if (pstmt != null) {
			pstmt.close();
		}

		if (con != null) {
			con.close();
		}

	}

}
