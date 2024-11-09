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
public class Reservation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long idReservation;
    Date anneeUniversitaire ;
    Boolean estValide;

    @ManyToMany(mappedBy="reservations", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
