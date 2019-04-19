package milandr.courseproject.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "GOODS")
@ToString
public class Message {

    @Id
    @Column(name = "ID")
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "message_seq_gen")
    @SequenceGenerator(name = "message_seq_gen", sequenceName = "message_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "DATE")
    @Getter
    @Setter
    private String date;

    @Column(name = "USER_ID")
    @Getter
    @Setter
    private Long userId;

    @Column(name = "TOPIC_ID")
    @Getter
    @Setter
    private Long topicId;

    @Column(name = "TEXT")
    @Getter
    @Setter
    private String text;

    @Column(name = "ATTACHED_IMAGES")
    @Getter
    @Setter
    private byte[] attached_image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", insertable = false, updatable = false)
    @Getter
    @Setter
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOPIC_ID", insertable = false, updatable = false)
    @Getter
    @Setter
    private Topic topic;

    public Message(Long id, String date, Long userId, Long topicId, String text, byte[] attached_image) {
        this.id = id;
        this.date = date;
        this.userId = userId;
        this.topicId = topicId;
        this.text = text;
        this.attached_image = attached_image;
    }
}
