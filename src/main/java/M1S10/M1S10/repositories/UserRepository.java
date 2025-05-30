package M1S10.M1S10.repositories;

import M1S10.M1S10.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);
}
