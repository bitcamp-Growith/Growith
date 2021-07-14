package shop.growith.api.camroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import shop.growith.api.camroom.domain.CamRoom;

@Repository
public interface CamRoomRepository extends JpaRepository<CamRoom, Long> {

}