package Login;

import com.example.dto.FeedbackRequest;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String generateResponse(String userMessage) {
        return "Respuesta del backend: " + userMessage;
    }

    public void saveFeedback(FeedbackRequest feedbackRequest) {
        System.out.println("Feedback recibido: " + feedbackRequest);
    }
}