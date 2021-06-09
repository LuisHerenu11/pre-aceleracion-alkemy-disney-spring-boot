package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "movies")
@Data

public class MoviesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String image;
    private String title;
    private Date creationDate;
    private Integer qualification;
    @ManyToMany(targetEntity = CharactersModel.class, cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinTable(name = "movies_characters", joinColumns = @JoinColumn(name= "movie_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "character_id",referencedColumnName = "id"))
    @JsonIgnoreProperties("movies")
    private ArrayList<CharactersModel> associatedCharacters;

}
