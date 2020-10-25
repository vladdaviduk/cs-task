package com.text.analyzer.service;

import com.text.analyzer.model.Text;
import com.text.analyzer.model.Word;

import java.util.List;
import java.util.Optional;

public interface TextService {

    List<Word> analyzeText(String input);

    Optional<Text> getTextById(long id);
}
