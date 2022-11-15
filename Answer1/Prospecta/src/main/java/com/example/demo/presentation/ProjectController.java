package com.example.demo.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ProjectException;
import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/project/{categoryName}")
	public ResponseEntity<List<Project>> getListofProjectByCategory(@PathVariable("categoryName") String category) throws ProjectException{
		
		List<Project> list = projectService.getallPrject(category);
		
		return new ResponseEntity<List<Project>>(list, HttpStatus.OK);
	}
	
	@PostMapping("/addproject")
	public ResponseEntity<Project> addProject(@RequestBody Project project){
		
		Project newproject = projectService.addProject(project);
		
		return new ResponseEntity<Project>(newproject, HttpStatus.ACCEPTED);
	}
}
