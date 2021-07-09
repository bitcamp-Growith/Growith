package shop.growith.api.Friends.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActivityInfoDTO {

    private Long id;

    private String userId;
    private Boolean takeTodo;
    private String gesture;
    private String comment;
}