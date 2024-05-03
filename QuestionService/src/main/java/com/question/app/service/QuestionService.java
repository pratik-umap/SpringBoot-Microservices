package com.question.app.service;

import java.util.List;

import com.question.app.entity.Question;

public interface QuestionService {

	List<Question> getAllQuestion();
	
	Question getQuestion(int questionId);
	
	List<Question> getAllQuestionOfQuizId(int quizId);
	
}
