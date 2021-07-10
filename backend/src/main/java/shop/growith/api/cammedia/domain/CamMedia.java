package shop.growith.api.cammedia.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.growith.api.camroom.domain.CamRoom;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cam_media")
public class CamMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column    private int saveMediaNo; //파일등록번호
    @Column    private String saveMediaName; //파일명
    @Column    private String saveMediaPath; //파일위치(주소)
    @Column    private String saveMediaSize; //파일크기

    @OneToOne
    @JoinColumn(name = "cam_room_id")
    private CamRoom cam_room;
}
//cam_media에는 녹화본이 저장된다.