package shop.growith.api.schedule.domain;

import lombok.Data;

@Data
public class ScheduleTempDto {
    private Long id;
    private Long scheduleId;
    private String scheduleText;
}
