package ru.monpir.object.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.monpir.object.model.ObjectPir;

public interface ObjectRepository extends JpaRepository<ObjectPir, Long> {
}
