package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.ProjectException;
import com.example.demo.model.Project;

public interface ProjectService {

	public List<Project> getallPrject(String Category) throws ProjectException;
	
	public Project addProject(Project project);
}
