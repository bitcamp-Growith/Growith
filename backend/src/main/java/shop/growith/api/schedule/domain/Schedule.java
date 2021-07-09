package shop.growith.api.schedule.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private Long id;
    @Column private Long userId;
    @Column private String scheduleTag;
    @Column private String toDo;
    @Column private LocalDate date;
    @Column private LocalTime time;
    @Column private LocalDateTime registTime; //등록시간
    @Column private int importance; //중요도
    @Column private boolean check; //완료 미완료 여부 체크
}
