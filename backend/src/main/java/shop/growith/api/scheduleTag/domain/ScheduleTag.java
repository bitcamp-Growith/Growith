package shop.growith.api.scheduleTag.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tags")
public class ScheduleTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private Long tagId;
    @Column private Long userId;
    @Column private String tagName;
}
