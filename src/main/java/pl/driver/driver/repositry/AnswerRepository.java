package pl.driver.driver.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.driver.driver.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
