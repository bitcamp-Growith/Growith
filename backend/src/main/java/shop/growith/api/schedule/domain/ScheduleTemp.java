package shop.growith.api.schedule.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "temp")
public class ScheduleTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private Long id;
    @Column private Long scheduleId;
    @Column private String scheduleText;
}