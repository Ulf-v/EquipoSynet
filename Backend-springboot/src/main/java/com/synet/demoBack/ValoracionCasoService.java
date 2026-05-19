package com.synet.demoBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValoracionCasoService {

    @Autowired
    private ValoracionCasoRepository valoracionCasoRepository;

    public ValoracionCaso guardar(ValoracionCaso valoracion) {
        return valoracionCasoRepository.save(valoracion);
    }

    public List<ValoracionCaso> obtenerTodas() {
        return valoracionCasoRepository.findAll();
    }

    public List<ValoracionCaso> obtenerPorCasoId(String casoId) {
        return valoracionCasoRepository.findByCasoId(casoId);
    }
}
