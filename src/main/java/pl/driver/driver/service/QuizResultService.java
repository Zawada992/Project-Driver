package pl.driver.driver.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.driver.driver.dto.AnswerDTO;
import pl.driver.driver.dto.QuizResultDTO;
import pl.driver.driver.model.Score;

import java.util.List;

@AllArgsConstructor
@Service
public class QuizResultService {
    private final QuestionService questionService;
    private final QuizService quizService;
    private final ScoreService scoreService;
    private final UseService useService;

    public void save(QuizResultDTO quizResultDTO){
        List<AnswerDTO> userAnswers = quizResultDTO.getAnswerMarked();
        if(userAnswers != null){
            int points = (int) userAnswers.stream().filter(userAnswer ->
                    questionService.checkAnswerForQuestion(userAnswer.getQuestionID(),
                            userAnswer.getAnswerID())).count();
            System.out.println("It's worked!!!");
            Score score = new Score();
            score.setUser(useService.findById(quizResultDTO.getUserID()));
            score.setPoints(points);
            score.setQuiz(quizService.findById(quizResultDTO.getQuizID()));
            scoreService.save(score);
        }
        else System.out.println("Doesn't work :(");
    }
}
