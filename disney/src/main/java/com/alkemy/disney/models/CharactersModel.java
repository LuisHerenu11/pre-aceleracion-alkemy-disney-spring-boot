package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="characters")
@Data
public class CharactersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column
    private String image;
    @Column(name = "name",unique = true)
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "history")
    private String history;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name= "characters_movies",
            joinColumns = @JoinColumn(name ="character_id"),
            inverseJoinColumns = @JoinColumn(name= "movie_id"))
    private ArrayList<MoviesModel> associatedMovies;
}
