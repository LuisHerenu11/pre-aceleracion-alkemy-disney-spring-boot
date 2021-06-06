package com.alkemy.disney.services;

import com.alkemy.disney.models.GendersModel;
import com.alkemy.disney.repositories.GendersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GendersService {
    @Autowired
    GendersRepository gendersRepository;

    public ArrayList<GendersModel> getGenders(){
        return (ArrayList<GendersModel>) gendersRepository.findAll();
    }

    public GendersModel saveGender(GendersModel gender){
        return gendersRepository.save(gender);
    }
}
