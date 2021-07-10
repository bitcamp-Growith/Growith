package shop.growith.api.Mission.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mission_reply_id")
    private Long id;


    private String user_Id;
    private String content;
    private LocalDateTime writeTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_post_id")
    private Post post;

}
