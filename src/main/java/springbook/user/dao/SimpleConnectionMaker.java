package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//더 이상 상속을 이용한 확장 방식을 사용할 필요가 없으니 추상 클래스로 만들 필요가 없다.
/**
 * toby Vol.1
 * 클래스명 : SimpleConnectionMaker.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 20.
 * 클래스 소개 : DB 연결
 */
public class SimpleConnectionMaker {
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "springbook", "elcue");
		
		return c;
	}
}