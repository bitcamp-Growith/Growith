package shop.growith.api.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.growith.api.User.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
