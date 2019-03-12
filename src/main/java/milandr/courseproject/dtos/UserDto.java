package milandr.courseproject.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UserDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private byte[] avatar;

    public UserDto(Long id, String name, String email, byte[] avatar) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.avatar = avatar;
    }
}
