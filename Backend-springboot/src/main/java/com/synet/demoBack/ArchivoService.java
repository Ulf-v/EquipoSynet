package com.synet.demoBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchivoService {

    @Autowired
    private ArchivoRepository archivoRepository;

    // Obtener todos los archivos
    public List<CasoClinico> obtenerTodos() {
        return archivoRepository.findAll();
    }

    // Obtener archivo por ID
    public Optional<CasoClinico> obtenerPorId(String id) {
        return archivoRepository.findById(id);
    }

    // Obtener por categoría
    public List<CasoClinico> obtenerPorCategoria(String categoria) {
        return archivoRepository.findByCategoria(categoria);
    }

    // Obtener por dificultad
    public List<CasoClinico> obtenerPorDificultad(String dificultad) {
        return archivoRepository.findByDificultad(dificultad);
    }
}