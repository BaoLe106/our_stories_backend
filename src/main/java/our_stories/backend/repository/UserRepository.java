package our_stories.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import our_stories.backend.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUserName(String userName);
    UserEntity findByEmail(String email);
}
