package shop.growith.api.friends.domain;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FriendsListDTO {

    private long friendId;

    private String userName;
    private String nickname;
    private Boolean favorite;
    private String activityTime;

}
