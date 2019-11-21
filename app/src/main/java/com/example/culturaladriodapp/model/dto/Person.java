package com.example.culturaladriodapp.model.dto;

import java.io.Serializable;





public class Person implements Serializable {


	private static final long serialVersionUID = 1L;


	private Integer id;
	
	

	private String userName;
	

	private String email;


	private String password;
	

	private String clazz_;
	

	protected int subTypeId;

	
	public Person(Integer id, String userName, String email, String password) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	

	public Person() {
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getClazz_() {
		return clazz_;
	}



	public void setClazz_(String clazz_) {
		this.clazz_ = clazz_;
	}



	public int getSubTypeId() {
		return subTypeId;
	}



	public void setSubTypeId(int subTypeId) {
		this.subTypeId = subTypeId;
	}
	
	

	
}
