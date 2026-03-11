package com.synet.demoBack;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArchivoRepository extends MongoRepository<CasoClinico, String> {

    // Buscar por categoría
    List<CasoClinico> findByCategoria(String categoria);

    // Buscar por dificultad
    List<CasoClinico> findByDificultad(String dificultad);
}