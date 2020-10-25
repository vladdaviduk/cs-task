package com.text.analyzer.model;

import javax.persistence.*;

@Entity
@Table(name = "word")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String value;
    private int duplicates;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "text_id", nullable = false)
    private Text text;

    public Word(String value, int duplicates, Text text) {
        this.value = value;
        this.duplicates = duplicates;
        this.text = text;
    }

    public Word() {}

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public int getDuplicates() {
        return duplicates;
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

    public void setDuplicates(int duplicates) {
        this.duplicates = duplicates;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
