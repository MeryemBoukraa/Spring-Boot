package com.example.sprintboot1.repository;

import com.example.sprintboot1.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeChambreRepositry extends JpaRepository<Chambre , Long> {
}
