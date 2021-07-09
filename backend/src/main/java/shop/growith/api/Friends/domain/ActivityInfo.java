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
@Table(name = "activity_info")


public class ActivityInfo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long people; // 접근한 인원

    @Column    private String userId; // 친구 아이디
    @Column    private Boolean takeTodo; // 일정 가져감 유무
    @Column    private String gesture; // 남긴 제스쳐
    @Column    private String comment; // 남긴 댓글
}