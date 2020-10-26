package com.text.analyzer.controller;

import com.text.analyzer.model.dto.TextDto;
import com.text.analyzer.model.dto.WordDto;
import com.text.analyzer.service.DtoService;
import com.text.analyzer.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequestMapping("/analyzer")
@RestController
public class IndexController {

    @Autowired
    private TextService textService;

    @Autowired
    private DtoService dtoService;

    @PostMapping
    public List<WordDto> findUniqueWords(@RequestBody Map<String, String> request){

        String input = Optional.ofNullable(request.get("text"))
                .orElseThrow(() -> new RuntimeException("Text property is not specified"));

        return dtoService.convertWordsToDto(textService.analyzeText(input));
    }

    @GetMapping("/text/{id}")
    public TextDto getTextById(@PathVariable("id") long id){

        return dtoService.convertTextToDto(textService.getTextById(id)
                .orElseThrow(() -> new RuntimeException("Text with such id doesn't exist")));
    }
}
