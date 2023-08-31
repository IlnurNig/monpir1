package ru.monpir.object.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.monpir.object.model.ObjectPir;
import ru.monpir.object.repository.ObjectRepository;

@Service
public class ObjectService {
    private final ObjectRepository objectRepository;

    @Autowired
    public ObjectService(ObjectRepository objectRepository) {
        this.objectRepository = objectRepository;
    }

    public ObjectPir createObject(ObjectPir objectPir) {
        return objectRepository.save(objectPir);
    }

    public ObjectPir updateObject(ObjectPir objectPir) {
        return objectRepository.save(objectPir);
    }

    public ObjectPir getById(Long id) {
        return objectRepository.getReferenceById(id);
    }
}
