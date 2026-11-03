package com.frig0polla.practica1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
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
            @RequestParam int veces
    ) {
        LocalDateTime ldt = LocalDateTime.now();
        String saludo = ldt + "Saludos desde " + centro + " de parte de " + desarrollador + "<br />";
        StringBuilder sb = new StringBuilder( saludo.repeat(veces));

        return sb.toString();
    }
}
