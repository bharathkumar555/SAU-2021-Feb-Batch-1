package com.example.au.couchbasedemo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

@Document
public class Movie {
    
    @Id
    String id;
    
    
    
    @NotNull
    @Field
    String moviename;
    
    @NotNull
    @Field
    List<String> cityname;
    
    
    @NotNull
    @Field
    String rating;

	public String getmoviename() {
		return moviename;
	}

	public void setmoviename(String moviename) {
		this.moviename = moviename;
	}

	public List<String> getcityname() {
		return cityname;
	}

	public void setcityname(List<String> cityname) {
		this.cityname = cityname;
	}
	
	
	
	
	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getId() {
		return id;
	}

	public Movie(String id, String moviename, List<String> cityname, String rating) {
		super();
		this.id = id;
		this.moviename = moviename;
		this.cityname = cityname;
		this.rating=rating;
		
	}
    
    
    
}