package com.frig0polla.filmin.test;


import com.frig0polla.filmin.model.Film;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestFilm {

    private static final Logger myLog= LoggerFactory.getLogger(TestFilm.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void ejecutar() {

        Film f = new Film("El Padrino", 1972, "USA", "La historia de la familia Corleone", 9.2f);
        myLog.info(f.toString());


        entityManager.persist(f);


        myLog.info(f.toString());
    }

}
