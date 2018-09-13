package com.holamundo.taller1;

public class Operacion {
    private String descripcion;
    private String datos;
    private double resultado;

    public Operacion(String descripcion, String datos, double resultado) {
        this.descripcion = descripcion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
