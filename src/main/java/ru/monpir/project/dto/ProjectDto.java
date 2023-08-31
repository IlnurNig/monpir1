package ru.monpir.project.dto;

import lombok.Getter;
import lombok.Setter;
import ru.monpir.object.model.ObjectPir;

import java.util.Set;

@Getter
@Setter
public class ProjectDto {
    private long id;

    private String name;

    private String code;

    private Set<ObjectPir> objectPirs;

}
