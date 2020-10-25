package com.text.analyzer.model.dto;

import java.util.List;

public class TextDto {

    private long id;
    private String value;
    private List<WordDto> uniqueWords;

    public TextDto(long id, String value, List<WordDto> uniqueWords) {
        this.id = id;
        this.value = value;
        this.uniqueWords = uniqueWords;
    }

    public TextDto() {
    }

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public List<WordDto> getUniqueWords() {
        return uniqueWords;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setUniqueWords(List<WordDto> uniqueWords) {
        this.uniqueWords = uniqueWords;
    }
}
