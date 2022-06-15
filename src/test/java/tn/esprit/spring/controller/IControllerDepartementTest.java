package tn.esprit.spring.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
class IControllerDepartementTest {

    @Autowired
    DepartementRepository departementRepository ;


    @Test
    void ajouterDepartement() {
        Departement departement = new Departement();
        departement.setId(5);
        departement.setName("informatique");


        departementRepository.save(departement)  ;
        Assertions.assertThat(departement.getId()).isGreaterThan(0);

    }

    @Test
    void mettreAjourEmailByDepartementId() {
        System.out.println("bonjour");
    }

    @Test
    void affecterDepartementADepartement() {
    }

    @Test
    void desaffecterDepartementDuDepartement() {
    }

    @Test
    void ajouterContrat() {
    }

    @Test
    void affecterContratADepartement() {
    }

    @Test
    void getDepartementPrenomById() {
    }

    @Test
    void deleteDepartementById() {
    }

    @Test
    void deleteContratById() {
    }

    @Test
    void getNombreDepartementJPQL() {
    }

    @Test
    void getAllDepartementNamesJPQL() {
    }

    @Test
    void getAllDepartementByEntreprise() {
    }

    @Test
    void mettreAjourEmailByDepartementIdJPQL() {
    }

    @Test
    void deleteAllContratJPQL() {
    }
}