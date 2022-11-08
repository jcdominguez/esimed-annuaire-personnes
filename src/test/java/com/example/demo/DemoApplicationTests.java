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

    @Test
    void createEntreprise() {
        Entreprise twitter = new Entreprise("Twitter");
        entrepriseRepository.save(twitter);

        Personne michel = new Personne("Michel", "Delpeche", 55);
        michel.setEmployeur(twitter);
        personneRepository.save(michel);



    }

}
