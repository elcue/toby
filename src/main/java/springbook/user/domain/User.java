
package springbook.user.domain;

/**
 * toby Vol.1
 * 클래스명 : User.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 20.
 * 클래스 소개 : DB 컬럼
 */
public class User {

	String id;
	String name;
	String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

