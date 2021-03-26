package pl.driver.driver.service;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import pl.driver.driver.model.Advice;

import pl.driver.driver.repositry.AdviceRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class AdviceServiceImpl implements AdviceService{
    private final AdviceRepository adviceRepository;


    @Override
    public List<Advice> findAll() {
        return adviceRepository.findAll();
    }

    @Override
    public void save(Advice advice) {
        advice.setCreationDate(LocalDateTime.now());
        adviceRepository.save(advice);
    }

    @Override
    public void delete(Long id) {
        adviceRepository.deleteById(id);
    }


    @Override
    public Advice findById(Long id) {
        return adviceRepository.findById(id).orElseThrow(()->
                new IllegalStateException("Advice does not exists"));
    }

}
