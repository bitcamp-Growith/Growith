package shop.growith.api.Cam.domain;

import lombok.*;

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

    @Column    private String masterID;
    @Column    private String memberID;
    @Column    private LocalDateTime startDate;
    @Column    private LocalDateTime endDate;
    @Column    private String roomTitle;

}
