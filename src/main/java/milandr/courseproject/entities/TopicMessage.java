package milandr.courseproject.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ORDERS_PRODUCTS")
@IdClass(TopicMessagePK.class)
@NoArgsConstructor
@EqualsAndHashCode
@ToString(exclude = {"topic", "message"})
public class TopicMessage {
    @Id
    @Column(name = "TOPIC_ID")
    @Getter
    @Setter
    private Long topicId;

    @Id
    @Column(name = "MESSAGE_ID")
    @Getter
    @Setter
    private Long messageId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOPIC_ID", insertable = false, updatable = false)
    @Getter
    @Setter
    private Topic topic;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", insertable = false, updatable = false)
    @Getter
    @Setter
    private Message message;

    public TopicMessage(Long topicId, Long messageId) {
        this.topicId = topicId;
        this.messageId = messageId;
    }
}