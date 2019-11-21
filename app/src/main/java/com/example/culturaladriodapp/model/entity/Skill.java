package com.example.culturaladriodapp.model.entity;

import com.example.culturaladriodapp.model.dto.Artist;

import java.io.Serializable;
import java.util.List;



public class Skill implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Integer id;
	

	private String name;
	

	private String status;
	
	private String description;
	

	private String includesDate;
	

	private List<Artist> artists;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIncludesDate() {
		return includesDate;
	}

	public void setIncludesDate(String includesDate) {
		this.includesDate = includesDate;
	}
	
	
}
