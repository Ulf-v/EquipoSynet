package com.tuempresa.tuproyecto.repository;

import com.tuempresa.tuproyecto.model.Archivo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArchivoRepository extends MongoRepository<Archivo, String> {

    // Buscar por nombre (opcional)
    List<Archivo> findByNombre(String nombre);

    // Buscar por tipo (opcional)
    List<Archivo> findByTipo(String tipo);
}