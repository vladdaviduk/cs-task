package com.text.analyzer.service.impl;

import com.text.analyzer.model.Text;
import com.text.analyzer.model.Word;
import com.text.analyzer.repository.TextRepository;
import com.text.analyzer.repository.WordRepository;
import com.text.analyzer.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TextServiceImpl implements TextService {

    @Autowired
    private TextRepository textRepository;

    @Autowired
    private WordRepository wordRepository;

    @Override
    public List<Word> analyzeText(String input){

        Text text = new Text(input);
        textRepository.save(text);

        List<String> allWords = retrieveAllWords(input);
        List<Word> uniqueWords = allWords.stream().filter(w -> !w.isEmpty()).distinct()
                .map(word -> new Word(word, Collections.frequency(allWords, word), text))
                .collect(Collectors.toList());

        return wordRepository.saveAll(uniqueWords);
    }

    @Override
    public Optional<Text> getTextById(long id) {
        return textRepository.findById(id);
    }

    private List<String> retrieveAllWords(String input){
        String space = " ";
        return Arrays.asList(input.replaceAll("[^A-Za-zА-Яа-я\\s]", "")
                .replaceAll("[\\n]", space)
                .replaceAll("[\\r]", space)
                .replaceAll(" +", space)
                .toLowerCase().split(space));
    }
}
