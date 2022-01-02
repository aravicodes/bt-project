package com.bugtracking.project.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Employee {
	@Id
	private long empId;
	private String empName;
	private String email;
	private String contactNo;
	private long projectId;
	
	public Employee(long empId, String empName, String email, String contactNo, long projectId,List<Project> projects) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.contactNo = contactNo;
		this.projectId = projectId;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public Employee() {
		
	}
}
