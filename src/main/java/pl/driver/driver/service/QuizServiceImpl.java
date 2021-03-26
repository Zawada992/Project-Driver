package pl.driver.driver.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.driver.driver.model.Quiz;
import pl.driver.driver.repositry.QuizRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class QuizServiceImpl implements QuizService{

    private final QuizRepository quizRepository;

    @Override
    public List<Quiz> findAll() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz findById(Long id) {
        return quizRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException(("Quiz does not exists")));
    }

    @Override
    public void save(Quiz quiz) {
        quizRepository.save(quiz);

    }

    @Override
    public void delete(Long id) {
        quizRepository.deleteById(id);
    }
}
