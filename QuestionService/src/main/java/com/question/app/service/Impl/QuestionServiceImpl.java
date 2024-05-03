package com.question.app.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.app.entity.Question;
import com.question.app.repository.QuestionRepository;
import com.question.app.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	QuestionRepository questionRepository;
	
	@Override
	public List<Question> getAllQuestion() {
		List<Question> findAll = questionRepository.findAll();
		return findAll;
	}

	@Override
	public Question getQuestion(int questionId) {
	    Question question = questionRepository.findById(questionId).get();
		return question;
	}

	@Override
	public List<Question> getAllQuestionOfQuizId(int quizId) {
		 List<Question> findByQuizId = questionRepository.findByQuizId(quizId);
		return findByQuizId;
	}

}
