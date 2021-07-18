package shop.growith.api.scheduleTag.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.growith.api.User.domain.User;
import shop.growith.api.schedule.domain.Schedule;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tags")
public class ScheduleTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private Long tagId;
    @Column private String tagName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "tag")
    private List<Schedule> scheduleList = new ArrayList<>();


}
