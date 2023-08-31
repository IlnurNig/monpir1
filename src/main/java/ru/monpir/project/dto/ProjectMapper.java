package ru.monpir.project.dto;

import org.mapstruct.Mapper;
import ru.monpir.project.model.Project;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    Project fromDto(ProjectDto projectDto);

    ProjectDto toDto(Project project);
}
