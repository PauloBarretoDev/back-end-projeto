package com.projetao.f1databasebackend.repository;

import com.projetao.f1databasebackend.model.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotoRepository extends JpaRepository<Piloto, Long> {
}
