package com.bugtracking.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bugtracking.project.dto.ProjectDto;
import com.bugtracking.project.services.IProjectService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api
@RestController
public class ProjectController {
	
	@Autowired
	IProjectService ps;
	
	@ApiOperation("Used to fetch all projects")
	@GetMapping("/projects")
	public List<ProjectDto> getAllProjects(){
		return ps.getAllProjects();		
	}
	
	@ApiOperation("Used to fetch project with particular id")
	@GetMapping("/projects/{projId}")
	public ProjectDto getProject(@PathVariable long projId) {
		return ps.getProject(projId);
	}

	@ApiOperation("Used to create project")
	@PostMapping("/projects")
	public ProjectDto createProject(@Valid @RequestBody ProjectDto projDto){
		return ps.createProject(projDto);		
	}
	
	@ApiOperation("Used to update project")
	@PutMapping("/projects")
	public ProjectDto updateProject(@PathVariable("empId")long projId, @Valid @RequestBody ProjectDto projDto){
		return ps.updateProject(projId,projDto);		
	}
	
	@ApiOperation("Used to delete project with particular id")
	@DeleteMapping("/projects/{projId}")
	public ProjectDto deleteProject(@PathVariable long projId) {
		return ps.deleteProject(projId);
	}

}
