package com.alkemy.disney.services;

import com.alkemy.disney.models.GendersModel;
import com.alkemy.disney.repositories.GendersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GendersService {
    @Autowired
    GendersRepository gendersRepository;

    public List<GendersModel> getGenders(){
        return (List<GendersModel>) gendersRepository.findAll();
    }

    public GendersModel saveGender(GendersModel gender){
        return gendersRepository.save(gender);
    }
}
