package pl.driver.driver.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.driver.driver.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}