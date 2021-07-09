package shop.growith.api.Mission.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MissionContentDTO {

    private Long id;

    private String userName;
    private int number;

    private LocalDateTime writeTime;
    private String content;

    private String path;
    private int love;


}
