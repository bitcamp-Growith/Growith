package shop.growith.api.Mission.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReplyDTO {

    private Long id;

    private Long missionContent_Id;

    private String user_Id;
    private String content;


}
