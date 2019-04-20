package milandr.courseproject.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@EqualsAndHashCode
@ToString
public class TopicMessagePK implements Serializable {

    @Getter
    @Setter
    private Long topicId;

    @Getter
    @Setter
    private Long messageId;

    public TopicMessagePK(Long orderId, Long productId) {
        this.topicId = orderId;
        this.messageId = productId;
    }
}
