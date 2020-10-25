package com.text.analyzer.repository;

import com.text.analyzer.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, Long> {

}
