package ru.monpir.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.monpir.project.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
