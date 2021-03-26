package pl.driver.driver.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.driver.driver.model.Question;
import pl.driver.driver.repositry.QuestionRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService{

    private final QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException(("Question does not exists")));
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void delete(Long id) {
        questionRepository.deleteById(id);

    }

    @Override
    public List<Question> findAllCurrentQuestionForAdvice(Long id) {
        return questionRepository.findAllCurrentQuestionForAdvice(id);
    }

    @Override
    public boolean checkAnswerForQuestion(Long questionId, Long userAnswerId) {
        return questionRepository.getCorrectAnswerForQuestion(questionId).equals(userAnswerId);
    }
}
