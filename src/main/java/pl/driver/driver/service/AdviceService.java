package pl.driver.driver.service;

import pl.driver.driver.model.Advice;
import pl.driver.driver.model.Answer;
import pl.driver.driver.model.Question;

import java.util.List;

public interface AdviceService {
    List<Advice> findAll();
    void save(Advice advice);
    void delete(Long id);
    Advice findById(Long id);





}
