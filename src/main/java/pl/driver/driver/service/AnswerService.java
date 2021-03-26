package pl.driver.driver.service;

import pl.driver.driver.model.Answer;

import java.util.List;

public interface AnswerService {
    List<Answer> findAll();
    void save(Answer answer);
}
