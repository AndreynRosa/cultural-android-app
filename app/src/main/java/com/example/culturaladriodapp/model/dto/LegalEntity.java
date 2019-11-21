package com.example.culturaladriodapp.model.dto;

import java.util.List;



public class LegalEntity extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String register;
	

	private String companyName;

	private List<CulturalArtifact> culturalArtifacts;
	

	public LegalEntity( String register, String companyName, List<CulturalArtifact> culturalArtifacts) {
		super();
		this.register = register;
		this.companyName = companyName;
		this.culturalArtifacts = culturalArtifacts;
	}
	
	
	public LegalEntity() {
		super();
	}


	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
