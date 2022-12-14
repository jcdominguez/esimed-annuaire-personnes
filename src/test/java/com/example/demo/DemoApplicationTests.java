package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    EntrepriseRepository entrepriseRepository;
    @Autowired
    PersonneRepository personneRepository;

    @Autowired
    MetierRepository metierRepository;

    @Test
    void createEntreprise() {
        Entreprise twitter = new Entreprise("Twitter");
        entrepriseRepository.save(twitter);

        Personne michel = new Personne("Michel", "Delpeche", 55);
        michel.setEmployeur(twitter);
        personneRepository.save(michel);

        Personne marie = new Personne("Marie", "Dupont", 33);
        marie.setEmployeur(twitter);
        personneRepository.save(marie);


        twitter = entrepriseRepository.findById(1).get();
        System.out.println(twitter.getEmployes().size());
    }

    @Test
    void createMetier() {
        Personne michel = new Personne("Michel", "Delpeche", 55);
        personneRepository.save(michel);

        Personne marie = new Personne("Marie", "Dupont", 33);
        personneRepository.save(marie);

        Personne felix = new Personne("Felix", "Dupont", 33);
        personneRepository.save(felix);

        Metier codeur = new Metier("Codeur");
        metierRepository.save(codeur);

        Metier boulanger = new Metier("Boulanger");
        metierRepository.save(boulanger);

        michel.addMetier(codeur);
        michel.addMetier(boulanger);
        personneRepository.save(michel);

        felix.addMetier(boulanger);
        personneRepository.save(felix);
    }

}
