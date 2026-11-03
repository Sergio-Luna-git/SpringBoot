package com.frig0polla.javadelpalo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class indexController {
    @Value("${app.developer}")
    String saludo;




    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello from Spring";

    }

    @GetMapping("/hola")
    @ResponseBody
    public String hello() {
        return "Hello " + saludo;

    }

    @GetMapping("/saludo")
    public String saludo(
            @RequestParam String nombre,
            @RequestParam( required = false, name ="años", defaultValue ="18") int edad
    ) {
        return "Hola " + nombre + ". Tienes " + edad + " años.";
        /*http://localhost:8000/api/saludo?nombre=Sergio&a%C3%B1os=20*/
    }

    @GetMapping("/iemestre/{name}")
    public String iemestre(
            @PathVariable(name="name", required = true) String nombre
    ) {
        return "Ie mestreeeee " + nombre;
    }
}
