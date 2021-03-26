package pl.driver.driver.service;

import pl.driver.driver.model.Score;

import java.util.List;

public interface ScoreService {
    List<Score> findAll();
    void save(Score score);
}
