package com.alkemy.disney.controllers;

import com.alkemy.disney.models.CharactersModel;
import com.alkemy.disney.services.CharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/characters")
public class CharactersController {
    @Autowired
    CharactersService charactersService;

    @GetMapping()
    public ArrayList<CharactersModel> getCharacters(){
        return charactersService.getCharacters();
    }

    @PostMapping()
    public CharactersModel saveCharacter(@RequestBody CharactersModel character){
        return this.charactersService.saveCharacter(character);
    }
}
