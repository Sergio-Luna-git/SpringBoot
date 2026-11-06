package com.frig0polla.filmin;

import com.frig0polla.filmin.test.TestFilm;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilminApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilminApplication.class, args);
    }

    public CommandLineRunner run(TestFilm tfRunner){
        return args -> {
            tfRunner.ejecutar();
        };
    }
}
