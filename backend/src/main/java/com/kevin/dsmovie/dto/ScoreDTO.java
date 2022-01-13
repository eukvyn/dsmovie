package com.kevin.dsmovie.dto;

public class ScoreDTO {

	// ATRIBUTOS
	
	private Long movieId;
	private String email;
	private Double score;
	
	// CONSTRUTORES
	
	public ScoreDTO() {
		
	}

	// MÉTODOS GETTERS E SETTERS
	
	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	
}
