package pl.driver.driver.repositry;

import org.hibernate.engine.spi.VersionValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.driver.driver.model.Question;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query(value = "Select a.currentQuiz.question from Advice a where a.id=?1")
    List<Question> findAllCurrentQuestionForAdvice(Long id);
    @Query(value = "Select q.correctAnswer.id from Question q where q.id=?1")
    Long getCorrectAnswerForQuestion(Long id);
}
