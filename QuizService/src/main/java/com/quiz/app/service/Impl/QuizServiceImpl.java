package com.quiz.app.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.app.entity.Question;
import com.quiz.app.entity.Quiz;
import com.quiz.app.repository.QuizRepository;
import com.quiz.app.service.QuestionService;
import com.quiz.app.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizRepository quizRepository;
	
	@Autowired
	private QuestionService questionService;
	
	@Override
	public List<Quiz> getAllQuiz() {
		List<Quiz> Quizes = quizRepository.findAll();
		
	 List<Quiz> newQuizeList = Quizes.stream().map((quiz)->{
			quiz.setQuestions(questionService.getAllQuestionOfQuizId(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		
		return newQuizeList;
	}

	@Override
	public Quiz getSingleQuiz(int quizId) {
		Quiz quiz = quizRepository.findById(quizId).get();
		quiz.setQuestions(questionService.getAllQuestionOfQuizId(quiz.getId()));
		return quiz;
	}

}
