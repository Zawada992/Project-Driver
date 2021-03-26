package pl.driver.driver.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AnswerDTO {
    private Long answerID;
    private Long adviceID;
    private Long quizID;
    private Long questionID;
}
