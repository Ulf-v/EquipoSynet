package com.synet.demoBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/valoraciones")
public class ValoracionCasoController {

    @Autowired
    private ValoracionCasoService valoracionCasoService;

    // POST nueva valoración → /api/valoraciones
    @PostMapping
    public ResponseEntity<ValoracionCaso> guardarValoracion(@RequestBody ValoracionCaso valoracion,
            @AuthenticationPrincipal OAuth2User principal) {
        // Asignar email del médico autenticado
        if (principal != null) {
            String email = principal.getAttribute("email");
            valoracion.setEmailMedico(email);
        }
        ValoracionCaso guardada = valoracionCasoService.guardar(valoracion);
        return ResponseEntity.ok(guardada);
    }

    // GET todas las valoraciones → /api/valoraciones
    @GetMapping
    public ResponseEntity<List<ValoracionCaso>> obtenerTodas() {
        List<ValoracionCaso> valoraciones = valoracionCasoService.obtenerTodas();
        return ResponseEntity.ok(valoraciones);
    }

    // GET valoraciones por caso → /api/valoraciones/caso/{casoId}
    @GetMapping("/caso/{casoId}")
    public ResponseEntity<List<ValoracionCaso>> obtenerPorCaso(@PathVariable String casoId) {
        List<ValoracionCaso> valoraciones = valoracionCasoService.obtenerPorCasoId(casoId);
        return ResponseEntity.ok(valoraciones);
    }
}
