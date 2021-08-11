package com.alkemy.disney.controllers;

import com.alkemy.disney.models.CharactersModel;
import com.alkemy.disney.services.CharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharactersController {
    @Autowired
    CharactersService charactersService;

    @GetMapping("/listCharacters")
    public List<CharactersModel> getCharacters()
    {
        return charactersService.getCharacters();
    }

    @PostMapping("/saveCharacter")
    public CharactersModel saveCharacter(@RequestBody CharactersModel character)
    {
        return this.charactersService.saveCharacter(character);
    }
}
