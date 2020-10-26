package com.text.analyzer.model.dto;

public class WordDto {

    private String value;
    private int quantity;

    public WordDto(String value, int quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    public WordDto() { }

    public String getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
