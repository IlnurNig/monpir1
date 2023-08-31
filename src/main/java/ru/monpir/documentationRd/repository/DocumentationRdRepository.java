package ru.monpir.documentationRd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.monpir.documentationRd.model.DocumentationRd;

public interface DocumentationRdRepository extends JpaRepository<DocumentationRd, Long> {
}
