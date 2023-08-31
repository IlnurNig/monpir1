package ru.monpir.documentationRd.dto;

import org.mapstruct.Mapper;
import ru.monpir.documentationRd.model.DocumentationRd;


@Mapper(componentModel = "spring")
public interface DocumentationRdMapper {
    DocumentationRd fromDto(DocumentationRdDto documentationRdDto);

    DocumentationRdDto toDto(DocumentationRd documentationRd);
}
