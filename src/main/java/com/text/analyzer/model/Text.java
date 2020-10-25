package com.text.analyzer.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "text")
public class Text {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String value;

    @OneToMany(mappedBy = "text", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Word> uniqueWords;

    public Text(String value) {
        this.value = value;
    }

    public Text() {}

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public List<Word> getUniqueWords(){
        return uniqueWords;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setUniqueWords(List<Word> uniqueWords) {
        this.uniqueWords = uniqueWords;
    }
}
