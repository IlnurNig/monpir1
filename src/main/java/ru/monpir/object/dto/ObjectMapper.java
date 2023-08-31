package ru.monpir.object.dto;

import org.mapstruct.Mapper;
import ru.monpir.object.model.ObjectPir;


@Mapper(componentModel = "spring")
public interface ObjectMapper {

    ObjectPir fromDto(ObjectDto objectDto);

    ObjectDto toDto(ObjectPir objectPir);
}
