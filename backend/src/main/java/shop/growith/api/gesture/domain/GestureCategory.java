package shop.growith.api.gesture.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.growith.api.activity.domain.ActivityInfo;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "gesture_category")
public class GestureCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id; // 제스쳐 id

    @Column    private String gestureCategory; // 제스쳐 카테고리

    @ManyToOne
    @JoinColumn(name="activity_id", insertable = false, updatable = false)
    private ActivityInfo activityInfo;
}