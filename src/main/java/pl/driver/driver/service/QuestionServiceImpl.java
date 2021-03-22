package pl.driver.driver.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.driver.driver.repositry.QuestionRepository;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService{

    private final QuestionRepository questionRepository;
}
