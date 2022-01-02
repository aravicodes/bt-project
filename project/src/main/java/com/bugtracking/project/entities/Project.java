package com.bugtracking.project.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Project{
	@Id
	private long projId;
	private String projName;
	
	@OneToMany
	private List<Employee> members;
	private String projStatus;
	
	public List<Employee> getMembers() {
		return members;
	}
	public void setMembers(List<Employee> members) {
		this.members = members;
	}
	public long getProjId() {
		return projId;
	}
	public void setProjId(long projId) {
		this.projId = projId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	
	public String getProjStatus() {
		return projStatus;
	}
	public void setProjStatus(String projStatus) {
		this.projStatus = projStatus;
	}
	
	public Project() {
		
	}
	public Project(long projId, String projname, List<Employee> members, String projstatus) {
		super();
		this.projId = projId;
		this.projName = projname;
		this.members = members;
		this.projStatus = projstatus;
	}
	
}
