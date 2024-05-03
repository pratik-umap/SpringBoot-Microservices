package com.quiz.app.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.app.entity.Question;

//@FeignClient(url = "http://localhost:8092",name = "QuestionService")
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionService {

	@GetMapping("/question/quiz/{quizId}")
	List<Question> getAllQuestionOfQuizId(@PathVariable int quizId);
	
}
