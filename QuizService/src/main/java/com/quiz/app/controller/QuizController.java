package com.quiz.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.app.entity.Quiz;
import com.quiz.app.service.QuizService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/quiz")
public class QuizController {

   @Autowired
   private QuizService quizService;

   @GetMapping
   @CircuitBreaker(name = "quizCircuitBreaker",fallbackMethod = "getQuizFallBack")
   public ResponseEntity<List<Quiz>> getAllQuiz(){
	   List<Quiz> allQuiz = quizService.getAllQuiz();
	   
	   return ResponseEntity.status(HttpStatus.OK).body(allQuiz);
   }
   
   @GetMapping("/{quizId}")
   public ResponseEntity<Quiz> getQuiz(@PathVariable int quizId){
	   Quiz singleQuiz = quizService.getSingleQuiz(quizId);
	  
	   return ResponseEntity.status(HttpStatus.OK).body(singleQuiz);
   }
   
   public ResponseEntity<List<Quiz>> getQuizFallBack(Throwable throwable){
	   List<Quiz> allQuiz = new ArrayList<Quiz>();
	   allQuiz.add(new Quiz(0,"server is down",null));
	   return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(allQuiz);
   }
	
}
