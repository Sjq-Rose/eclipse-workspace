package jdbc7210764330;

import java.sql.*;
import java.sql.Statement;


//实现例题9-1，要求为一个宿舍四个人的信息，第一个人为本人
public class Demo02 {

	public static void main(String[] args) throws Exception {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL = false&useUnicode = true&characterEncoding = UTF-8";
        String username = "root";
        String password = "123456";
        con = DriverManager.getConnection(url,username,password);
        stmt =  con.createStatement();
        String sql = "select * from tb_user";
        rs = stmt.executeQuery(sql);
        System.out.println("id     |    name     |    birthday    |    email" );
        while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			Date birthday = rs.getDate("birthday");
			String email = rs.getString("email");
			System.out.println(id + "     |  " + name  + "      |   "  +birthday  + "   |   "+ email );
		}
        
        if (rs != null) {
			rs.close();
		}
        
        if (stmt != null) {
			stmt.close();
		}
        
        if (con != null) {
			con.close();
		}
        
        
        
	}

}
