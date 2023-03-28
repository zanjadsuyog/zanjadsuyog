package com.que2;

import java.util.ArrayList;

public class Movie {

	// Movie has (int movieid, String moviename, List<String> actor)

	private int movieId;
	private String moviename;
	ArrayList<String> actor;

	Movie() {

	}

	public Movie(int movieId, String moviename, ArrayList<String> actor1) {
		super();
		this.movieId = movieId;
		this.moviename = moviename;
		this.actor = actor1;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public ArrayList<String> getActor() {
		return actor;
	}

	public void setActor(ArrayList<String> actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", moviename=" + moviename + ", actor=" + actor + "]";
	}

}
