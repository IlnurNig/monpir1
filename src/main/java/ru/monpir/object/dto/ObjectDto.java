package ru.monpir.object.dto;

import lombok.Getter;
import lombok.Setter;
import ru.monpir.project.model.Project;

@Getter
@Setter
public class ObjectDto {
    private long id;

    private String name;

    private Project project;
}
