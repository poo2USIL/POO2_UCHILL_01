
package com.mycompany.usil_pre_2310119.view;

import com.mycompany.usil_pre_2310119.controller.TareaController;
import com.mycompany.usil_pre_2310119.controller.ProyectoController;
import com.mycompany.usil_pre_2310119.model.Proyecto;
import com.mycompany.usil_pre_2310119.model.Tarea;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FrmRegistarTarea extends javax.swing.JFrame {
    
    private TareaController tareaController;
    private ProyectoController proyectoController;
    
    public FrmRegistarTarea() {
        initComponents();
        tareaController = new TareaController();
        proyectoController = new ProyectoController();
        cargarProyectosEnComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnRegistar = new javax.swing.JButton();
        BtnListar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        ComboBox1 = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();
        btnNuevoP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Responsable");

        jLabel3.setText("Estado");

        jLabel4.setText("Proyecto");

        BtnRegistar.setText("Registar");
        BtnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistarActionPerformed(evt);
            }
        });

        BtnListar.setText("Listar");
        BtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "En progreso", "Completada" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });

        btnNuevoP.setText("Nuevo Proyecto");
        btnNuevoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevoP)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtResponsable)
                                        .addComponent(ComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(BtnRegistar)
                        .addGap(52, 52, 52)
                        .addComponent(BtnListar)
                        .addGap(48, 48, 48)
                        .addComponent(BtnCancelar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnNuevoP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistar)
                    .addComponent(BtnListar)
                    .addComponent(BtnCancelar))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistarActionPerformed
        String nombre = txtNombre.getText();
        String responsable = txtResponsable.getText();
        String estado = ComboBox1.getSelectedItem().toString();
        String nombreProyecto = ComboBox2.getSelectedItem().toString(); 
        Proyecto proyecto = new Proyecto(nombreProyecto);
        Tarea nuevaTarea = new Tarea(nombre, responsable, estado, proyecto);
        try {
            tareaController.registrarTarea(nuevaTarea);
            JOptionPane.showMessageDialog(null, "Tarea registrada correctamente.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar la tarea.");
            ex.printStackTrace();
        }
        limpiarCampos();
    }//GEN-LAST:event_BtnRegistarActionPerformed

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed

    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void btnNuevoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPActionPerformed
        mostrarDialogoNuevoProyecto();
    }//GEN-LAST:event_btnNuevoPActionPerformed

    private void BtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarActionPerformed
        FrmBuscarTarea frame = new FrmBuscarTarea();
        frame.setVisible(true);
    }//GEN-LAST:event_BtnListarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        
    }//GEN-LAST:event_ComboBox2ActionPerformed

    
    
    private void cargarProyectosEnComboBox() {
        try {
        List<Proyecto> proyectos = proyectoController.listarProyectos();        
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        for (Proyecto proyecto : proyectos) {
            modelo.addElement(proyecto.getNombreP());
        }
        ComboBox2.setModel(modelo);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los proyectos.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }
    
    private void limpiarCampos() {
    txtNombre.setText("");
    txtResponsable.setText("");
    ComboBox1.setSelectedIndex(0);
    ComboBox2.setSelectedIndex(0);
    }
    
    private void mostrarDialogoNuevoProyecto() {
    String nuevoProyecto = JOptionPane.showInputDialog(this, "Ingrese el nombre del nuevo proyecto:", "Nuevo Proyecto", JOptionPane.PLAIN_MESSAGE);
    if (nuevoProyecto != null && !nuevoProyecto.trim().isEmpty()) {
        try {
            Proyecto proyecto = new Proyecto(nuevoProyecto);
            proyectoController.registrarProyecto(proyecto);
            cargarProyectosEnComboBox();
            JOptionPane.showMessageDialog(this, "Proyecto guardado exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el proyecto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de proyecto válido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }
    
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
            java.util.logging.Logger.getLogger(FrmRegistarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistarTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnListar;
    private javax.swing.JButton BtnRegistar;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JButton btnNuevoP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
