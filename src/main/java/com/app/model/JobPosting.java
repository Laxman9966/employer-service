package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity()
@Table(name = "jobposting")
public class JobPosting {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "EMPLR_ID")
	private String employerId;
	
	@Column(name = "KEY_SKILLS")
	private String keyskills;
	
	@Column(name = "JTITLE")
	private String jtitle;

	public String getJtitle() {
		return jtitle;
	}

	public void setJtitle(String jtitle) {
		this.jtitle = jtitle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployerId() {
		return employerId;
	}

	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}

	public String getKeyskills() {
		return keyskills;
	}

	public void setKeyskills(String keyskills) {
		this.keyskills = keyskills;
	}

	
//	public int getJobtitle() {
//		return jobtitle;
//	}
//
//	public void setJobtitle(int jobtitle) {
//		this.jobtitle = jobtitle;
//	}

	@Override
	public String toString() {
		return "JobPosting [id=" + id + ", employerId=" + employerId + ", keyskills=" + keyskills + ", jobTitle="
				+ jtitle + "]";
	}

	

	
	
	
	
	
	
}
