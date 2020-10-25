package com.text.analyzer.service;

import com.text.analyzer.model.Text;
import com.text.analyzer.model.Word;
import com.text.analyzer.model.dto.TextDto;
import com.text.analyzer.model.dto.WordDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DtoService {

    public List<WordDto> convertWordsToDto(List<Word> words){
        return words.stream().map(word -> new WordDto(word.getValue(), word.getDuplicates())).collect(Collectors.toList());
    }

    public TextDto convertTextToDto(Text text) {
        return new TextDto(text.getId(), text.getValue(), convertWordsToDto(text.getUniqueWords()));
    }
}
