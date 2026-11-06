package com.frig0polla.practica1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class indexController {

    @Value("${app.centro}")
    String centro;

    @GetMapping("/centro")
    public String centro() {
        return centro;
    }

    @Value("${app.developer}")
    String desarrollador;

    @GetMapping("/numsaludo")
    public String saludo(
            @RequestParam int veces) {
        LocalDateTime ldt = LocalDateTime.now();

        if (ldt.getHour() < 12 && ldt.getHour() > 6) {
            System.out.println("<b>" + "Buenos días" + "<br/>");
        } else if (ldt.getHour() > 12 && ldt.getHour() < 20) {
            System.out.println("<b>" + "Buenas tardes" + "<br/>");
        } else {
            System.out.println("<b>" + "Buenas noches" + "<br/>");
        }
        String saludo = ldt + "Saludos desde " + centro + " de parte de " + desarrollador + "<br />";
        return saludosNumerados(saludo, 1, veces);
    }

    private String saludosNumerados(String saludo, int indice, int veces) {
        if (indice > veces) {
            return " ";
        }
        return "Saludo número " + indice + ": " + saludo
                + saludosNumerados(saludo, indice + 1, veces);
    }
}
