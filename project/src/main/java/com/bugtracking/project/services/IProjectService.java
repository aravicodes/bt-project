package com.bugtracking.project.services;

import java.util.List;

import com.bugtracking.project.dto.ProjectDto;

public interface IProjectService
{
	public ProjectDto createProject(ProjectDto projectDto);
	public ProjectDto updateProject(long projId, ProjectDto projectDto);
	public ProjectDto deleteProject(long projId);
	public ProjectDto getProject(long projId);
	public  List<ProjectDto> getAllProjects();
}
