package com.bugtracking.project.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.bugtracking.project.dto.ProjectDto;
import com.bugtracking.project.entities.Project;

public class ProjectMapper {
	
	public static Project toProject(ProjectDto employeeDto) {
		Project project=new Project();
		project.setProjId(employeeDto.getProjId());
		project.setProjName(employeeDto.getProjName());
		project.setProjStatus(employeeDto.getProjStatus());
		project.setMembers(employeeDto.getMembers());
		return project;
	}
	
	public static ProjectDto toProjectDto(Project employee) {
		ProjectDto projectDto=new ProjectDto();
		projectDto.setProjId(employee.getProjId());
		projectDto.setProjName(employee.getProjName());
		projectDto.setProjStatus(employee.getProjStatus());
		projectDto.setMembers(employee.getMembers());;
		return projectDto;
	}
	
	public static List<ProjectDto> toProjectDtoList(List<Project> projects){
		return projects.stream().map(ProjectMapper::toProjectDto).collect(Collectors.toList());
	}

}