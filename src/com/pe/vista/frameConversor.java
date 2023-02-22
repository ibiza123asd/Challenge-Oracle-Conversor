/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pe.vista;

import com.pe.entidad.Moneda;
import com.pe.entidad.Temperatura;
import java.util.Set;
import javax.swing.JOptionPane;
import sun.util.calendar.CalendarUtils;

/**
 *
 * @author Brandon
 */
public class frameConversor extends javax.swing.JFrame {

    public frameConversor() {
        initComponents();

    }

    public void combo() {
        if (comboConversor.getSelectedIndex() == 0 || comboConversor.getSelectedIndex() == 1) {
            panel2.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame1 = new javax.swing.JFrame();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboConversor = new javax.swing.JComboBox<>();
        panel2 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        frame2 = new javax.swing.JFrame();
        combo2 = new javax.swing.JComboBox<>();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        frame3 = new javax.swing.JFrame();
        combo3 = new javax.swing.JComboBox<>();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();

        frame1.setTitle("Menú");
        frame1.setResizable(false);
        frame1.setVisible(true);

        panel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione una opción de conversión");

        comboConversor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conversor de Moneda", "Conversor de Temperatura" }));
        comboConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboConversorActionPerformed(evt);
            }
        });

        panel2.setVisible(false);

        boton1.setText("OK");
        boton1.setToolTipText("");
        boton1.setName("boton1"); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setText("CANCEL");
        boton2.setToolTipText("");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        frame1.setBounds(50, 100, 533,319);

        javax.swing.GroupLayout frame1Layout = new javax.swing.GroupLayout(frame1.getContentPane());
        frame1.getContentPane().setLayout(frame1Layout);
        frame1Layout.setHorizontalGroup(
            frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        frame1Layout.setVerticalGroup(
            frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frame2.setBounds(50, 50,500, 250);
        frame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convertir de Soles a Dolar", "Convertir de Soles a Euros", "Convertir de Soles a Sterlinas", "Convertir de Soles a Yen Japones", "Convertir de Soles a Wons", "Convertir de Dolar a Soles", "Convertir de Euros a Soles", "Convertir de Sterlinas a Soles", "Convertir de Yen a Soles", "Convertir de Wons a Soles" }));
        combo2.setVisible(false);
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });
        frame2.getContentPane().add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 23, 454, 40));

        boton3.setText("CANCELAR");
        boton3.setToolTipText("");
        boton3.setName("boton1"); // NOI18N
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        frame2.getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 156, 48));

        boton4.setText("OK");
        boton4.setToolTipText("");
        boton4.setName("boton1"); // NOI18N
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        frame2.getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 156, 48));

        frame3.setBounds(50, 50,500, 250);
        frame3.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convertir de C° a K", "Convertir de C° a °F", "Convertir de °F a C°", "Convertir de °F a K", "Convertir de K a C°", "Convertir de K a °F" }));
        combo2.setVisible(false);
        combo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo3ActionPerformed(evt);
            }
        });
        frame3.getContentPane().add(combo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 23, 454, 40));

        boton5.setText("CANCELAR");
        boton5.setToolTipText("");
        boton5.setName("boton1"); // NOI18N
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        frame3.getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 156, 48));

        boton6.setText("OK");
        boton6.setToolTipText("");
        boton6.setName("boton1"); // NOI18N
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        frame3.getContentPane().add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 156, 48));

        setTitle("Menú");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(745, 722));
        setSize(new java.awt.Dimension(745, 722));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton2ActionPerformed
    String valor;
    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        frame1.setVisible(false);
        if (comboConversor.getSelectedIndex() == 0) {
            valor = JOptionPane.showInputDialog("Ingresar la cantidad de dinero que deseas convertir:");

            if (valor == null) {
                frame1.setVisible(true);
                frame2.setVisible(false);
            } else {
                frame2.setVisible(true);
                combo2.setVisible(true);

            }

        } else {
            valor = JOptionPane.showInputDialog("Ingresar la temperatura que deseas convertir:");
            if (valor != null) {
                frame3.setVisible(true);
                combo3.setVisible(true);
            } else {
                frame1.setVisible(true);
                frame2.setVisible(false);
            }
        }

        //JOptionPane.showMessageDialog(null, "Conversion a dolar es:" + opcion);

    }//GEN-LAST:event_boton1ActionPerformed

    private void comboConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboConversorActionPerformed
        this.combo();
    }//GEN-LAST:event_comboConversorActionPerformed
    int opcion;
    String tipo;
    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        opcion = combo2.getSelectedIndex();
        switch (opcion) {
            case 5:
                tipo = "euros";
                break;
            case 6:
                tipo = "dolares";
                break;
            case 7:
                tipo = "sterlinas";
                break;
            case 8:
                tipo = "yenes";
                break;
            case 9:
                tipo = "wons";
                break;
        }


    }//GEN-LAST:event_combo2ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden

    }//GEN-LAST:event_formComponentHidden

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        frame1.setVisible(true);
        frame2.setVisible(false);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        Moneda moneda = new Moneda();
        double monto;
        Double montos;
        try {
            montos = Double.parseDouble(valor);
            if (montos < 0 || montos == null || montos.isNaN()) {
                throw new Exception();
            }
            monto = montos.doubleValue();
            moneda.setValorMonedad(monto);
            frame2.setVisible(false);
            if (opcion < 4) {
                JOptionPane.showMessageDialog(null, "El valor de s/"
                        + moneda.getValorMonedad()
                        + " convertido a "
                        + moneda.nombreMonedad(opcion)
                        + " equivale a "
                        + moneda.escogertipoConversion(opcion)
                        + " "
                        + moneda.nombreMonedad(opcion));
            } else {
                JOptionPane.showMessageDialog(null, "El valor de "
                        + moneda.getValorMonedad()
                        + " "
                        + tipo
                        + " convertido a "
                        + moneda.nombreMonedad(opcion)
                        + " equivale a "
                        + moneda.escogertipoConversion(opcion)
                        + " "
                        + moneda.nombreMonedad(opcion));
            }
            this.continuar();
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, "No se aceptan textos, vacios o negativos");
            this.continuar();
            frame2.setVisible(false);
        }


    }//GEN-LAST:event_boton4ActionPerformed
    int opcionTemp;
    String nameTemp;

    public void continuar() {
        int visibilidad = JOptionPane.showConfirmDialog(this, "Deseas continuar", "Seleccionar una opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (visibilidad == JOptionPane.YES_OPTION) {
            frame1.setVisible(true);
        } else if (visibilidad == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa terminado");
            frame1.setVisible(false);
        } else {
            frame1.setVisible(false);
        }
    }

    private void combo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo3ActionPerformed
        opcionTemp = combo3.getSelectedIndex();
        switch (opcionTemp) {
            case 0:
                nameTemp = "Celcius a Kelvin";
                break;
            case 1:
                nameTemp = "Celcius a Fahrenheit";
                break;
            case 2:
                nameTemp = "Farehnheit a Celius";
                break;
            case 3:
                nameTemp = "Farehnheit a Kelvin";
                break;
            case 4:
                nameTemp = "Kevin a Celcius";
                break;
            case 5:
                nameTemp = "Kelvin a Farehnheit";
                break;
        }
    }//GEN-LAST:event_combo3ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        frame1.setVisible(true);
        frame2.setVisible(false);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        Temperatura temperatura = new Temperatura();
        Double montos;
        try {
            montos = Double.parseDouble(valor);
            if (montos < 0 || montos == null || montos.isNaN()) {
                throw new Exception();
            }
            double temp = montos.doubleValue();
            temperatura.setValorTemperatura(temp);
            frame3.setVisible(false);
            JOptionPane.showMessageDialog(null, "La temperatura "
                    + temperatura.getValorTemperatura()
                    + " convertido de "
                    + nameTemp
                    + " es de "
                    + temperatura.escogerOpcion(opcionTemp));

            this.continuar();
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, "No se aceptan textos, vacios o negativos");
            this.continuar();
            frame3.setVisible(false);
        }

    }//GEN-LAST:event_boton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameConversor().setVisible(false);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JComboBox<String> comboConversor;
    private javax.swing.JFrame frame1;
    private javax.swing.JFrame frame2;
    private javax.swing.JFrame frame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
