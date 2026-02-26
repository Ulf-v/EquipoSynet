package Login;

import com.example.dto.FeedbackRequest;
import com.example.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/message")
    public ResponseEntity<String> handleMessage(@RequestBody String userMessage) {
        String botResponse = chatService.generateResponse(userMessage);
        return ResponseEntity.ok(botResponse);
    }

    @PostMapping("/feedback")
    public ResponseEntity<String> submitFeedback(@RequestBody FeedbackRequest feedbackRequest) {
        chatService.saveFeedback(feedbackRequest);
        return ResponseEntity.ok("Feedback submitted successfully");
    }
}