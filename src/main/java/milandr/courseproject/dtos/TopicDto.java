package milandr.courseproject.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@ToString
public class TopicDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private Long[] messages_id;

    public TopicDto(Long id, String title, Long[] messages_id) {
        this.id = id;
        this.title = title;
        this.messages_id = messages_id;
    }
}
