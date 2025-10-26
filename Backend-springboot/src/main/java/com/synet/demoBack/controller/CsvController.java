package com.synet.demoBack.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/csv")
public class CsvController {

    @GetMapping("/pacientes")
    public ResponseEntity<Map<String, String>> getPacientes() {
        try {
            String csvContent = readCsvFile("data/pacientes.csv");

            Map<String, String> response = new HashMap<>();
            response.put("filename", "pacientes.csv");
            response.put("content", csvContent);

            return ResponseEntity.ok(response);
        } catch (IOException e) {
            Map<String, String> error = new HashMap<>();
            error.put("error", "Error al leer el archivo CSV");
            error.put("message", e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }

    @GetMapping("/sintomas")
    public ResponseEntity<Map<String, String>> getSintomas() {
        try {
            String csvContent = readCsvFile("data/sintomas.csv");

            Map<String, String> response = new HashMap<>();
            response.put("filename", "sintomas.csv");
            response.put("content", csvContent);

            return ResponseEntity.ok(response);
        } catch (IOException e) {
            Map<String, String> error = new HashMap<>();
            error.put("error", "Error al leer el archivo CSV");
            error.put("message", e.getMessage());
            return ResponseEntity.internalServerError().body(error);
        }
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    private String readCsvFile(String filename) throws IOException {
        Resource resource = new ClassPathResource(filename);

        if (!resource.exists()) {
            throw new IOException("Archivo no encontrado: " + filename);
        }

        try (Reader reader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8)) {
            return FileCopyUtils.copyToString(reader);
        }
    }
}
