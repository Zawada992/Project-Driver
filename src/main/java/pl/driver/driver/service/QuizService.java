package pl.driver.driver.service;

import pl.driver.driver.model.Quiz;

import java.util.List;

public interface QuizService {
    List<Quiz> findAll();
    Quiz findById(Long id);
    void save(Quiz quiz);
    void delete(Long id);

}
