package com.tuempresa.tuproyecto.service;

import com.tuempresa.tuproyecto.model.Archivo;
import com.tuempresa.tuproyecto.repository.ArchivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchivoService {

    @Autowired
    private ArchivoRepository archivoRepository;

    // Obtener todos los archivos
    public List<Archivo> obtenerTodos() {
        return archivoRepository.findAll();
    }

    // Obtener archivo por ID
    public Optional<Archivo> obtenerPorId(String id) {
        return archivoRepository.findById(id);
    }

    // Obtener por tipo
    public List<Archivo> obtenerPorTipo(String tipo) {
        return archivoRepository.findByTipo(tipo);
    }
}