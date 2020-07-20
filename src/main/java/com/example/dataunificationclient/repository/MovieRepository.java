package com.example.dataunificationclient.repository;

import com.example.dataunificationclient.model.Movie;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sajjadpervaiz
 */
@Repository
public interface MovieRepository extends PagingAndSortingRepository<Movie, Long> {
}
