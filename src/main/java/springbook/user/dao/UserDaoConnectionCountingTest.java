package springbook.user.dao;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * toby Vol.1
 * 클래스명 : UserDaoConnectionCountingTest.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 20.
 * 클래스 소개 : 커넥션카운팅 실행코드. DAO의 사용횟수가 일치하는지 확인.
 */
public class UserDaoConnectionCountingTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CountingDaoFactory.class);
			UserDao dao = context.getBean("userDao", UserDao.class);
			
			//DAO 사용 코드
			//DL(의존관계 검색)을 사용하면 이름을 이용해 어떤 빈이든 가져올 수 있다.
			CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
			System.out.println("Connection counter : " + ccm.getCounter());
	}
}
