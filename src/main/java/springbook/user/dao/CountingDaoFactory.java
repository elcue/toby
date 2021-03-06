package springbook.user.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

/**
 * toby Vol.1
 * 클래스명 : CountingDaoFactory.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 20.
 * 클래스 소개 : DaoFactory와 달리, connectionMaker() 메소드에서 CountingConnectionMaker 타입 오브젝트를 생성하도록 만듦
 */

@Configuration
public class CountingDaoFactory {
	@Bean
	public DataSource dataSource(){
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		return dataSource;
	}
	
	@Bean
	public UserDao userDao(){
		UserDao userDao = new UserDao();
		userDao.setDataSource(dataSource());
		return userDao;
	}
	
	@Bean
	public ConnectionMaker connectionMaker(){
		return new CountingConnectionMaker(realConnectionMaker());
	}
	
	@Bean
	public ConnectionMaker realConnectionMaker(){
		return new DConnectionMaker();
	}
}
