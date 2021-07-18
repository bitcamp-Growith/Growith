package shop.growith.api.scheduleTag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.growith.api.scheduleTag.domain.ScheduleTag;

@Repository
public interface ScheduleTagRepository extends JpaRepository<ScheduleTag, Long> {
}
