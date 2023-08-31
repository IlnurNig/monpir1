package ru.monpir.project;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.monpir.project.dto.ProjectDto;
import ru.monpir.project.dto.ProjectMapper;
import ru.monpir.project.service.ProjectService;

@RestController
@RequestMapping(path = "/projects")
@Slf4j
public class ProjectController {

    private final ProjectService projectService;
    private final ProjectMapper projectMapper;

    @Autowired
    public ProjectController(ProjectService projectService,
                             ProjectMapper projectMapper) {
        this.projectService = projectService;
        this.projectMapper = projectMapper;
    }

    @PostMapping
    public ProjectDto createProject(@RequestBody ProjectDto projectDto) {
        log.info("POST /projects {}", projectDto);
        return projectMapper.toDto(projectService.createProject(projectMapper.fromDto(projectDto)));
    }

    @PatchMapping("/{projectId}")
    public ProjectDto updateProject(@RequestBody ProjectDto projectDto,
                                    @PathVariable("projectId") long projectId) {
        log.info("PATCH /projects/{}", projectId);
        projectDto.setId(projectId);
        return projectMapper.toDto(projectService.updateProject(projectMapper.fromDto(projectDto)));
    }

    @GetMapping("/{projectId}")
    public ProjectDto getProjectDtoById(@PathVariable("projectId") long projectId) {
        log.info("GET /projects/{}", projectId);
        return projectMapper.toDto(projectService.getById(projectId));
    }
}
