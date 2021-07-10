package shop.growith.api.camroom.domain;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class CamRoomDTO {

    private Long id;


    private String masterId;
    private String memberId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String roomTitle;

}
