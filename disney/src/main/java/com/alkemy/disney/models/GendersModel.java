package com.alkemy.disney.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "genders")
@Data
public class GendersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String image;
    private String name;

    private ArrayList<MoviesModel> associatedMovies;
}
