package ru.monpir.documentationRd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.monpir.documentationRd.dto.DocumentationRdDto;
import ru.monpir.documentationRd.dto.DocumentationRdMapper;
import ru.monpir.documentationRd.service.DocumentationRdService;
import ru.monpir.object.dto.ObjectDto;

@RestController
@RequestMapping(path = "/documentation/rd")
@Slf4j
public class DocumentationRdController {

    private final DocumentationRdService documentationRdService;
    private final DocumentationRdMapper documentationRdMapper;

    @Autowired
    public DocumentationRdController(DocumentationRdService documentationRdService,
                                     DocumentationRdMapper documentationRdMapper) {
        this.documentationRdService = documentationRdService;
        this.documentationRdMapper = documentationRdMapper;
    }


    @PostMapping
    public DocumentationRdDto create(@RequestBody DocumentationRdDto documentationRdDto) {
        log.info("POST /documentation/rd {}", documentationRdDto);
        return documentationRdMapper.toDto(
                documentationRdService.create(documentationRdMapper.fromDto(documentationRdDto)));
    }

    @PatchMapping("/{documentation_rd_id}")
    public DocumentationRdDto update(@RequestBody DocumentationRdDto documentationRdDto,
                                     @PathVariable("documentation_rd_id") long id) {
        log.info("PATCH /documentation/rd/{}", id);
        documentationRdDto.setId(id);
        return documentationRdMapper.toDto(
                documentationRdService.update(documentationRdMapper.fromDto(documentationRdDto)));
    }

    @GetMapping("/{documentation_rd_id}")
    public DocumentationRdDto getById(@PathVariable("documentation_rd_id") long id) {
        log.info("GET /documentation/rd/{}", id);
        return documentationRdMapper.toDto(documentationRdService.getById(id));
    }

}
