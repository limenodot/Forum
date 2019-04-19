package milandr.courseproject.controllers;

import milandr.courseproject.dtos.TopicDto;
import milandr.courseproject.services.TopicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topic")
public class TopicController {

    private TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/{topicId}")
    public TopicDto getTopic(@PathVariable Long topicId) {
        return topicService.getTopic(topicId);
    }
}
