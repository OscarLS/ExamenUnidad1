/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.utils;

/**
 *
 * @author Oscar
 */
public class ICA {

    private Double ica;
    private String nivel;

    public ICA(Double ica, String sexo) {
        this.ica = ica;
        if (sexo.equals("H")) {
            if (ica <= 0.34) {
                nivel = "Delgadez severa";
            } else if (ica <= 0.42) {
                nivel = "Delgadez leve";
            } else if (ica <= 0.52) {
                nivel = "Peso normal";
            } else if (ica <= 0.57) {
                nivel = "Sobrepeso";
            } else if (ica <= 0.62) {
                nivel = "Sobrepeso elevado";
            } else if (ica >= 0.63) {
                nivel = "Obesidad mórbida";
            }
        } else if (sexo.equals("M")) {
            if (ica <= 0.34) {
                nivel = "Delgadez severa";
            } else if (ica <= 0.41) {
                nivel = "Delgadez leve";
            } else if (ica <= 0.48) {
                nivel = "Peso normal";
            } else if (ica <= 0.53) {
                nivel = "Sobrepeso";
            } else if (ica <= 0.57) {
                nivel = "Sobrepeso elevado";
            } else if (ica >= 0.58) {
                nivel = "Obesidad mórbida";
            }
        }
        else {
            nivel = "Error";
        }
            
    }

    public Double getIca() {
        return ica;
    }

    public void setIca(Double ica) {
        this.ica = ica;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
