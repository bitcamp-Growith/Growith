package shop.growith.api.schedule.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.growith.api.User.domain.User;
import shop.growith.api.scheduleTag.domain.ScheduleTag;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long scheduleId;
    @Column private long userId;
    @Column private String toDo;
    @Column private LocalDate date;
    @Column private LocalTime time;
    @Column private LocalDateTime uploadTime;
    @Column private int importance;
    @Column private int complete;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private ScheduleTag scheduleTag;

    @OneToMany(mappedBy = "schedule")
    private List<GestureCategory> gestureCategoryList = new ArrayList<>();
}
