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
    @Column()
    private String image;
    @Column(unique = true)
    private String title;
    @Column()
    private Date creationDate;
    @Column()
    private Integer qualification;

    private ArrayList<CharactersModel> associatedCharacters;

}
