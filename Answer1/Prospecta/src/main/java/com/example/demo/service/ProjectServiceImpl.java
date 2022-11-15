package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ProjectException;
import com.example.demo.model.Project;
import com.example.demo.repository.ProjectDao;

@Service
public class ProjectServiceImpl implements ProjectService{
    
	@Autowired
	private ProjectDao projectdao;

	@Override
	public List<Project> getallPrject(String Category) throws ProjectException {
       List<Project> list = projectdao.findByCategory(Category);
		
		if(list.size()==0) {
			throw new ProjectException("No Project Found for this category");
		}
		return list;
	}

	@Override
	public Project addProject(Project project) {
		
		Project newProject = projectdao.save(project);
		
		return newProject;
	}

	
	
	
	
}
