package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
    private String image;
    private String name;
    private Integer age;
    private Integer weight;
    private String history;
    @ManyToMany(targetEntity = MoviesModel.class, mappedBy = "characters", cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    @JsonIgnoreProperties("characters")
    @EqualsAndHashCode.Exclude
    private ArrayList<MoviesModel> associatedMovies;
}
