/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.servicioweb.utils;

import java.util.LinkedList;

/**
 *
 * @author Oscar
 */
public class CustomResponse {
    private Integer httpCode;
    private Object data;
    private String mesage;
    
    public CustomResponse(){
        this.httpCode = 200;
        data = new LinkedList();
        this.mesage = "Ok";
    }
    

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMesage() {
        return mesage;
    }

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }
    
    
}
