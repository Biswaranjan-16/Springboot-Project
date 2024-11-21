package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.portfolio.service.ProjectService;

@Controller
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "projects";
    }
}
