package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer> {

    public List<Personne> findAllByNom(String nom);
    public List<Personne> findAllByNomAndPrenom(String nom, String prenom);
}