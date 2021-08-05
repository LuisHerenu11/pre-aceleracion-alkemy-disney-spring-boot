package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "characters")
@Data
public class CharactersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column
    private String image;
    @Column(unique = true)
    private String name;
    @Column
    private Integer age;
    @Column
    private Integer weight;
    @Column
    private String history;

    private ArrayList<MoviesModel> associatedMovies;
}
