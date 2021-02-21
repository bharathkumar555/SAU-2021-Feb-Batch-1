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


import com.example.au.couchbasedemo.model.Football;
import com.example.au.couchbasedemo.model.Movie;
import com.example.au.couchbasedemo.repository.FootballRepository;

@RestController
public class FootballController {
    
    @Autowired
    FootballRepository footballRepository;
    
	/*
	 * @RequestMapping("/") public String index() { return
	 * "Welcome to the CRUD application!!"; }
	 */
    
    @PostMapping("/players")
    public Football addFootballPost(@RequestBody Football newPlayer) {
        return footballRepository.save(newPlayer);
    }
    
    @GetMapping("/players/playername/{playername}")
    public Football findByplayername(@PathVariable String playername) {
        return footballRepository.findByplayername(playername);
    }
    
    @GetMapping("/playes/totalgoalsscored/{totalgoalsscored}")
    public List<Football> getplayersname(@PathVariable Integer totalgoalsscored) {
        List<Football> playerslistgoalsgreaterthan15=new ArrayList<>();
        footballRepository.findAll().forEach(Players->{
           Integer NoOfGoals = Players.gettotalgoalsscored();
           if (NoOfGoals >= totalgoalsscored) {
        	   playerslistgoalsgreaterthan15.add(Players);
           }
       });
      return playerslistgoalsgreaterthan15;
    }
    
    @GetMapping("/players/{id}")
    public Optional<Football> getplayer(@PathVariable String id) {
        if (footballRepository.existsById(id)) {
            return footballRepository.findById(id);
        } else
            return Optional.empty();
        
    }
    
 
   
    @DeleteMapping("/footballs/{id}")
    public void deleteById(@PathVariable String id) {
        footballRepository.deleteById(id);
    }

    

}