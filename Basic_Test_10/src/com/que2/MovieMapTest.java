package com.que2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MovieMapTest {
	
	public static void CreateMovieMap(ArrayList<Movie> mo)
	{

		HashMap<String, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> movielist;
		for(Movie m : mo)
		{
			String mName= m.getMoviename();
			if(!map.containsKey(m.getActor()))
			{
				movielist= new ArrayList<>();
			}
			else
			{
				movielist= map.get(m.getActor());
			}
			movielist.add(m.getMoviename());
			map.put(m.getActor(), movielist);
		}
		for(Map.Entry<String, ArrayList<String>>en : map.entrySet())
		{
			System.out.println("Movie Name : "+en.getKey());
			System.out.println("--------------------------------------");
			for(String it : en.getValue())
			{
				System.out.println(it);
			}
			System.out.println("--------------------------------------");
		}
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> actor1 = new ArrayList<>();
		actor1.add("Sanjay Dutt");
		
		
		ArrayList<String> actor2 = new ArrayList<>();
		actor2.add("Amitabh Bachchan");
		
		ArrayList<String> actor3 = new ArrayList<>();
		actor3.add("Salman Khan");
		
		ArrayList<Movie> movie = new ArrayList<>();
		movie.add(new Movie(101,"Khalnayak",actor1));
		movie.add(new Movie(102,"Dabaang",actor3));
		movie.add(new Movie(103,"Cooli",actor2));
		movie.add(new Movie(103,"Ready",actor3));
		movie.add(new Movie(101,"Paa",actor2));
		movie.add(new Movie(101,"Vaastav",actor1));
		movie.add(new Movie(802,"Guru",actor2));
		movie.add(new Movie(101,"Wanted",actor3));
		movie.add(new Movie(803,"Bhoothnath",actor2));
		
		CreateMovieMap(movie);
	}
}