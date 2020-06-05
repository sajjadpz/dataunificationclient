package com.example.dataunificationclient.repository;

import com.example.dataunificationclient.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sajjadpervaiz
 */
@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
