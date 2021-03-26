package pl.driver.driver.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.driver.driver.model.Score;
import pl.driver.driver.repositry.ScoreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ScoreServiceImpl implements ScoreService{
    private final ScoreRepository scoreRepository;

    @Override
    public List<Score> findAll() {
        return scoreRepository.findAll();
    }

    @Override
    public void save(Score score) {
        scoreRepository.save(score);
    }
}
