package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

//ConnectionMaker 구현 클래스
public class DConnectionMaker implements ConnectionMaker{
	public Connection makeConnection() throws ClassNotFoundException, SQLException{
		//D사의 독자적인 방법으로 Connection을 생성하는 코드
		return null;	
	}
}
