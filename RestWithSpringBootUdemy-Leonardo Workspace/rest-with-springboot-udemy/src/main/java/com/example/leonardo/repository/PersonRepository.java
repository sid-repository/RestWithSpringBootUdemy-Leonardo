package com.example.leonardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.leonardo.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
