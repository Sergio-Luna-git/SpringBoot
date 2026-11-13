package com.frig0polla.practica_6_sergio_luna.test;

import com.frig0polla.practica_6_sergio_luna.model.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import com.frig0polla.practica_6_sergio_luna.model.Alumno;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestAlumno {
    private static final Logger myLog = LoggerFactory.getLogger(TestAlumno.class);


    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public void ejecutar() {
        Alumno test1 = new Alumno("Ana", "García López", "ana.garcia.dam1@example.com", 8.75);
        myLog.info(test1.toString());

        entityManager.persist(test1);

        myLog.info(test1.toString());

        //delete
        myLog.info(test1.toString());
        entityManager.remove(test1);
        myLog.info(test1.toString());
        //como ya hemos comprobado que se inserta bien

        //modificar
        myLog.info(test1.toString());
        test1.setNombre("Ana Modificada");
        entityManager.merge(test1);
        myLog.info(test1.toString());
    }
}
