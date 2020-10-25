package com.text.analyzer.model.dto;

public class WordDto {

    private String value;
    private int duplicates;

    public WordDto(String value, int duplicates) {
        this.value = value;
        this.duplicates = duplicates;
    }

    public WordDto() { }

    public String getValue() {
        return value;
    }

    public int getDuplicates() {
        return duplicates;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setDuplicates(int duplicates) {
        this.duplicates = duplicates;
    }
}
