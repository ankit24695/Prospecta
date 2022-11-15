package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer>{

	public List<Project> findByCategory(String category);
}
