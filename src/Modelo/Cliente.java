package Modelo;

import java.time.LocalDate;

public class Cliente {
    private int numero;
    private String nombre;
    private float puntos;
    private LocalDate fechaNaci;

    
    public Cliente(int numero, String nombre, float puntos, LocalDate fechaNaci) {
        this.numero = numero;
        this.nombre = nombre;
        this.puntos = puntos;
        this.fechaNaci = fechaNaci;
    }
    
    //Hacemos todos los metodos gets
    public int getNumero() {return numero;}
    public String getNombre() {return nombre;}
    public float getPuntos() {return puntos;}
    public LocalDate getFechaNaci() {return fechaNaci;}
    
    //Hacemos todos los metodos set

    public void setNumero(int numero) {this.numero = numero;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPuntos(float puntos) {this.puntos = puntos;}
    public void setFechaNaci(LocalDate fechaNaci) {this.fechaNaci = fechaNaci;}
    
    @Override
    public String toString(){
        return "Numero: " + numero + "\nNombre: " + nombre + "\nPuntos: " + puntos + "\nFechaNac: " + fechaNaci;
    }
    
}
