package com.example.dataunificationclient.controller;

import com.example.dataunificationclient.model.Movie;
import com.example.dataunificationclient.service.MovieRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sajjadpervaiz
 */
@RestController
@RequestMapping("/movierating")
public class MovieRatingController {

    private MovieRatingService movieRatingService;

    @Autowired
    public MovieRatingController(MovieRatingService movieRatingService) {
        this.movieRatingService = movieRatingService;
    }

    @GetMapping
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        for (Movie movie : movieRatingService.findAllMovies()
        ) {
            Movie m = new Movie();
            m.setGenre(movie.getGenre());
            m.setMovieId(movie.getMovieId());
            m.setMovieTitle(movie.getMovieTitle());
            m.setMovieYear(movie.getMovieYear());
            movies.add(m);
        }
        return movies;
    }
}
