package com.text.analyzer.model;

import javax.persistence.*;

@Entity
@Table(name = "word")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String value;
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "text_id", nullable = false)
    private Text text;

    public Word(String value, int quantity, Text text) {
        this.value = value;
        this.quantity = quantity;
        this.text = text;
    }

    public Word() {}

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public Text getText() {
        return text;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
