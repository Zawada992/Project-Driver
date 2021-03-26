package pl.driver.driver.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.driver.driver.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
