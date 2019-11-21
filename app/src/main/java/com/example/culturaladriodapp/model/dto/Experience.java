package com.example.culturaladriodapp.model.dto;

import java.io.Serializable;
import java.util.Date;

public class Experience implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Integer id;

	private Integer groupId;

	private Integer artistHasSkillId;
	
	private String description;
	
	private Date initialDate;
	
	private Date finalDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getArtistHasSkillId() {
		return artistHasSkillId;
	}

	public void setArtistHasSkillId(Integer artistHasSkillId) {
		this.artistHasSkillId = artistHasSkillId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	
}
