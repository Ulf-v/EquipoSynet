package com.synet.demoBack;

import com.synet.demoBack.Archivo;
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