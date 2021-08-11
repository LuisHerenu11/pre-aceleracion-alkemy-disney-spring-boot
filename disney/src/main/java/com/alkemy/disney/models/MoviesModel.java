package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    //ElementCollection
    @ManyToMany(mappedBy = "associatedMovies", fetch = FetchType.LAZY)
    private List<CharactersModel> associatedCharacters;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_id", nullable = false)
    private GendersModel associatedGender;

}
