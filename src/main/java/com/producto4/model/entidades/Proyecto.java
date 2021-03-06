package com.producto4.model.entidades;
// Generated 26-dic-2021 21:27:55 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Proyecto generated by hbm2java
 */
public class Proyecto  implements java.io.Serializable {


     private short id;
     private String ubicacion;
     private Date fechaInicio;
     private Date fechaFinal;

    public Proyecto() {
    }

	
    public Proyecto(short id, String ubicacion, Date fechaInicio) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.fechaInicio = fechaInicio;
    }
    public Proyecto(short id, String ubicacion, Date fechaInicio, Date fechaFinal) {
       this.id = id;
       this.ubicacion = ubicacion;
       this.fechaInicio = fechaInicio;
       this.fechaFinal = fechaFinal;
    }
   
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFinal() {
        return this.fechaFinal;
    }
    
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }




}


