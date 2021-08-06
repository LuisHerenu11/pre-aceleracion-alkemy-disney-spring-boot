package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="movies")
@Data

public class MoviesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(name = "image",unique = true)
    private String image;
    @Column(name = "title",unique = true)
    private String title;
    @Column(name = "creationDate")
    private Date creationDate;
    @Column(name = "qualification")
    private Integer qualification;

    @ManyToMany(mappedBy = "associatedMovies", fetch = FetchType.LAZY)
    private ArrayList<CharactersModel> associatedCharacters;

}
