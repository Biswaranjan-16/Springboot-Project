package com.portfolio.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
