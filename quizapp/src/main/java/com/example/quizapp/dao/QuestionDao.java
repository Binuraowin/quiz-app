package com.example.quizapp.dao;

import com.example.quizapp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDao extends JpaRepository<Questions,Integer> {

    List<Questions> findByCategory(String category);
}
