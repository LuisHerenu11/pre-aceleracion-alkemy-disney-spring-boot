package com.alkemy.disney.services;

import com.alkemy.disney.models.CharactersModel;
import com.alkemy.disney.repositories.CharactersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharactersService {
    @Autowired
    CharactersRepository charactersRepository;

    public List<CharactersModel> getCharacters(){
        return(List<CharactersModel>) charactersRepository.findAll();
    }

    public CharactersModel saveCharacter(CharactersModel character){
        return charactersRepository.save(character);
    }
}
