package com.example.sprintboot1.repository;

import com.example.sprintboot1.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepositry extends JpaRepository<Foyer , Long> {
}
