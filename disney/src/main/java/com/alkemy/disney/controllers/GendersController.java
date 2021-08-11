package com.alkemy.disney.controllers;

import com.alkemy.disney.models.GendersModel;
import com.alkemy.disney.services.GendersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/genders")
public class GendersController {
    @Autowired
    GendersService genderService;

    @GetMapping()
    public List<GendersModel> getGenders(){
        return genderService.getGenders();
    }

    @PostMapping()
    public GendersModel saveGender(@RequestBody GendersModel gender){
        return this.genderService.saveGender(gender);
    }

}
