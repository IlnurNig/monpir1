package ru.monpir.object;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.monpir.object.dto.ObjectDto;
import ru.monpir.object.dto.ObjectMapper;
import ru.monpir.object.service.ObjectService;

@RestController
@RequestMapping(path = "/objects")
@Slf4j
public class ObjectController {
    private final ObjectService objectService;
    private final ObjectMapper objectMapper;

    @Autowired
    public ObjectController(ObjectService objectService, ObjectMapper objectMapper) {
        this.objectService = objectService;
        this.objectMapper = objectMapper;
    }


    @PostMapping
    public ObjectDto createObject(@RequestBody ObjectDto objectDto) {
        log.info("POST /objects {}", objectDto);
        return objectMapper.toDto(objectService.createObject(objectMapper.fromDto(objectDto)));
    }

    @PatchMapping("/{objectId}")
    public ObjectDto updateObject(@RequestBody ObjectDto objectDto,
                                   @PathVariable("objectId") long objectId) {
        log.info("PATCH /objects/{}", objectId);
        objectDto.setId(objectId);
        return objectMapper.toDto(objectService.updateObject(objectMapper.fromDto(objectDto)));
    }

    @GetMapping("/{objectId}")
    public ObjectDto getUserDtoById(@PathVariable("objectId") long objectId) {
        log.info("GET /objects/{}", objectId);
        return objectMapper.toDto(objectService.getById(objectId));
    }
}
