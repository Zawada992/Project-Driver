package pl.driver.driver.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.driver.driver.service.QuizResultService;
import pl.driver.driver.service.ScoreService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/score")
public class ScoreController {

    private final ScoreService scoreService;
    private final QuizResultService quizResultService;
}
