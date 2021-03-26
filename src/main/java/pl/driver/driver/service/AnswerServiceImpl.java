package pl.driver.driver.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.driver.driver.model.Answer;
import pl.driver.driver.repositry.AnswerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AnswerServiceImpl implements AnswerService{
    private final AnswerRepository answerRepository;

    @Override
    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Override
    public void save(Answer answer) {
        answerRepository.save(answer);

    }
}
