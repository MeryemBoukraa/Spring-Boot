package com.example.sprintboot1.repository;

import com.example.sprintboot1.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepositry extends JpaRepository<Universite , Long> {
}
