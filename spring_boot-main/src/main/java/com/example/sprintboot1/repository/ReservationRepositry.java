package com.example.sprintboot1.repository;

import com.example.sprintboot1.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepositry extends JpaRepository<Reservation, Long> {
}
