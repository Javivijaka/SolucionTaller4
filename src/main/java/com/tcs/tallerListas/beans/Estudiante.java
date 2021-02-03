package com.tcs.tallerListas.beans;

public class Estudiante {

    private String idestudiante;
    private String nombre;
    private String edad;
    private String grado;


    public String getIdestudiante() { return idestudiante; }

    public void setIdestudiante(String idestudiante) { this.idestudiante = idestudiante; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEdad() { return edad; }

    public void setEdad(String edad) { this.edad = edad; }

    public String getGrado() { return grado; }

    public void setGrado(String grado) { this.grado = grado; }

    @Override
    public String toString() {
        return "Estudiante{" +
                "idestudiante='" + idestudiante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", grado='" + grado + '\'' +
                '}';
    }
}
