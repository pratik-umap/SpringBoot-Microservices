package com.quiz.app.entity;


public class Question {
	
	private int id;
	
	private String description;
	
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
		this.id = id;
		this.description = description;
		this.quizId = quizId;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
}
