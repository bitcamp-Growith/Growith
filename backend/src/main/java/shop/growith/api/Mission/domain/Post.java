package shop.growith.api.Mission.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mission_post_id")
    private Long id;

    private String userName;
    private int times;

    private LocalDateTime writeTime;
    private String content;

    private String imgPath;
    private int postLike;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "post")
    private List<Reply> replyList;

}
