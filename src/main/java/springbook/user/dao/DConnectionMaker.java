package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//ConnectionMaker 구현 클래스
public class DConnectionMaker implements ConnectionMaker{
	public Connection makeConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "springbook", "elcue");
		return c;	
	}
}