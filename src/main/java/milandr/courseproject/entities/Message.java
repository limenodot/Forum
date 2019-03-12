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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", insertable = false, updatable = false)
    @Getter
    @Setter
    private Long user_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOPIC_ID", insertable = false, updatable = false)
    @Getter
    @Setter
    private Long topic_id;

    @Column(name = "TEXT")
    @Getter
    @Setter
    private String text;

    @Column(name = "ATTACHED_IMAGES")
    @Getter
    @Setter
    private byte[] attached_image;

    public Message(Long id, String date, Long user_id, Long topic_id, String text, byte[] attached_image) {
        this.id = id;
        this.date = date;
        this.user_id = user_id;
        this.topic_id = topic_id;
        this.text = text;
        this.attached_image = attached_image;
    }
}
