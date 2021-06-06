package com.alkemy.disney.repositories;

import com.alkemy.disney.models.MoviesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends CrudRepository<MoviesModel, Long>{

}
