package com.task.openapi.custom.repository;

import com.task.openapi.custom.model.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DrugRepository extends JpaRepository<Drug, UUID> {
}
