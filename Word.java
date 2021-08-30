package com.example.demo;

public class Word {
	
	private int occurances;
	private int points;
	public int getOccurances() {
		return occurances;
	}
	public void setOccurances(int occurances) {
		this.occurances = occurances;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Word(int occurances, int points) {
		super();
		this.occurances = occurances;
		this.points = points;
	}

}
