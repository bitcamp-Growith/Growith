package shop.growith.api.Friends.domain;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FriendsListDTO {

    private Long id;

    private String userId;
    private String nickname;
    private Boolean favorite;
    private String activityTime;

}
