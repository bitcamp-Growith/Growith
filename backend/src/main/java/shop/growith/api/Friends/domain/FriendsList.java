package shop.growith.api.Friends.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "friends_list")
public class FriendsList{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id; // 친구목록 순번

    @Column    private String userId; // 친구 아이디
    @Column    private String nickname;// 친구 별명
    @Column    private Boolean favorite; // 친구 즐겨찾기
    @Column    private String activityTime;// 최근 활동 시간
}
