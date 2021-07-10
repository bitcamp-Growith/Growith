package shop.growith.api.scheduleTemp.domain;

import lombok.Data;

@Data
public class ScheduleTempDto {
    private Long tempId;
    private Long scheduleId;
    private String scheduleText;
}
