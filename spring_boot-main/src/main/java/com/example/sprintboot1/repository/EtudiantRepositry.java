package com.example.sprintboot1.repository;

import com.example.sprintboot1.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepositry extends JpaRepository<Etudiant , Long> {
}
