package com.example.dataunificationclient.service;

import com.example.dataunificationclient.model.Movie;
import com.example.dataunificationclient.repository.MovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieRatingService {

    private MovieRepository movieRepository;

    public MovieRatingService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> findOne(Long id) {
        return movieRepository.findById(id);
    }

    public Page<Movie> findAllMovies(Integer pageNo, Integer pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        return movieRepository.findAll(paging);
    }
}
