package com.frig0polla.practica_6_sergio_luna;

import com.frig0polla.practica_6_sergio_luna.test.TestAlumno;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Practica6SergioLunaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Practica6SergioLunaApplication.class,args );
        }

        @Bean
        public CommandLineRunner run(TestAlumno runner) {
        return args -> {
            runner.ejecutar();
        };
    }


}
