package milandr.courseproject.controllers;

import milandr.courseproject.dtos.MessageDto;
import milandr.courseproject.services.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

    private MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/{messageId}")
    public MessageDto getMessage(@PathVariable Long messageId) {
        return messageService.getMessage(messageId);
    }
}
