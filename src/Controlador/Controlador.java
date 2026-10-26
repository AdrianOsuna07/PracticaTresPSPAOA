package Controlador;

import Modelo.Cliente;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Controlador {
    private ArrayList lista;
    private int indice;

    public Controlador() {
        this.lista = new ArrayList <Cliente>();
        this.indice = 0;
    }
    
    public void avanzar(){
        indice++;
    }
    
    public void retroceder(){
        indice--;
    }
    
    public void irAPrimero(){
        indice = 0;
    }
    
    public void irAlUltimo(){
        indice = lista.size()-1;
    }
    
    public boolean añadirCliente(int numero, String nombre, float puntos, LocalDate fechaNaci, JLabel lblError){
        if (Validador.validarCliente(fechaNaci, puntos, lblError)) {
            lista.add(new Cliente(numero, nombre, puntos, fechaNaci));
            return true;
        }
        return false; // Hubo un error y se mostró en el JLabel rojo
    }
    

    public class Validador {

        public static boolean validarCliente(LocalDate fechaNac, float puntos, JLabel lblMensaje) {
            // Validar fecha de nacimiento (entre 1900 y 2015)
            if (fechaNac == null) {
                mostrarError(lblMensaje, "Error: La fecha no puede estar vacía.");
                return false;
            }

            int anio = fechaNac.getYear();
            if (anio < 1900 || anio > 2015) {
                mostrarError(lblMensaje, "Error: El año debe estar entre 1900 y 2015.");
                return false;
            }

            // Validar puntos (entre 0 y 1000)
            if (puntos < 0 || puntos > 1000) {
                mostrarError(lblMensaje, "Error: Los puntos deben estar entre 0 y 1000.");
                return false;
            }

            // Si todo es correcto, limpiamos el mensaje de error
            lblMensaje.setText("");
            return true;
        }

        private static void mostrarError(JLabel lblMensaje, String mensaje) {
            lblMensaje.setForeground(Color.RED);
            lblMensaje.setText(mensaje);
        }
    }
}
