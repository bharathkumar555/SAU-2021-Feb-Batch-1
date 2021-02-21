package com.example.au.couchbasedemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.au.couchbasedemo.model.Movie;
import com.example.au.couchbasedemo.repository.MovieRepository;

@RestController
public class MovieController {
    
    @Autowired
    MovieRepository movieRepository;
    
	/*
	 * @RequestMapping("/") public String index() { return
	 * "Welcome to the CRUD application!!"; }
	 */
    
    @PostMapping("/movies")
    public Movie addMoviePost(@RequestBody Movie newMovie) {
        return movieRepository.save(newMovie);
    }
    
    @GetMapping("/movies/{id}")
    public Optional<Movie> getMovie(@PathVariable String id) {
        if (movieRepository.existsById(id)) {
            return movieRepository.findById(id);
        } else
            return Optional.empty();
    }
 
    @GetMapping("/movies/moviename/{moviename}")
    public Movie findBymoviename(@PathVariable String moviename) {
        return movieRepository.findBymoviename(moviename);
    }
    
    @GetMapping("/movies/cityname/{cityname}")
    public List<Movie> getMovieBycityname(@PathVariable List<String> cityname) {
    	List<Movie> moviesList=new ArrayList<>();
    	movieRepository.findAll().forEach(Movies->{
    		List<String> citynameInMovie = Movies.getcityname();
    		for(String s : cityname)
    		{
    			if(citynameInMovie.contains(s))
                {
                    moviesList.add(Movies);
                    break;
                }
    		}
    	});
        return moviesList;
    }
    
    /*@GetMapping("/movies/genre/{genre}")
    public Movie findByGenre(@PathVariable String genre){
    	return movieRepository.findByGenre(genre);
    }*/
    
    @DeleteMapping("/movies/{id}")
    public void deleteById(@PathVariable String id) {
        movieRepository.deleteById(id);
    }

    

}