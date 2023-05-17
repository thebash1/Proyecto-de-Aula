/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoaula;

import java.awt.Color;

/**
 *
 * @author daniel
 */
public class GestionEquipos extends javax.swing.JFrame {
    int xMouse, yMouse;
    /**
     * Creates new form GestionPartido
     */
    public GestionEquipos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GestionEquipoTittle = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        ListButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ChangeButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        GestionEquipoTittle.setBackground(new java.awt.Color(255, 255, 255));
        GestionEquipoTittle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        GestionEquipoTittle.setForeground(new java.awt.Color(0, 0, 0));
        GestionEquipoTittle.setText("Gestión de Equipo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setMinimumSize(new java.awt.Dimension(800, 500));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPanelMouseDragged(evt);
            }
        });
        HeaderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPanelMousePressed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        ExitButton.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(51, 51, 51));
        ExitButton.setText("X");
        ExitButton.setBorder(null);
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 750, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MainPanel.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        ListButton.setBackground(new java.awt.Color(0, 102, 0));
        ListButton.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        ListButton.setForeground(new java.awt.Color(0, 0, 0));
        ListButton.setText("Listar equipos registrados");
        ListButton.setBorder(null);
        ListButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListButtonMouseExited(evt);
            }
        });
        MainPanel.add(ListButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 250, 50));

        AddButton.setBackground(new java.awt.Color(0, 102, 0));
        AddButton.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(0, 0, 0));
        AddButton.setText("Formulario para agregar ");
        AddButton.setBorder(null);
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButtonMouseExited(evt);
            }
        });
        MainPanel.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 250, 50));

        ChangeButton.setBackground(new java.awt.Color(0, 102, 0));
        ChangeButton.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        ChangeButton.setForeground(new java.awt.Color(0, 0, 0));
        ChangeButton.setText("Formulario para modificar");
        ChangeButton.setBorder(null);
        ChangeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangeButtonMouseExited(evt);
            }
        });
        MainPanel.add(ChangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 250, 50));

        DeleteButton.setBackground(new java.awt.Color(0, 102, 0));
        DeleteButton.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(0, 0, 0));
        DeleteButton.setText("Formulario para eliminar");
        DeleteButton.setBorder(null);
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseExited(evt);
            }
        });
        MainPanel.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 250, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderPanelMouseDragged

    private void HeaderPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderPanelMousePressed

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        // TODO add your handling code here:
        ExitButton.setBackground(Color.red);
        ExitButton.setForeground(Color.white);
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        // TODO add your handling code here:
        ExitButton.setBackground(Color.white);
        ExitButton.setForeground(Color.black);
    }//GEN-LAST:event_ExitButtonMouseExited

    private void ListButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListButtonMouseEntered
        // TODO add your handling code here:
        ListButton.setBackground(new Color(0, 153, 0));
    }//GEN-LAST:event_ListButtonMouseEntered

    private void ListButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListButtonMouseExited
        // TODO add your handling code here:
        ListButton.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_ListButtonMouseExited

    private void AddButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseEntered
        // TODO add your handling code here:
        AddButton.setBackground(new Color(0, 153, 0));
    }//GEN-LAST:event_AddButtonMouseEntered

    private void AddButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseExited
        // TODO add your handling code here:
        AddButton.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_AddButtonMouseExited

    private void ChangeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeButtonMouseEntered
        // TODO add your handling code here:
        ChangeButton.setBackground(new Color(0, 153, 0));
    }//GEN-LAST:event_ChangeButtonMouseEntered

    private void ChangeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeButtonMouseExited
        // TODO add your handling code here:
        ChangeButton.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_ChangeButtonMouseExited

    private void DeleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseEntered
        // TODO add your handling code here:
        DeleteButton.setBackground(new Color(0, 153, 0));
    }//GEN-LAST:event_DeleteButtonMouseEntered

    private void DeleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseExited
        // TODO add your handling code here:
        DeleteButton.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_DeleteButtonMouseExited

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
            java.util.logging.Logger.getLogger(GestionEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GestionEquipos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ChangeButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel GestionEquipoTittle;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton ListButton;
    private javax.swing.JPanel MainPanel;
    // End of variables declaration//GEN-END:variables
}
