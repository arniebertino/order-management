package com.neon.ordermanagement.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="USER_ENTITY")
public class UserEntity {

	@Id   
    @Column(name="USER_NAME")
	private String userName;
    
    @Column(name="PASSWORD")
	private String password;

public UserEntity() {
	
}  

public UserEntity(String userName,String password) {
	super();
	this.userName = userName;
	this.password = password;
}


public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}