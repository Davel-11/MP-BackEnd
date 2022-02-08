package com.mpbackend.Fiscalia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Fiscalia {

    private Integer id;
    private String ubicacion;
    private String telefono;
    private Date fechaCreacion;
    private Date fechaModficiacion;
    private String usuarioEditor;

    public Fiscalia() {
    }

    public Fiscalia(Integer id, String ubicacion, String telefono, Date fechaCreacion, Date fechaModficiacion, String usuarioEditor) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.fechaCreacion = fechaCreacion;
        this.fechaModficiacion = fechaModficiacion;
        this.usuarioEditor = usuarioEditor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModficiacion() {
        return fechaModficiacion;
    }

    public void setFechaModficiacion(Date fechaModficiacion) {
        this.fechaModficiacion = fechaModficiacion;
    }

    public String getUsuarioEditor() {
        return usuarioEditor;
    }

    public void setUsuarioEditor(String usuarioEditor) {
        this.usuarioEditor = usuarioEditor;
    }
}
