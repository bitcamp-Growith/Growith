package shop.growith.api.activity.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.growith.api.gesture.domain.GestureCategory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    private Long id; // 활동ID

    @OneToMany
    @JoinColumn(name = "activity_id")
    private List<GestureCategory> gestures = new ArrayList<GestureCategory>();

    @Column    private String userId; // 친구 아이디
    @Column    private Boolean takeTodo; // 일정 가져감 유무
    @Column    private String gesture; // 남긴 제스쳐
    @Column    private String comment; // 남긴 댓글

}