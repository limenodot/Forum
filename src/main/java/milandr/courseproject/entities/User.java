package milandr.courseproject.entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
@ToString
public class User {

    @Id
    @Column(name = "ID")
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "NAME")
    @NotNull
    @Getter
    @Setter
    private String name;

    @Column(name = "EMAIL")
    @NotNull
    @Getter
    @Setter
    private String email;

    @Column(name = "AVATAR")
    @Getter
    @Setter
    private byte[] avatar;

    @Column(name = "PASSWORD_HASH")
    @Getter
    @Setter
    private String passwordHash;

    @Column(name = "PASSWORD_SALT")
    @Getter
    @Setter
    private String passwordSalt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user_id")
    @Getter
    @Setter
    private List<Message> messages;
}
