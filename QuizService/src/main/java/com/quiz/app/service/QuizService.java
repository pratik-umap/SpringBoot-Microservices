package com.quiz.app.service;

import java.util.List;

import com.quiz.app.entity.Quiz;

public interface QuizService {

	List<Quiz> getAllQuiz();
	
	Quiz getSingleQuiz(int quizId);
	
}
