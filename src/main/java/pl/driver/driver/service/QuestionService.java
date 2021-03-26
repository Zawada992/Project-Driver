package pl.driver.driver.service;

import pl.driver.driver.model.Advice;
import pl.driver.driver.model.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAll();
    Question findById(Long id);
    void save(Question question);
    void delete(Long id);
    List<Question> findAllCurrentQuestionForAdvice(Long id);
    boolean checkAnswerForQuestion(Long questionId, Long userAnswerId);


}
