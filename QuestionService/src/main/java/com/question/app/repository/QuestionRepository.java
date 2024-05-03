package com.question.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.app.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

	List<Question> findByQuizId(int quizId);
}
