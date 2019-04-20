package milandr.courseproject.services;

import milandr.courseproject.daos.TopicDao;
import milandr.courseproject.dtos.TopicDto;
import milandr.courseproject.entities.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private TopicDao topicDao;

    public TopicService(TopicDao topicDao) {
        this.topicDao = topicDao;
    }

    public TopicDto getTopic(Long topicId) {
        Topic topic = topicDao.findOne(topicId);
        return buildTopicDtoFromTopic(topic);
    }

    public TopicDto buildTopicDtoFromTopic(Topic topic) {
        TopicDto topicDto = new TopicDto();
        topicDto.setId(topic.getId());
        topicDto.setTitle(topic.getTitle());
        topicDto.setFirst_message_id(topic.getFirst_message_id());

        return topicDto;
    }
}
