package com.example.dataunificationclient.service;

import com.example.dataunificationclient.model.Movie;
import com.example.dataunificationclient.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieRatingService {

    private MovieRepository movieRepository;

    public MovieRatingService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> findeOne(Long id){
        return movieRepository.findById(id);
    }

    public Iterable<Movie> findAllMovies(){
        return movieRepository.findAll();
    }

}
