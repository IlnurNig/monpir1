package ru.monpir.documentationPd.dto;

import org.mapstruct.Mapper;
import ru.monpir.documentationPd.model.DocumentationPd;


@Mapper(componentModel = "spring")
public interface DocumentationPdMapper {
    DocumentationPd fromDto(DocumentationPdDto documentationRdDto);

    DocumentationPdDto toDto(DocumentationPd documentationRd);
}
