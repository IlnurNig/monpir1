package ru.monpir.documentationPd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.monpir.documentationPd.dto.DocumentationPdDto;
import ru.monpir.documentationPd.dto.DocumentationPdMapper;
import ru.monpir.documentationPd.service.DocumentationPdService;

@RestController
@RequestMapping(path = "/documentation/pd")
@Slf4j
public class DocumentationPdController {

    private final DocumentationPdService documentationPdService;
    private final DocumentationPdMapper documentationPdMapper;

    @Autowired
    public DocumentationPdController(DocumentationPdService documentationPdService,
                                     DocumentationPdMapper documentationPdMapper) {
        this.documentationPdService = documentationPdService;
        this.documentationPdMapper = documentationPdMapper;
    }


    @PostMapping
    public DocumentationPdDto create(@RequestBody DocumentationPdDto documentationPdDto) {
        log.info("POST /documentation/pd {}", documentationPdDto);
        return documentationPdMapper.toDto(
                documentationPdService.create(documentationPdMapper.fromDto(documentationPdDto)));
    }

    @PatchMapping("/{documentation_pd_id}")
    public DocumentationPdDto update(@RequestBody DocumentationPdDto documentationPdDto,
                                     @PathVariable("documentation_pd_id") long id) {
        log.info("PATCH /documentation/pd/{}", id);
        documentationPdDto.setId(id);
        return documentationPdMapper.toDto(
                documentationPdService.update(documentationPdMapper.fromDto(documentationPdDto)));
    }

    @GetMapping("/{documentation_pd_id}")
    public DocumentationPdDto getById(@PathVariable("documentation_pd_id") long id) {
        log.info("GET /documentation/pd/{}", id);
        return documentationPdMapper.toDto(documentationPdService.getById(id));
    }

}
