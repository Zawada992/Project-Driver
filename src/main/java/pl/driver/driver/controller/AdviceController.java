package pl.driver.driver.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.driver.driver.converter.AdviceConvert;
import pl.driver.driver.dto.AdviceDTO;
import pl.driver.driver.model.Question;
import pl.driver.driver.service.AdviceService;
import pl.driver.driver.service.QuestionService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/advice")
public class AdviceController {
    private final AdviceService adviceService;
    private final AdviceConvert adviceConvert;
    private  final QuestionService questionService;

    @GetMapping("/list")
    public List<AdviceDTO> allAdvicesHomePage(){
        return adviceConvert.entityToDto(adviceService.findAll());
    }

    @GetMapping("/{id}")
    public  List<Question> adviceShow(@PathVariable("id") Long id){
        return questionService.findAllCurrentQuestionForAdvice(id);
    }

}
