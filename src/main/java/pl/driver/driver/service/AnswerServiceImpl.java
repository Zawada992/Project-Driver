package pl.driver.driver.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.driver.driver.repositry.AnswerRepository;

@Service
@AllArgsConstructor
public class AnswerServiceImpl implements AnswerService{
    private final AnswerRepository answerRepository;
}
