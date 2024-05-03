package com.question.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.app.entity.Question;
import com.question.app.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@GetMapping
	public ResponseEntity<List<Question>> getAllQuestion(){
		List<Question> allQuestion = questionService.getAllQuestion();
		
		return ResponseEntity.status(HttpStatus.OK).body(allQuestion);
	}
	
	@GetMapping("/{questionid}")
	public ResponseEntity<Question> getQuiz(@PathVariable int questionid){
		Question question = questionService.getQuestion(questionid);
		
		return ResponseEntity.status(HttpStatus.OK).body(question);
	}
	
	@GetMapping("/quiz/{quizId}")
	public ResponseEntity<List<Question>> getAllQuestionOfQuiz(@PathVariable int quizId){
		List<Question> allQuestionOfQuizId = questionService.getAllQuestionOfQuizId(quizId);
		
		return ResponseEntity.status(HttpStatus.OK).body(allQuestionOfQuizId);
	}
}  













