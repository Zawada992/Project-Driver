package pl.driver.driver.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ScoreDTO {
    private Long id;
    private Long userID;
    private Long quizID;
}
