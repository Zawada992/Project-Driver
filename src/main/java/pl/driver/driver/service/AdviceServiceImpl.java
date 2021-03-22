package pl.driver.driver.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.driver.driver.repositry.AdviceRepository;

@Service
@AllArgsConstructor
public class AdviceServiceImpl implements AdviceService{
    private final AdviceRepository adviceRepository;

}
