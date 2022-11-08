package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="personnes")
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String prenom;
    private String nom;
    private int age;

    @ManyToOne
    private Entreprise employeur;

    private LocalDate dateAnniversaire;

    public Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    public Personne() {
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateAnniversaire() {
        return dateAnniversaire;
    }

    public void setDateAnniversaire(LocalDate dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    public Entreprise getEmployeur() {
        return employeur;
    }

    public void setEmployeur(Entreprise employeur) {
        this.employeur = employeur;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", dateAnniversaire=" + dateAnniversaire +
                '}';
    }
}
