package shop.growith.api.camroom.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.growith.api.cammedia.domain.CamMedia;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table (name = "cam_room")
public class CamRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long camRoomId;

    @Column    private String masterName;       // 방장이름
    @Column    private String memberName;       // 방 멤버이름
    @Column    private LocalDateTime startDate; // 방 개설날짜
    @Column    private LocalDateTime endDate;   // 방 사라진날짜
    @Column    private String roomTitle;        // 방 제목

    @OneToOne(mappedBy = "cam_room")
    private CamMedia cam_media;

}
