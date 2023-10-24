package com.example.recyclerviewpersonas.models;

public class Persona {

private String nombre;
private String edad;
private String nacionalidad;

private String matricula;

public Persona(String nombre, String edad, String nacionalidad, String matricula){
    this.nombre = nombre;
    this.edad = edad;
    this.nacionalidad = nacionalidad;
    this.matricula = matricula;
}

    public String getNombre()
    {
        return nombre;
    }

    public String getEdad()
    {
        return edad;
    }

    public String getNacionalidad()
    {
        return nacionalidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
