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
public class Universite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long idUniversite ;
    String nomUniversite ;
    String adresse ;

    @OneToOne
    private Foyer foyer;

}
