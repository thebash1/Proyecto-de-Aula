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
public class RegistrarPartido extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarPartido
     */
    
    int xMouse,
    
    /**
     * Creates new form CheckIn
     */

    /**
     * Creates new form RegistrarPartido
     */
    yMouse;
    
    public RegistrarPartido() {
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

        MainPanel = new javax.swing.JPanel();
        ImagePanel = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        SingIn = new javax.swing.JLabel();
        LogoUPC = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        varFecha = new javax.swing.JTextField();
        varEquipoLocal = new javax.swing.JTextField();
        varGolesEquipoLocal = new javax.swing.JTextField();
        varEquipoVisitante = new javax.swing.JTextField();
        NameSeparator = new javax.swing.JSeparator();
        LastNameSeparator = new javax.swing.JSeparator();
        CareerSeparator = new javax.swing.JSeparator();
        TeamSoccerSeparator = new javax.swing.JSeparator();
        LoginText = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        BackText = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        EmailSeparator = new javax.swing.JSeparator();
        varGolesEquipoVisitante = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagePanel.setBackground(new java.awt.Color(0, 102, 0));

        Image.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        Image.setForeground(new java.awt.Color(0, 0, 0));
        Image.setText("Diseño");

        javax.swing.GroupLayout ImagePanelLayout = new javax.swing.GroupLayout(ImagePanel);
        ImagePanel.setLayout(ImagePanelLayout);
        ImagePanelLayout.setHorizontalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagePanelLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(Image)
                .addGap(94, 94, 94))
        );
        ImagePanelLayout.setVerticalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagePanelLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(Image)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        MainPanel.add(ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 250, 500));

        SingIn.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SingIn.setForeground(new java.awt.Color(0, 0, 0));
        SingIn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SingIn.setText("REGISTRAR PARTIDO");
        MainPanel.add(SingIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, 50));

        LogoUPC.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LogoUPC.setForeground(new java.awt.Color(0, 0, 0));
        LogoUPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogoUPC.setText("LOGO UPC");
        MainPanel.add(LogoUPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 350, 50));

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPanelMouseDragged(evt);
            }
        });
        HeaderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeaderPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPanelMousePressed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        ExitButton.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(51, 51, 51));
        ExitButton.setText("X");
        ExitButton.setToolTipText("");
        ExitButton.setBorder(null);
        ExitButton.setBorderPainted(false);
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
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
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
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        varFecha.setBackground(new java.awt.Color(255, 255, 255));
        varFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varFecha.setForeground(new java.awt.Color(153, 153, 153));
        varFecha.setText("Fecha");
        varFecha.setBorder(null);
        varFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                varFechaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                varFechaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varFechaMousePressed(evt);
            }
        });
        varFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varFechaActionPerformed(evt);
            }
        });
        MainPanel.add(varFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 220, 30));

        varEquipoLocal.setBackground(new java.awt.Color(255, 255, 255));
        varEquipoLocal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varEquipoLocal.setForeground(new java.awt.Color(153, 153, 153));
        varEquipoLocal.setText("Equipo local");
        varEquipoLocal.setBorder(null);
        varEquipoLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                varEquipoLocalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                varEquipoLocalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varEquipoLocalMousePressed(evt);
            }
        });
        varEquipoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varEquipoLocalActionPerformed(evt);
            }
        });
        MainPanel.add(varEquipoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 220, 30));

        varGolesEquipoLocal.setBackground(new java.awt.Color(255, 255, 255));
        varGolesEquipoLocal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varGolesEquipoLocal.setForeground(new java.awt.Color(153, 153, 153));
        varGolesEquipoLocal.setText("Goles de equipo local");
        varGolesEquipoLocal.setBorder(null);
        varGolesEquipoLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                varGolesEquipoLocalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varGolesEquipoLocalMousePressed(evt);
            }
        });
        varGolesEquipoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varGolesEquipoLocalActionPerformed(evt);
            }
        });
        MainPanel.add(varGolesEquipoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 220, 30));

        varEquipoVisitante.setBackground(new java.awt.Color(255, 255, 255));
        varEquipoVisitante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varEquipoVisitante.setForeground(new java.awt.Color(153, 153, 153));
        varEquipoVisitante.setText("Equipo visitante");
        varEquipoVisitante.setBorder(null);
        varEquipoVisitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                varEquipoVisitanteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varEquipoVisitanteMousePressed(evt);
            }
        });
        varEquipoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varEquipoVisitanteActionPerformed(evt);
            }
        });
        MainPanel.add(varEquipoVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 220, 30));
        MainPanel.add(NameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 220, 10));
        MainPanel.add(LastNameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 220, 10));
        MainPanel.add(CareerSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 220, 10));
        MainPanel.add(TeamSoccerSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 220, 10));

        LoginText.setBackground(new java.awt.Color(255, 255, 255));
        LoginText.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LoginText.setForeground(new java.awt.Color(0, 0, 0));
        LoginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginText.setText("GUARDAR PARTIDO");
        LoginText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(LoginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 220, 35));

        LoginButton.setBackground(new java.awt.Color(0, 102, 0));
        LoginButton.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(0, 0, 0));
        LoginButton.setBorder(null);
        LoginButton.setBorderPainted(false);
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        MainPanel.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 220, 35));

        BackText.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        BackText.setForeground(new java.awt.Color(0, 0, 0));
        BackText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackText.setText("REGRESAR");
        BackText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(BackText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, 35));

        BackButton.setBackground(new java.awt.Color(0, 102, 0));
        BackButton.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        BackButton.setForeground(new java.awt.Color(0, 0, 0));
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackButtonMouseExited(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        MainPanel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, 35));
        MainPanel.add(EmailSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 220, 10));

        varGolesEquipoVisitante.setBackground(new java.awt.Color(255, 255, 255));
        varGolesEquipoVisitante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varGolesEquipoVisitante.setForeground(new java.awt.Color(153, 153, 153));
        varGolesEquipoVisitante.setText("Goles de equipo visitante");
        varGolesEquipoVisitante.setBorder(null);
        varGolesEquipoVisitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                varGolesEquipoVisitanteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varGolesEquipoVisitanteMousePressed(evt);
            }
        });
        varGolesEquipoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varGolesEquipoVisitanteActionPerformed(evt);
            }
        });
        MainPanel.add(varGolesEquipoVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 220, 30));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderPanelMousePressed

    private void HeaderPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HeaderPanelMouseClicked

    private void HeaderPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_HeaderPanelMouseDragged

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

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

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        // TODO add your handling code here:
        LoginButton.setBackground(new Color(0, 153, 0));
        
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        // TODO add your handling code here:
        LoginButton.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_LoginButtonMouseExited

    private void varFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varFechaMousePressed
        // TODO add your handling code here:
        if(varFecha.getText().equals("Fecha")) {
            varFecha.setText("");
            varFecha.setForeground(Color.black);
        }
        if(varGolesEquipoLocal.getText().equals("Equipo local")){
            varGolesEquipoLocal.setForeground(Color.gray);
        }
        if(varEquipoVisitante.getText().equals("Goles de equipo local")){
            varEquipoVisitante.setForeground(Color.gray);
        }
        if(varGolesEquipoVisitante.getText().equals("Equipo visitante")){
            varGolesEquipoVisitante.setForeground(Color.gray);
        }
        if(varGolesEquipoVisitante.getText().equals("Goles de equipo visitante")){
            varGolesEquipoVisitante.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varFechaMousePressed

    private void varEquipoLocalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varEquipoLocalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_varEquipoLocalMouseEntered

    private void varEquipoLocalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varEquipoLocalMousePressed
        // TODO add your handling code here:
        if(varFecha.getText().equals("Fecha")) {
            varFecha.setForeground(Color.gray);
        }
        if(varEquipoLocal.getText().equals("Equipo local")){
            varEquipoLocal.setText("");
            varEquipoLocal.setForeground(Color.black);
        }
        if(varGolesEquipoLocal.getText().equals("Goles de equipo local")){
            varGolesEquipoLocal.setForeground(Color.gray);
        }
        if(varEquipoVisitante.getText().equals("Equipo visitante")){
            varEquipoVisitante.setForeground(Color.gray);
        }
        if(varGolesEquipoVisitante.getText().equals("Goles de equipo visitante")){
            varGolesEquipoVisitante.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_varEquipoLocalMousePressed

    private void varGolesEquipoLocalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varGolesEquipoLocalMousePressed
        // TODO add your handling code here:
        if(varFecha.getText().equals("Fecha")) {
            varFecha.setForeground(Color.gray);
        }
        if(varEquipoLocal.getText().equals("Equipo local")){
            varEquipoLocal.setForeground(Color.gray);
        }
        
        if(varGolesEquipoLocal.getText().equals("Goles de equipo local")){
            varGolesEquipoLocal.setText("");
            varGolesEquipoLocal.setForeground(Color.black);
        }
        if(varEquipoVisitante.getText().equals("Equipo visitante")){
            varEquipoVisitante.setForeground(Color.gray);
        }
        if(varGolesEquipoVisitante.getText().equals("Goles de equipo visitante")){
            varGolesEquipoVisitante.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_varGolesEquipoLocalMousePressed

    private void varEquipoVisitanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varEquipoVisitanteMousePressed
        // TODO add your handling code here:
        
        if(varFecha.getText().equals("Fecha")) {
            varFecha.setForeground(Color.gray);
        }
        if(varEquipoLocal.getText().equals("Equipo local")){
            varEquipoLocal.setForeground(Color.gray);
        }
        if(varGolesEquipoLocal.getText().equals("Goles de equipo local")){
            varGolesEquipoLocal.setForeground(Color.gray);
        }
        if(varEquipoVisitante.getText().equals("Equipo visitante")){
            varEquipoVisitante.setText("");
            varEquipoVisitante.setForeground(Color.black);
        }
        if(varGolesEquipoVisitante.getText().equals("Goles de equipo visitante")){
            varGolesEquipoVisitante.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varEquipoVisitanteMousePressed

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(this, "¡Partido de la fecha "+varFecha.getText()+" registrado correctamente!");
        
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void varGolesEquipoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varGolesEquipoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varGolesEquipoLocalActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void varEquipoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varEquipoVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varEquipoVisitanteActionPerformed

    private void varGolesEquipoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varGolesEquipoVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varGolesEquipoVisitanteActionPerformed

    private void varGolesEquipoVisitanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varGolesEquipoVisitanteMousePressed
        // TODO add your handling code here:
        
        if(varFecha.getText().equals("Fecha")) {
            varFecha.setForeground(Color.gray);
        }
        if(varEquipoLocal.getText().equals("Equipo local")){
            varEquipoLocal.setForeground(Color.gray);
        }
        if(varGolesEquipoLocal.getText().equals("Goles de equipo local")){
            varGolesEquipoLocal.setForeground(Color.gray);
        }
        if(varEquipoVisitante.getText().equals("Equipo visitante")){
            varEquipoVisitante.setForeground(Color.gray);
        }
        if(varGolesEquipoVisitante.getText().equals("Goles de equipo visitante")){
            varGolesEquipoVisitante.setText("");
            varGolesEquipoVisitante.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_varGolesEquipoVisitanteMousePressed

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        // TODO add your handling code here:
        BackButton.setBackground(new Color(0, 153, 0));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        // TODO add your handling code here:
        BackButton.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_BackButtonMouseExited

    private void varEquipoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varEquipoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varEquipoLocalActionPerformed

    private void varFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varFechaActionPerformed

    private void varFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varFechaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_varFechaMouseClicked

    private void varFechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varFechaMouseExited
        // TODO add your handling code here:
        if(varFecha.getText().equals("")){
            varFecha.setText("Fecha");
            varFecha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varFechaMouseExited

    private void varEquipoLocalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varEquipoLocalMouseExited
        // TODO add your handling code here:
        if(varEquipoLocal.getText().equals("")){
            varEquipoLocal.setText("Equipo local");
            varEquipoLocal.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varEquipoLocalMouseExited

    private void varGolesEquipoLocalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varGolesEquipoLocalMouseExited
        // TODO add your handling code here:
        if(varGolesEquipoLocal.getText().equals("")){
            varGolesEquipoLocal.setText("Goles de equipo local");
            varGolesEquipoLocal.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varGolesEquipoLocalMouseExited

    private void varEquipoVisitanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varEquipoVisitanteMouseExited
        // TODO add your handling code here:
        if(varEquipoVisitante.getText().equals("")){
            varEquipoVisitante.setText("Equipo visitante");
            varEquipoVisitante.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varEquipoVisitanteMouseExited

    private void varGolesEquipoVisitanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varGolesEquipoVisitanteMouseExited
        // TODO add your handling code here:
        if(varGolesEquipoVisitante.getText().equals("")){
            varGolesEquipoVisitante.setText("Goles de equipo visitante");
            varGolesEquipoVisitante.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varGolesEquipoVisitanteMouseExited
 
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarPartido().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BackText;
    private javax.swing.JSeparator CareerSeparator;
    private javax.swing.JSeparator EmailSeparator;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel Image;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JSeparator LastNameSeparator;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel LogoUPC;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JSeparator NameSeparator;
    private javax.swing.JLabel SingIn;
    private javax.swing.JSeparator TeamSoccerSeparator;
    private javax.swing.JTextField varEquipoLocal;
    private javax.swing.JTextField varEquipoVisitante;
    private javax.swing.JTextField varFecha;
    private javax.swing.JTextField varGolesEquipoLocal;
    private javax.swing.JTextField varGolesEquipoVisitante;
    // End of variables declaration//GEN-END:variables
}
