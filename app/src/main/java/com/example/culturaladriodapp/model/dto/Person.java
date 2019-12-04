package com.example.culturaladriodapp.model.dto;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;




@DatabaseTable
public class Person implements Serializable {


	@DatabaseField(id = true)
	private Integer id;

	@DatabaseField
	private String userName;

	@DatabaseField
	private String email;

	@DatabaseField
	private String password;

	@DatabaseField
	private String clazz_;

	@DatabaseField
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
