package ru.monpir.documentationRd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.monpir.documentationRd.model.DocumentationRd;
import ru.monpir.documentationRd.repository.DocumentationRdRepository;
import ru.monpir.object.model.ObjectPir;

@Service
public class DocumentationRdService {
    private final DocumentationRdRepository documentationRdRepository;

    @Autowired
    public DocumentationRdService(DocumentationRdRepository documentationRdRepository) {
        this.documentationRdRepository = documentationRdRepository;
    }

    public DocumentationRd create(DocumentationRd documentationRd) {
        return documentationRdRepository.save(documentationRd);
    }

    public DocumentationRd update(DocumentationRd documentationRd) {
        return documentationRdRepository.save(documentationRd);
    }

    public DocumentationRd getById(Long id) {
        return documentationRdRepository.getReferenceById(id);
    }
}
