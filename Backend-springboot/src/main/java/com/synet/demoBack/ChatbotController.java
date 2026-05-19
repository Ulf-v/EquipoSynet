package com.synet.demoBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ChatbotController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final ChatHistorialRepository historialRepository;

    public ChatbotController(ChatHistorialRepository historialRepository) {
        this.historialRepository = historialRepository;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generate(@RequestBody String body) {

        String url = "http://cloud.riberadeltajo.es:11200/generate/";

        historialRepository.save(new ChatMensaje("user", body));

        String response = restTemplate.postForObject(url, body, String.class);

        if (response != null) {
            historialRepository.save(new ChatMensaje("bot", response));
        }

        return ResponseEntity.ok(response);
    }
}
