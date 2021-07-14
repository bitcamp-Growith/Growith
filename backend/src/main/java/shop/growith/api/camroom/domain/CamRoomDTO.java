package shop.growith.api.camroom.domain;

import lombok.Data;


import java.time.LocalDateTime;


@Data
public class CamRoomDTO {

    private Long camRoomId;


    private String masterName;       // 방장이름
    private String memberName;       // 방 멤버이름
    private LocalDateTime startDate; // 방 개설날짜
    private LocalDateTime endDate;   // 방 사라진날짜
    private String roomTitle;        // 방 제목


}
