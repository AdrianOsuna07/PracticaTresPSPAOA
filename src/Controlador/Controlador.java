package Controlador;

import Modelo.Cliente;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Controlador {
    private ArrayList<Cliente> lista;
    private int indice;
    

    public Controlador() {
        this.lista = new ArrayList<>();
        this.indice = 0;
        
        lista.add(new Cliente(1, "Ana Gómez", 450.0f, LocalDate.of(1995, 5, 12)));
        lista.add(new Cliente(2, "Carlos Pérez", 820.5f, LocalDate.of(1988, 11, 23)));
        lista.add(new Cliente(3, "Lucía Martí", 150.0f, LocalDate.of(2005, 2, 8)));
    }
    
    public void avanzar(){
        if (indice < lista.size() - 1) {
            indice++;
        }
    }
    
    public void retroceder(){
        if (indice > 0) {
            indice--;
        }
    }
    
    public void irAPrimero(){
        indice = 0;
    }
    
    public void irAlUltimo(){
        if (!lista.isEmpty()) {
            indice = lista.size() - 1;
        }
    }
    
    public boolean añadirCliente(int numero, String nombre, float puntos, LocalDate fechaNaci, JLabel lblError){
        if (Validador.validarCliente(fechaNaci, puntos, lblError)) {
            lista.add(new Cliente(numero, nombre, puntos, fechaNaci));
            indice = lista.size() - 1;
            return true;
        }
        return false;
    }

    public Cliente getClienteActual() {
        if (lista.isEmpty() || indice < 0 || indice >= lista.size()) {
            return null;
        }
        return lista.get(indice);
    }
    
    public static class Validador {
        public static boolean validarCliente(LocalDate fechaNac, float puntos, JLabel lblMensaje) {
            if (fechaNac == null) {
                mostrarError(lblMensaje, "Error: La fecha no puede estar vacía.");
                return false;
            }

            int anio = fechaNac.getYear();
            if (anio < 1900 || anio > 2015) {
                mostrarError(lblMensaje, "Error: El año debe estar entre 1900 y 2015.");
                return false;
            }

            if (puntos < 0 || puntos > 1000) {
                mostrarError(lblMensaje, "Error: Los puntos deben estar entre 0 y 1000.");
                return false;
            }

            lblMensaje.setText("");
            return true;
        }

        private static void mostrarError(JLabel lblMensaje, String mensaje) {
            lblMensaje.setForeground(Color.RED);
            lblMensaje.setText(mensaje);
        }
    }
}