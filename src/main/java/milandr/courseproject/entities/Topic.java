package milandr.courseproject.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TOPICS")
@ToString
public class Topic {

    //todo think about first message
    @Id
    @Column(name = "ID")
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topic_seq_gen")
    @SequenceGenerator(name = "topic_seq_gen", sequenceName = "topic_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name  = "TITLE")
    @NotNull
    @Getter
    @Setter
    private String title;

    /* todo remove */
    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "message")
    @Column(name = "FIRST_MESSAGE_ID")
    @Getter
    @Setter
    private Long first_message_id;
}
