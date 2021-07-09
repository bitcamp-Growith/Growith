package shop.growith.api.schedule.domain;

import lombok.Data;

@Data
public class ScheduleTagDto {
    private Long id;
    private Long userId;
    private String tagName;
}
