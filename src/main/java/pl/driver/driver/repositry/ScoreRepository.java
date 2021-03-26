package pl.driver.driver.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.driver.driver.model.Score;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
