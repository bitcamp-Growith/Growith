package shop.growith.api.scheduleTag.domain;

import lombok.Data;

@Data
public class ScheduleTagDto {
    private Long tagId;
    private Long userId;
    private String tagName;
}
