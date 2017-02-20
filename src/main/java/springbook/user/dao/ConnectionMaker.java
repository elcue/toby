package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * toby Vol.1
 * 클래스명 : ConnectionMaker.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 20.
 * 클래스 소개 : Connection interface
 */
public interface ConnectionMaker {
	public Connection makeConnection() throws ClassNotFoundException,SQLException;

}
