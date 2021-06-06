package com.alkemy.disney.repositories;

import com.alkemy.disney.models.CharactersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharactersRepository extends CrudRepository<CharactersModel, Long> {

}
