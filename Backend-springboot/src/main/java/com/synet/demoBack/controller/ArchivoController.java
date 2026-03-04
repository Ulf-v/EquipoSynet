package com.tuempresa.tuproyecto.controller;

import com.tuempresa.tuproyecto.model.Archivo;
import com.tuempresa.tuproyecto.service.ArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/archivos")
@CrossOrigin(origins = "*") // Ajusta el origen según tu frontend
public class ArchivoController {

    @Autowired
    private ArchivoService archivoService;

    // GET todos los archivos → /api/archivos
    @GetMapping
    public ResponseEntity<List<Archivo>> obtenerTodos() {
        List<Archivo> archivos = archivoService.obtenerTodos();
        return ResponseEntity.ok(archivos);
    }

    // GET archivo por ID → /api/archivos/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Archivo> obtenerPorId(@PathVariable String id) {
        return archivoService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET archivos por tipo → /api/archivos/tipo/{tipo}
    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<Archivo>> obtenerPorTipo(@PathVariable String tipo) {
        List<Archivo> archivos = archivoService.obtenerPorTipo(tipo);
        return ResponseEntity.ok(archivos);
    }
}