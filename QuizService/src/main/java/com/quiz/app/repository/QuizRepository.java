package com.quiz.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.app.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{

}
