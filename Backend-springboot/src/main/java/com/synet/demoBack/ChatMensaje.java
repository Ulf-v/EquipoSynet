package com.synet.demoBack;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Document(collection = "chat_historial")
public class ChatMensaje {

    @Id
    private String id;
    private String rol; // "user" o "bot"
    private String contenido;
    private Instant timestamp;

    public ChatMensaje() {
    }

    public ChatMensaje(String rol, String contenido) {
        this.rol = rol;
        this.contenido = contenido;
        this.timestamp = Instant.now();
    }

    public String getId() {
        return id;
    }

    public String getRol() {
        return rol;
    }

    public String getContenido() {
        return contenido;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}