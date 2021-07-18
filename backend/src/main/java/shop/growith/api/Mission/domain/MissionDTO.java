package shop.growith.api.Mission.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MissionDTO {

    private Long id;

    private String masterId;

    private String title;
    private String contents;

    private LocalDate startDay;
    private LocalDate endDay;

    private String thumbnailPath;

    private int times;

    private CheckLevel check;

}
