package com.alkemy.disney.controllers;

import com.alkemy.disney.models.MoviesModel;
import com.alkemy.disney.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    @Autowired
    MoviesService movieService;

    @GetMapping()
    public ArrayList<MoviesModel> getMovies(){
        return movieService.getMovies();
    }

    @PostMapping()
    public MoviesModel saveMovie(@RequestBody MoviesModel movie){
        return this.movieService.saveMovie(movie);
    }
}
