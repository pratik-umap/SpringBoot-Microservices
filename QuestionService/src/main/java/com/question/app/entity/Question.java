package com.question.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_id")
	private int id;
	
	@Column(name = "question_desc")
	private String description;
	
	@Column(name = "quizId")
	private int quizId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public Question(int id, String description, int quizId) {
		super();
		this.id = id;
		this.description = description;
		this.quizId = quizId;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
