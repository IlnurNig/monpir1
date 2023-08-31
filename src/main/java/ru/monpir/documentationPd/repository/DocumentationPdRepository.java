package ru.monpir.documentationPd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.monpir.documentationPd.model.DocumentationPd;

public interface DocumentationPdRepository extends JpaRepository<DocumentationPd, Long> {
}
