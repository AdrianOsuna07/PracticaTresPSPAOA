/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import Modelo.Cliente;

public class PanelVer extends javax.swing.JPanel {

    private Controlador controlador; // Referencia al controlador

    public PanelVer() {
        initComponents();
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
        mostrarClienteActual();
    }

    public void mostrarClienteActual() {
        if (controlador != null) {
            Cliente c = controlador.getClienteActual();
            if (c != null) {
                cajaNumero.setText(String.valueOf(c.getNumero()));
                cajaNombre.setText(c.getNombre());
                cajaPunto.setText(String.valueOf(c.getPuntos()));
                cajaFecha.setText(c.getFechaNaci() != null ? c.getFechaNaci().toString() : "");
            } else {
                // Si la lista está vacía
                cajaNumero.setText("");
                cajaNombre.setText("");
                cajaPunto.setText("");
                cajaFecha.setText("");
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Numero = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        PuntosLabel = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        cajaNumero = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaPunto = new javax.swing.JTextField();
        cajaFecha = new javax.swing.JTextField();
        Adelante = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        PrimerCliente = new javax.swing.JButton();
        UltimoCliente = new javax.swing.JButton();

        jButton2.setText("jButton1");

        jButton3.setText("Primer Ciente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Numero.setText("Numero: ");

        Nombre.setText("Nombre: ");

        PuntosLabel.setText("Puntos:");

        Fecha.setText("Fecha: ");

        cajaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNumeroActionPerformed(evt);
            }
        });

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        Adelante.setText("Atras");
        Adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdelanteActionPerformed(evt);
            }
        });

        Atras.setText("Siguiente");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        PrimerCliente.setText("Primer Ciente");
        PrimerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimerClienteActionPerformed(evt);
            }
        });

        UltimoCliente.setText("Ultimo Cliente");
        UltimoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Adelante)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PuntosLabel)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Atras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cajaPunto)
                    .addComponent(cajaFecha))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(PrimerCliente)
                .addGap(34, 34, 34)
                .addComponent(UltimoCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numero)
                    .addComponent(cajaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PuntosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adelante)
                    .addComponent(Atras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrimerCliente)
                    .addComponent(UltimoCliente))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNumeroActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        if (controlador != null) {
            controlador.avanzar();
            mostrarClienteActual();
        }
    }//GEN-LAST:event_AtrasActionPerformed

    private void AdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdelanteActionPerformed
        if (controlador != null) {
            controlador.retroceder();
            mostrarClienteActual();
        }
    }//GEN-LAST:event_AdelanteActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void PrimerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimerClienteActionPerformed
        if (controlador != null) {
            controlador.irAPrimero();
            mostrarClienteActual();
        }
    }//GEN-LAST:event_PrimerClienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void UltimoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoClienteActionPerformed
        if (controlador != null) {
            controlador.irAlUltimo();
            mostrarClienteActual();
        }
    }//GEN-LAST:event_UltimoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adelante;
    private javax.swing.JButton Atras;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Numero;
    private javax.swing.JButton PrimerCliente;
    private javax.swing.JLabel PuntosLabel;
    private javax.swing.JButton UltimoCliente;
    private javax.swing.JTextField cajaFecha;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaNumero;
    private javax.swing.JTextField cajaPunto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
