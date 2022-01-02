package com.bugtracking.project.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtracking.project.exceptions.IdNotFoundException;
import com.bugtracking.project.mapper.ProjectMapper;

import com.bugtracking.project.dto.ProjectDto;
import com.bugtracking.project.entities.Project;
import com.bugtracking.project.repository.IProjectRepository;

@Transactional
@Service("ps")
public class ProjectServiceImpl implements IProjectService{

	@Autowired
	IProjectRepository pr;

	@Override
	public ProjectDto createProject(ProjectDto p) {
		Project projObj = ProjectMapper.toProject(p);
		Project proj = pr.save(projObj);
		return ProjectMapper.toProjectDto(proj);
	}

	@Override
	public ProjectDto updateProject(long projId,ProjectDto p) {
		// TODO Auto-generated method stub
		if(pr.existsById(projId)) {
			Project projObj = ProjectMapper.toProject(p);
			//System.out.println(empObj.());
			Project proj = pr.save(projObj);
			return ProjectMapper.toProjectDto(proj);
		}
		else {
			throw new IdNotFoundException("Provided id is not there");
		}
	}

	@Override
	public ProjectDto deleteProject(long projId) {
		if (pr.existsById(projId)) {
			ProjectDto projDto = ProjectMapper.toProjectDto(pr.getById(projId));
			pr.deleteById(projId);
			return projDto;
		} else
			throw new IdNotFoundException("id not found");
	}

	@Override
	public ProjectDto getProject(long projId) {
		// TODO Auto-generated method stub
		Optional<Project> proj = pr.findById(projId);
		if (proj.isPresent())
			return ProjectMapper.toProjectDto(proj.get());
		else
			throw new IdNotFoundException("id not found");

	}

	@Override
	public List<ProjectDto> getAllProjects() {
		List<ProjectDto> projDto = ProjectMapper.toProjectDtoList(pr.findAll());
		return projDto;

	}
}
