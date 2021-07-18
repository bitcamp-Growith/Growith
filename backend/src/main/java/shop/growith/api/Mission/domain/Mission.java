package shop.growith.api.Mission.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mission_id")
    private Long id;

    private String masterId;

    private String title;
    private String contents;

    private LocalDate startDay;
    private LocalDate endDay;

    private String thumbnailPath;

    private int max_Times;

    @Enumerated(EnumType.STRING)
    private CheckLevel checkLevel;

    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<Post> postList = new ArrayList<>();


}
