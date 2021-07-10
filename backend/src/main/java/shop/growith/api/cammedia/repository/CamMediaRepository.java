package shop.growith.api.cammedia.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.growith.api.cammedia.domain.CamMedia;

@Repository
public interface CamMediaRepository extends JpaRepository<CamMedia, Long> {

}
