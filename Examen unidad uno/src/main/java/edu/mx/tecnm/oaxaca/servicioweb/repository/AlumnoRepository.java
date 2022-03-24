/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.repository;

import edu.mx.tecnm.oaxaca.servicioweb.model.AlumnoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Oscar
 */
@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoModel,Integer>{
    public AlumnoModel findByNumeroControl(String numeroControl);
}
