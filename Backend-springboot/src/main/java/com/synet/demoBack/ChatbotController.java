package com.synet.demoBack;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ChatbotController {

    private final RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/generate")
    public ResponseEntity<String> generate(@RequestBody String body) {

        String url = "http://cloud.riberadeltajo.es:11200/generate/";

        String response = restTemplate.postForObject(url, body, String.class);

        return ResponseEntity.ok(response);
    }
}
