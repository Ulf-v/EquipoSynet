package com.synet.demoBack;

import com.synet.demoBack.CasoClinico;
import com.synet.demoBack.ArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/archivos")
public class ArchivoController {

    @Autowired
    private ArchivoService archivoService;

    // GET todos los archivos → /api/archivos
    @GetMapping
    public ResponseEntity<List<CasoClinico>> obtenerTodos() {
        List<CasoClinico> archivos = archivoService.obtenerTodos();
        return ResponseEntity.ok(archivos);
    }

    // GET archivo por ID → /api/archivos/{id}
    @GetMapping("/{id}")
    public ResponseEntity<CasoClinico> obtenerPorId(@PathVariable String id) {
        return archivoService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET archivos por categoría → /api/archivos/categoria/{categoria}
    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<CasoClinico>> obtenerPorCategoria(@PathVariable String categoria) {
        List<CasoClinico> archivos = archivoService.obtenerPorCategoria(categoria);
        return ResponseEntity.ok(archivos);
    }

    // GET archivos por dificultad → /api/archivos/dificultad/{dificultad}
    @GetMapping("/dificultad/{dificultad}")
    public ResponseEntity<List<CasoClinico>> obtenerPorDificultad(@PathVariable String dificultad) {
        List<CasoClinico> archivos = archivoService.obtenerPorDificultad(dificultad);
        return ResponseEntity.ok(archivos);
    }
}