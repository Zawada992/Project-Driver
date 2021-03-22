package pl.driver.driver.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.driver.driver.model.Advice;

public interface AdviceRepository extends JpaRepository<Advice, Long> {
}
