package com.stackroute.springJdbc.controller;

import com.stackroute.springJdbc.domain.Movie;
import com.stackroute.springJdbc.repository.SpringJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringJdbcController {
    @Autowired
    private SpringJdbcRepository springJdbcRepository;

    public ResponseEntity<String> executeShow() {
        Movie entity = springJdbcRepository.get(5);
        return new ResponseEntity("Movie: " + entity.getId()
                + ", " + entity.getMovieName(), HttpStatus.OK);
    }

    public ResponseEntity<String> insert() {
        Movie entity = new Movie(8,"Kerintha","aswin",2003, (float) 2.0);
        springJdbcRepository.add(entity);
        return new ResponseEntity("Movie Add: " + entity.getId()
                + ", " + entity.getMovieName() +", "+entity.getActorName()+", "+entity.getReleaseYear()+", "+entity.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> read() {
        Movie entity = springJdbcRepository.get(1);
        return new ResponseEntity("Movie Get: " + entity.getId()
                + ", " + entity.getMovieName() +", "+entity.getActorName()+", "+entity.getReleaseYear()+", "+entity.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> update() {
        Movie entity = new Movie(5,"Darling","Prabhas",2014, (float) 5);
        springJdbcRepository.update(entity);
        return new ResponseEntity("Movie Update: " + entity.getId()
                + ", " + entity.getMovieName() +", "+entity.getActorName()+", "+entity.getReleaseYear()+", "+entity.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> delete() {
        Movie entity = new Movie(3,"Hello","Akhil",2009, (float) 4.5);
        springJdbcRepository.delete(entity);
        return new ResponseEntity("Movie Delete: " + entity.getId()
                + ", " + entity.getMovieName() +", "+entity.getActorName()+", "+entity.getReleaseYear()+", "+entity.getRatings(), HttpStatus.OK);
    }
    public ResponseEntity<?> getAll() {
        List<Movie> movieList =springJdbcRepository.getAll();
        return new ResponseEntity<List<Movie>>(movieList,HttpStatus.OK);
    }
}
