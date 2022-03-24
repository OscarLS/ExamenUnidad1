/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.implemet.service;

import edu.mx.tecnm.oaxaca.servicioweb.model.AlumnoModel;
import edu.mx.tecnm.oaxaca.servicioweb.repository.AlumnoRepository;
import edu.mx.tecnm.oaxaca.servicioweb.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Oscar
 */
@Service
public class AlumnoServiceImplement implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public void createAlumno(AlumnoModel alumno) {
        alumnoRepository.save(alumno);
    }

    @Override
    public AlumnoModel getAlumno(String numeroControl) {
        return alumnoRepository.findByNumeroControl(numeroControl);
    }

    @Override
    public void updateAlumno(AlumnoModel alumnoModel, Integer idAlumno) {
        alumnoModel.setIdAlumno(idAlumno);
        alumnoRepository.save(alumnoModel);
    }

    @Override
    public void deleteAlumno(Integer idAlumno) {
       alumnoRepository.deleteById(idAlumno);
    }
}
