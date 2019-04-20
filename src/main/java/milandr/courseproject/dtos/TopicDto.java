package milandr.courseproject.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

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
    private Long first_message_id;

    public TopicDto(Long id, String title, Long first_message_id) {
        this.id = id;
        this.title = title;
        this.first_message_id = first_message_id;
    }
}
