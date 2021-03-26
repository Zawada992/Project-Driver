package pl.driver.driver.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.driver.driver.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
