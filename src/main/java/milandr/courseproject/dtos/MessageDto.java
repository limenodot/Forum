package milandr.courseproject.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@ToString
public class MessageDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Date date;

    @Getter
    @Setter
    private Long user_id;

    @Getter
    @Setter
    private Long topic_id;

    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    private byte[] attached_image;

    public MessageDto(Long id, Date date, Long user_id, Long topic_id, String text, byte[] attached_image) {
        this.id = id;
        this.date = date;
        this.user_id = user_id;
        this.topic_id = topic_id;
        this.text = text;
        this.attached_image = attached_image;
    }
}
