package com.synet.demoBack;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatHistorialRepository extends MongoRepository<ChatMensaje, String> {
}