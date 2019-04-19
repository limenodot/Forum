package milandr.courseproject.services;

import milandr.courseproject.daos.MessageDao;
import milandr.courseproject.dtos.MessageDto;
import milandr.courseproject.entities.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private MessageDao messageDao;

    public MessageService(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public MessageDto getMessage(Long topicId) {
        Message message = messageDao.findOne(topicId);
        return biuldMessageDtoFromMessage(message);
    }

    private MessageDto biuldMessageDtoFromMessage(Message message) {
        MessageDto messageDto = new MessageDto();
        messageDto.setId(message.getId());
        messageDto.setDate(message.getDate());
        messageDto.setTopic_id(message.getTopic_id());
        messageDto.setUser_id(message.getTopic_id());
        messageDto.setText(message.getText());
        messageDto.setAttached_image(message.getAttached_image());

        return messageDto;
    }
}
