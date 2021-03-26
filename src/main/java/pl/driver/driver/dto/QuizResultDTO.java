package pl.driver.driver.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class QuizResultDTO {
    private Long adviceID;
    private Long quizID;
    private Long userID;
    private List<AnswerDTO> answerMarked;

}
