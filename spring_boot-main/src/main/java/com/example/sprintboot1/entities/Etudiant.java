package com.example.sprintboot1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long idEtudiant ;
    String nomEt;
    String prenomEt;
    long cin ;
    String ecole ;
    Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
