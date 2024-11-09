package com.example.sprintboot1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Foyer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long idFoyer ;
    String nomFoyer;
    long capaciteFoyer ;

    @OneToOne(mappedBy= "foyer")
    private Universite universite;

}
