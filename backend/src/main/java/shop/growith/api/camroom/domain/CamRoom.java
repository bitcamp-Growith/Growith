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
    private Long id;

    @Column    private String masterId;
    @Column    private String userId;
    @Column    private LocalDateTime startDate;
    @Column    private LocalDateTime endDate;
    @Column    private String roomTitle;

    @OneToOne(mappedBy = "cam_room")
    private CamMedia cam_media;

}
