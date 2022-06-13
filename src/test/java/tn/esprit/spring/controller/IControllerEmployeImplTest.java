package tn.esprit.spring.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.services.EmployeServiceImpl;
import tn.esprit.spring.services.IEmployeService;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
class IControllerEmployeImplTest {

    @Autowired
    EmployeRepository employeRepository ;
    @Autowired
    EmployeServiceImpl employeService;

    @Test
    void ajouterEmploye() {
        Employe employe = new Employe();
        employe.setEmail("maram.bechihi@esprit.Tn");
        employe.setNom("maram");
        employe.setPrenom("bechih");

        employeRepository.save(employe)  ;
        Assertions.assertThat(employe.getId()).isGreaterThan(0);

    }

    @Test
    void mettreAjourEmailByEmployeId() {
    }

    @Test
    void affecterEmployeADepartement() {
    }

    @Test
    void desaffecterEmployeDuDepartement() {
    }

    @Test
    void ajouterContrat() {
    }

    @Test
    void affecterContratAEmploye() {
    }

    @Test
    void getEmployePrenomById() {
    }

    @Test
    void deleteEmployeById() {
    }

    @Test
    void deleteContratById() {
    }

    @Test
    void getNombreEmployeJPQL() {
    }

    @Test
    void getAllEmployeNamesJPQL() {
    }

    @Test
    void getAllEmployeByEntreprise() {
    }

    @Test
    void mettreAjourEmailByEmployeIdJPQL() {
    }

    @Test
    void deleteAllContratJPQL() {
    }
}