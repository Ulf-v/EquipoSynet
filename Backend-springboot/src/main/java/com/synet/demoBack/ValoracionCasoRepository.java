package com.synet.demoBack;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValoracionCasoRepository extends MongoRepository<ValoracionCaso, String> {

    List<ValoracionCaso> findByCasoId(String casoId);
}
