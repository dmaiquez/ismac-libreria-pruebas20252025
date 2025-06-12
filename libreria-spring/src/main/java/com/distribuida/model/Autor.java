package com.distribuida.model;

public class Autor {

    private int idAutor;
    private String nombre;
    private String apellido;
    private String pais;
    private String direccion;
    private String telefono;

    public Autor() {
    }

    public Autor(int idAutor, String nombre, String apellido, String pais, String direccion, String telefono) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
