package pl.driver.driver.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.driver.driver.dto.AdviceDTO;
import pl.driver.driver.model.Advice;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdviceConvert {
    public AdviceDTO entityToDto(Advice advice){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(advice, AdviceDTO.class);
    }

    public Advice dtoToEntity(AdviceDTO adviceDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(adviceDTO, Advice.class);
    }

    public List<AdviceDTO> entityToDto(List<Advice> list){
        return list.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public List<Advice> dtoToEntity(List<AdviceDTO>list){
        return list.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
