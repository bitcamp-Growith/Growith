package shop.growith.api.schedule.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class ScheduleDto {
    private Long scheduleId;
    private Long userId;
    private String scheduleTag;
    private String toDo;
    private LocalDate date;
    private LocalTime time;
    private LocalDateTime uploadTime;
    private int importance;
    private boolean check;
}
