package com.example.dataunificationclient.model;

import javax.persistence.*;

/**
 * @author sajjadpervaiz
 */
@Entity
@Table(name = "RATINGS")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "movie_id")
    private Long movieId;

    private Integer rating;

    @Column(name = "rating_timestamp")
    private String ratingTimeStamp;

    public Rating() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getRatingTimeStamp() {
        return ratingTimeStamp;
    }

    public void setRatingTimeStamp(String ratingTimeStamp) {
        this.ratingTimeStamp = ratingTimeStamp;
    }
}
