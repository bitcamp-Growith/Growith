package shop.growith.api.scheduleTemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.growith.api.scheduleTemp.domain.ScheduleTemp;

@Repository
public interface ScheduleTempRepository extends JpaRepository<ScheduleTemp, Long> {
}
