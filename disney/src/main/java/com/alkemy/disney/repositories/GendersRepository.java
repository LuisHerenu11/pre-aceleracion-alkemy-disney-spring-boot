package com.alkemy.disney.repositories;

import com.alkemy.disney.models.GendersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GendersRepository extends CrudRepository<GendersModel, Long>{

}
