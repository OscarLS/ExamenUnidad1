/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Oscar
 */
@RestController/*
@RequestMapping("/api/v1/ejemplo")*/
public class indexController {
    
    @GetMapping("/")
    public String index(){
        return "<h1>Holis soy tu servidor en Spring</h1>";
    }
    /*
    @GetMapping("/ejemplo")
    public String ejemploPeticionPost(){
        return "<h1>Soy la ruta EJEMPLO</h1>";
    }
    @GetMapping("/ejemplo/retorno/numero")
    public Integer ejemploEntero(){
        return (int)((Math.random()+1)*100);
    }
    
    @PostMapping("/saludar")
    public String suludor(String name){
        String saludo = "Hola soy tu servidor mucho gusto";
        //return saludo.concat(name);
        return saludo;
    }*/
}
