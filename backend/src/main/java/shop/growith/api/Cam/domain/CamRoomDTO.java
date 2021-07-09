package shop.growith.api.Cam.domain;

import lombok.Data;



import java.time.LocalDateTime;


@Data
public class CamRoomDTO {

    private Long id;


    private String masterID;
    private String memberID;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String roomTitle;

}
