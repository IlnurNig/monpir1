package ru.monpir.documentationPd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.monpir.documentationPd.model.DocumentationPd;
import ru.monpir.documentationPd.repository.DocumentationPdRepository;

@Service
public class DocumentationPdService {
    private final DocumentationPdRepository documentationPdRepository;

    @Autowired
    public DocumentationPdService(DocumentationPdRepository documentationRdRepository) {
        this.documentationPdRepository = documentationRdRepository;
    }

    public DocumentationPd create(DocumentationPd documentationRd) {
        return documentationPdRepository.save(documentationRd);
    }

    public DocumentationPd update(DocumentationPd documentationRd) {
        return documentationPdRepository.save(documentationRd);
    }

    public DocumentationPd getById(Long id) {
        return documentationPdRepository.getReferenceById(id);
    }
}
