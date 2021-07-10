package shop.growith.api.Mission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import shop.growith.api.Mission.domain.Mission;

import java.util.List;



public interface MissionRepository extends JpaRepository<Mission, Long> {

    @Query("select m from Mission m where m.title like %:title%")
    List<Mission> findByTitle(@Param("title") String title);

    @Query("select m from Mission m where m.masterId like %:masterId%")
    List<Mission> findByMasterId(@Param("masterId") String masterId);

}
