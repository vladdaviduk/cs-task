package com.text.analyzer.repository;

import com.text.analyzer.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {

}
