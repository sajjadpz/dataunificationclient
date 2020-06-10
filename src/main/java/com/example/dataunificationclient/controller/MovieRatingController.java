package com.example.dataunificationclient.controller;

import com.example.dataunificationclient.model.Movie;
import com.example.dataunificationclient.service.MovieRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sajjadpervaiz
 */
@Controller
public class MovieRatingController {

    private MovieRatingService movieRatingService;

    @Autowired
    public MovieRatingController(MovieRatingService movieRatingService) {
        this.movieRatingService = movieRatingService;
    }

    @GetMapping("/movies")
    public String showMovies(Model model) {
        List<Movie> movies = new ArrayList<>();
        movieRatingService.findAllMovies().iterator().forEachRemaining(movies::add);
        model.addAttribute("movies", movies);
        return "movies";
    }
}


