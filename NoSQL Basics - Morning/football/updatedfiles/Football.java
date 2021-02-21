package com.example.au.couchbasedemo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

@Document
public class Football {
    
    @Id
    String id;
    
    @NotNull
    @Field
    String playername;
    
    @NotNull
    @Field
    String country;
    
    
    @NotNull
    @Field
    int totalgoalsscored;
    
    
    public Football(String id, String playername, int totalgoalsscored,String country) {
		super();
		this.id = id;
		this.playername = playername;
		this.totalgoalsscored = totalgoalsscored;
		this.country=country;
		
		
	}

	public String getplayername() {
		return playername;
	}

	public void setplayername(String playername) {
		this.playername = playername;
	}
	
	public String getcountry() {
		return country;
	}

	public void setcountry(String country) {
		this.country = country;
	}


	public int gettotalgoalsscored() {
		return totalgoalsscored;
	}

	public void settotalgoalsscored(int rating) {
		this.totalgoalsscored = totalgoalsscored;
	}

	public String getId() {
		return id;
	}

	
}