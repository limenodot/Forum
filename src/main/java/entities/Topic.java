package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "GOODS")
@ToString
public class Topic {

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

    @Column(name = "MESSAGES_ID")
    @Getter
    @Setter
    private Long[] messages_id;
}
