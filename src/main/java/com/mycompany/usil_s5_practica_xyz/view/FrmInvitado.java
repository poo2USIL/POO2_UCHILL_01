
package com.mycompany.usil_s5_practica_xyz.view;

import com.mycompany.usil_s5_practica_xyz.controller.EventoController;
import com.mycompany.usil_s5_practica_xyz.controller.InvitadoController;
import com.mycompany.usil_s5_practica_xyz.model.Evento;
import com.mycompany.usil_s5_practica_xyz.model.Invitado;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class FrmInvitado extends javax.swing.JFrame {

    private EventoController eventoController;
    private InvitadoController invitadoController;
    public FrmInvitado() {
        initComponents();
        eventoController = new EventoController();
        invitadoController = new InvitadoController();
        cargarEventosEnComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jrbMaculino = new javax.swing.JRadioButton();
        jrbFemenino = new javax.swing.JRadioButton();
        CheckCondiciones = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JToggleButton();
        btnResetear = new javax.swing.JToggleButton();
        btnNuevo = new javax.swing.JToggleButton();
        ComboBox2 = new javax.swing.JComboBox<>();
        ComboBox3 = new javax.swing.JComboBox<>();
        ComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese Nombre:");

        jLabel2.setText("Ingrese Numero de celular:");

        jLabel3.setText("Genero:");

        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setText("Direccion:");

        jrbMaculino.setText("Masculino");

        jrbFemenino.setText("Femenino");

        CheckCondiciones.setText("Aceptar los terminos y condiciones");
        CheckCondiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckCondicionesActionPerformed(evt);
            }
        });

        jLabel6.setText("Evento:");

        btnRegistrar.setText("Registar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnResetear.setText("Resetear");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo evento");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });

        ComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        ComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(jrbMaculino, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jrbFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtCelular)
                                .addComponent(txtDireccion)
                                .addComponent(ComboBox1, 0, 218, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CheckCondiciones)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btnRegistrar)
                                    .addGap(9, 9, 9)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnResetear, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jrbMaculino)
                    .addComponent(jrbFemenino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckCondiciones)
                    .addComponent(btnNuevo))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnResetear))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckCondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckCondicionesActionPerformed

    }//GEN-LAST:event_CheckCondicionesActionPerformed

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnResetearActionPerformed

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed

    }//GEN-LAST:event_ComboBox2ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        RegistrarInvitados();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        mostrarDialogoNuevoEvento();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void limpiarCampos() {
        txtNombre.setText("");
        txtCelular.setText("");
        jrbMaculino.setSelected(false);
        jrbFemenino.setSelected(false);
        txtDireccion.setText("");
        CheckCondiciones.setSelected(false);
        ComboBox1.setSelectedIndex(0);
        ComboBox2.setSelectedIndex(0);
        ComboBox3.setSelectedIndex(0);
        ComboBox4.setSelectedIndex(0);
    }
    
    private void cargarEventosEnComboBox() {
        try {
        List<Evento> eventos = eventoController.cargarEvento();
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        for (Evento evento : eventos) {
            modelo.addElement(evento.getNombreE());
        }
        ComboBox1.setModel(modelo);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los eventos.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }
    
    private void RegistrarInvitados() {
        String nombre = txtNombre.getText();
        int numeroCelular = Integer.parseInt(txtCelular.getText());
        String genero = jrbMaculino.isSelected() ? "Masculino" : "Femenino";
        int dia = Integer.parseInt(ComboBox2.getSelectedItem().toString());
        String mes = ComboBox3.getSelectedItem().toString();
        int anho = Integer.parseInt(ComboBox4.getSelectedItem().toString());
        String direccion = txtDireccion.getText();
        boolean condiciones = CheckCondiciones.isSelected();
        String nombreEvento = ComboBox1.getSelectedItem().toString();
        Evento eventoSeleccionado = new Evento(nombreEvento);
        
        try {
        boolean existe = invitadoController.revisarInvitado(nombre, numeroCelular);
        if (existe) {
            JOptionPane.showMessageDialog(null, "El invitado ya existe. Por favor, ingrese un nuevo invitado.");
            return;
        }
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al verificar el invitado.");
        ex.printStackTrace();
        return;
        }

        Invitado NuevoInvitado = new Invitado(nombre, numeroCelular, genero, dia, mes, anho, direccion, condiciones, eventoSeleccionado);
        try {
            invitadoController.guardarInvitado(NuevoInvitado);
            JOptionPane.showMessageDialog(null, "Invitado registrada correctamente.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar el invitado.");
            ex.printStackTrace();
        }
   }
    
    private void mostrarDialogoNuevoEvento() {
        
        String nuevoEvento = JOptionPane.showInputDialog(this, "Ingrese el nombre del nuevo evento:", "Nuevo Evento", JOptionPane.PLAIN_MESSAGE);
        if (nuevoEvento != null && !nuevoEvento.trim().isEmpty()) {
            boolean eventoExiste = false;
            try {
                eventoExiste = eventoController.revisarEvento(nuevoEvento.trim());
            } catch (IOException ex) {
                Logger.getLogger(FrmInvitado.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (eventoExiste) {
                JOptionPane.showMessageDialog(this, "El evento ya existe. Ingrese un nombre diferente.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    Evento evento = new Evento(nuevoEvento.trim());
                    eventoController.guardarEvento(evento);
                    cargarEventosEnComboBox();
                    JOptionPane.showMessageDialog(this, "Evento guardado exitosamente.");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el evento.", "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de evento válido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(FrmInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInvitado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckCondiciones;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JComboBox<String> ComboBox3;
    private javax.swing.JComboBox<String> ComboBox4;
    private javax.swing.JToggleButton btnNuevo;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JToggleButton btnResetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jrbFemenino;
    private javax.swing.JRadioButton jrbMaculino;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
