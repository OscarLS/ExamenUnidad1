/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.service;

import edu.mx.tecnm.oaxaca.servicioweb.model.AlumnoModel;

/**
 *
 * @author Oscar
 */
public interface AlumnoService {
    public void createAlumno(AlumnoModel alumno);
    public AlumnoModel getAlumno(String numeroControl);
     public void updateAlumno(AlumnoModel alumnoModel, Integer idAlumno);
     public void deleteAlumno(Integer idAlumno);
     
}
