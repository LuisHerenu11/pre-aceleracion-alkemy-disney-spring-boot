package com.alkemy.disney.services;

import com.alkemy.disney.models.MoviesModel;
import com.alkemy.disney.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesService {
    @Autowired
    MoviesRepository moviesRepository;

    public List<MoviesModel> getMovies(){
        return (List<MoviesModel>) moviesRepository.findAll();
    }

    public MoviesModel saveMovie(MoviesModel movie){
        return moviesRepository.save(movie);
    }
}
