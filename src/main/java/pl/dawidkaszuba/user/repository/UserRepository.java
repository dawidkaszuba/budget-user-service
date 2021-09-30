package pl.dawidkaszuba.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dawidkaszuba.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByUserId(Long userId);
}
