package com.producto4.model.entidades;
// Generated 26-dic-2021 21:27:55 by Hibernate Tools 4.3.1



/**
 * UsuariosProyectos generated by hbm2java
 */
public class UsuariosProyectos  implements java.io.Serializable {


     private short id;
     private Sede sede;
     private Usuario usuario;

    public UsuariosProyectos() {
    }

    public UsuariosProyectos(short id, Sede sede, Usuario usuario) {
       this.id = id;
       this.sede = sede;
       this.usuario = usuario;
    }
   
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }
    public Sede getSede() {
        return this.sede;
    }
    
    public void setSede(Sede sede) {
        this.sede = sede;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }




}


