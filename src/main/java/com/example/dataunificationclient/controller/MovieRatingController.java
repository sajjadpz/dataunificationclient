package com.example.dataunificationclient.controller;

import com.example.dataunificationclient.model.Movie;
import com.example.dataunificationclient.service.MovieRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sajjadpervaiz
 */
@RestController
@CrossOrigin
public class MovieRatingController {

    private MovieRatingService movieRatingService;

    @Autowired
    public MovieRatingController(MovieRatingService movieRatingService) {
        this.movieRatingService = movieRatingService;
    }

/*    @GetMapping("/movies")
    public String showMovies(Model model) {
        List<Movie> movies = new ArrayList<>();
        movieRatingService.findAllMovies().iterator().forEachRemaining(movies::add);
        model.addAttribute("movies", movies);
        return "movies";
    }*/

    @GetMapping("/movies")
    public ResponseEntity<Page<Movie>> getMovies(@RequestParam(defaultValue = "0") Integer pageNo,
                                                 @RequestParam(defaultValue = "30") Integer pageSize) {
        return new ResponseEntity<Page<Movie>>(movieRatingService.findAllMovies(pageNo, pageSize), new HttpHeaders(), HttpStatus.OK);
    }
}


