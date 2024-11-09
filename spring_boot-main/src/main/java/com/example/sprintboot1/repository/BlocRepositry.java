package com.example.sprintboot1.repository;

import com.example.sprintboot1.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlocRepositry extends JpaRepository<Bloc,Long >
{

}
