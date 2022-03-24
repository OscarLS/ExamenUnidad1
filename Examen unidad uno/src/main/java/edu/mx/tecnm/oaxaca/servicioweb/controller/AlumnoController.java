/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.controller;

import edu.mx.tecnm.oaxaca.servicioweb.model.AlumnoModel;
import edu.mx.tecnm.oaxaca.servicioweb.service.AlumnoService;
import edu.mx.tecnm.oaxaca.servicioweb.utils.CustomResponse;
import edu.mx.tecnm.oaxaca.servicioweb.utils.ICA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Oscar
 */
@RestController
@RequestMapping("/api/v1/ica")
public class AlumnoController {
    
    
    @Autowired
    private AlumnoService alumnoService;
    
    
    @PostMapping("/")
    public CustomResponse createAlumno(@RequestBody AlumnoModel alumno) {
        CustomResponse customResponse = new CustomResponse();
        if(alumnoService.getAlumno(alumno.getNumeroControl())!=null){
            
            ICA ica = new ICA(alumnoService.getAlumno(alumno.getNumeroControl()).ica(),alumnoService.getAlumno(alumno.getNumeroControl()).getGenero());
            customResponse.setData(ica);
            customResponse.setMesage("Alumno ya esta registrado");
        }else if(alumno.getNumeroControl()!=null
                &&alumno.getGenero()!=null
                &&alumno.getAltura()!=null
                &&alumno.getCintura()!=null){
            alumnoService.createAlumno(alumno);
            ICA ica2 = new ICA(alumno.ica(),alumno.getGenero());
            customResponse.setData(ica2);
            customResponse.setMesage("Se registro al alumno");
        }else
        {
            customResponse.setMesage("Alumno no registrado: No se cuenta con la información necesaria para realizar el calculo");
        }
        return customResponse;
        
        
    }
    
    @GetMapping("/{numeroControl}")
    public CustomResponse getAlumno(@PathVariable String numeroControl){
        CustomResponse customResponse = new CustomResponse();
        if(alumnoService.getAlumno(numeroControl)!=null){
        customResponse.setData(alumnoService.getAlumno(numeroControl));
        }else{
            customResponse.setMesage("Alumno no registrado: No se cuenta con la información necesaria para realizar el calculo");
        }
        return customResponse;
    }
    
    
    @PutMapping("/{idAlumno}")
    public CustomResponse updateAlumno(@RequestBody AlumnoModel alumno,@PathVariable Integer idAlumno){
        CustomResponse customResponse = new CustomResponse();
        alumnoService.updateAlumno(alumno, idAlumno);
        return customResponse;
    }
    
    @DeleteMapping("/{idAlumno}")
    public CustomResponse deleteAlumno(@PathVariable Integer idAlumno){
        CustomResponse customResponse = new CustomResponse();
        alumnoService.deleteAlumno(idAlumno);
        return customResponse;
    }
}
