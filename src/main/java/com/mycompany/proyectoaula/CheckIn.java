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
public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    
    int xMouse,
    
    /**
     * Creates new form CheckIn
     */
    yMouse;
    
    public CheckIn() {
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

        fondoPrincipal = new javax.swing.JPanel();
        ImagePanel = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        SingIn = new javax.swing.JLabel();
        LogoUPC = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        varDocumento = new javax.swing.JTextField();
        varName = new javax.swing.JTextField();
        varLastName = new javax.swing.JTextField();
        varPhone = new javax.swing.JTextField();
        NameSeparator = new javax.swing.JSeparator();
        LastNameSeparator = new javax.swing.JSeparator();
        CareerSeparator = new javax.swing.JSeparator();
        TeamSoccerSeparator = new javax.swing.JSeparator();
        LoginText = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        BackText = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        EmailSeparator = new javax.swing.JSeparator();
        varEmail = new javax.swing.JTextField();
        AdressSeparator = new javax.swing.JSeparator();
        varAdress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        fondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        fondoPrincipal.add(ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 250, 500));

        SingIn.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SingIn.setForeground(new java.awt.Color(0, 0, 0));
        SingIn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SingIn.setText("REGISTRARSE");
        fondoPrincipal.add(SingIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, 50));

        LogoUPC.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LogoUPC.setForeground(new java.awt.Color(0, 0, 0));
        LogoUPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogoUPC.setText("LOGO UPC");
        fondoPrincipal.add(LogoUPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, 50));

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
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 760, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPrincipal.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        varDocumento.setBackground(new java.awt.Color(255, 255, 255));
        varDocumento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varDocumento.setForeground(new java.awt.Color(153, 153, 153));
        varDocumento.setText("Documento");
        varDocumento.setBorder(null);
        varDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varDocumentoMousePressed(evt);
            }
        });
        varDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varDocumentoActionPerformed(evt);
            }
        });
        fondoPrincipal.add(varDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 220, 30));

        varName.setBackground(new java.awt.Color(255, 255, 255));
        varName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varName.setForeground(new java.awt.Color(153, 153, 153));
        varName.setText("Nombre");
        varName.setBorder(null);
        varName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                varNameMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varNameMousePressed(evt);
            }
        });
        varName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNameActionPerformed(evt);
            }
        });
        fondoPrincipal.add(varName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 220, 30));

        varLastName.setBackground(new java.awt.Color(255, 255, 255));
        varLastName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varLastName.setForeground(new java.awt.Color(153, 153, 153));
        varLastName.setText("Apellido");
        varLastName.setBorder(null);
        varLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varLastNameMousePressed(evt);
            }
        });
        varLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varLastNameActionPerformed(evt);
            }
        });
        fondoPrincipal.add(varLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 220, 30));

        varPhone.setBackground(new java.awt.Color(255, 255, 255));
        varPhone.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varPhone.setForeground(new java.awt.Color(153, 153, 153));
        varPhone.setText("Telefono");
        varPhone.setBorder(null);
        varPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varPhoneMousePressed(evt);
            }
        });
        varPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varPhoneActionPerformed(evt);
            }
        });
        fondoPrincipal.add(varPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 220, 30));
        fondoPrincipal.add(NameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 220, 10));
        fondoPrincipal.add(LastNameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 220, 10));
        fondoPrincipal.add(CareerSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 220, 10));
        fondoPrincipal.add(TeamSoccerSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 220, 10));

        LoginText.setBackground(new java.awt.Color(255, 255, 255));
        LoginText.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LoginText.setForeground(new java.awt.Color(0, 0, 0));
        LoginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginText.setText("ENTRAR");
        LoginText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoPrincipal.add(LoginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 120, 35));

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
        fondoPrincipal.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 120, 35));

        BackText.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        BackText.setForeground(new java.awt.Color(0, 0, 0));
        BackText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackText.setText("REGRESAR");
        BackText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoPrincipal.add(BackText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, 35));

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
        fondoPrincipal.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, 35));
        fondoPrincipal.add(EmailSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 220, 10));

        varEmail.setBackground(new java.awt.Color(255, 255, 255));
        varEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varEmail.setForeground(new java.awt.Color(153, 153, 153));
        varEmail.setText("Correo");
        varEmail.setBorder(null);
        varEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                varEmailMousePressed(evt);
            }
        });
        varEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varEmailActionPerformed(evt);
            }
        });
        fondoPrincipal.add(varEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 220, 30));

        AdressSeparator.setToolTipText("");
        fondoPrincipal.add(AdressSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 220, 10));

        varAdress.setBackground(new java.awt.Color(255, 255, 255));
        varAdress.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        varAdress.setForeground(new java.awt.Color(153, 153, 153));
        varAdress.setText("Dirección");
        varAdress.setBorder(null);
        varAdress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        varAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varAdressActionPerformed(evt);
            }
        });
        fondoPrincipal.add(varAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 220, 30));

        getContentPane().add(fondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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
        LoginButton.setForeground(new Color(0, 102, 0));
    }//GEN-LAST:event_LoginButtonMouseExited

    private void varDocumentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varDocumentoMousePressed
        // TODO add your handling code here:
        if(varDocumento.getText().equals("Nombre")) {
            varDocumento.setText("");
            varDocumento.setForeground(Color.black);
        }
        if(varName.getText().equals("Apellido")){
            varName.setText("Apellido");
            varName.setForeground(Color.gray);
        }
        if(varLastName.getText().equals("Carrera")){
            varLastName.setText("Carrera");
            varLastName.setForeground(Color.gray);
        }
        if(varPhone.getText().equals("Equipo")){
            varPhone.setText("Equipo");
            varPhone.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varDocumentoMousePressed

    private void varNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_varNameMouseEntered

    private void varNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varNameMousePressed
        // TODO add your handling code here:
        if(varName.getText().equals("Apellido")){
            varName.setText("");
            varName.setForeground(Color.black);
        }
        if(varDocumento.getText().equals("Nombre")) {
            varDocumento.setText("Nombre");
            varDocumento.setForeground(Color.gray);
        }
        if(varLastName.getText().equals("Carrera")){
            varLastName.setText("Carrera");
            varLastName.setForeground(Color.gray);
        }
        if(varPhone.getText().equals("Equipo")){
            varPhone.setText("Equipo");
            varPhone.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varNameMousePressed

    private void varLastNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varLastNameMousePressed
        // TODO add your handling code here:
        if(varLastName.getText().equals("Carrera")){
            varLastName.setText("");
            varLastName.setForeground(Color.black);
        }
        if(varDocumento.getText().equals("Nombre")) {
            varDocumento.setText("Nombre");
            varDocumento.setForeground(Color.gray);
        }
        if(varName.getText().equals("Apellido")){
            varName.setText("Apellido");
            varName.setForeground(Color.gray);
        }
        if(varPhone.getText().equals("Equipo")){
            varPhone.setText("Equipo");
            varPhone.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varLastNameMousePressed

    private void varPhoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varPhoneMousePressed
        // TODO add your handling code here:
        if(varPhone.getText().equals("Equipo")){
            varPhone.setText("");
            varPhone.setForeground(Color.black);
        }
        if(varDocumento.getText().equals("Nombre")) {
            varDocumento.setText("Nombre");
            varDocumento.setForeground(Color.gray);
        }
        if(varName.getText().equals("Apellido")){
            varName.setText("Apellido");
            varName.setForeground(Color.gray);
        }
        if(varLastName.getText().equals("Carrera")){
            varLastName.setText("Carrera");
            varLastName.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varPhoneMousePressed

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(this, "¡Usuario "+varDocumento.getText()+" registrado correctamente!");
        
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void varLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varLastNameActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void varPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varPhoneActionPerformed

    private void varEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varEmailActionPerformed

    private void varEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varEmailMousePressed
        // TODO add your handling code here:
        if(varEmail.getText().equals("Email")) {
            varEmail.setText("");
            varEmail.setForeground(Color.black);
        }
        if(varDocumento.getText().equals("Nombre")) {
            varDocumento.setText("Nombre");
            varDocumento.setForeground(Color.gray);
        }
        if(varName.getText().equals("Apellido")){
            varName.setText("Apellido");
            varName.setForeground(Color.gray);
        }
        if(varLastName.getText().equals("Carrera")){
            varLastName.setText("Carrera");
            varLastName.setForeground(Color.gray);
        }
        if(varPhone.getText().equals("Equipo")){
            varPhone.setText("Equipo");
            varPhone.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_varEmailMousePressed

    private void varAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varAdressActionPerformed
        // TODO add your handling code here:
        if(varAdress.getText().equals("Dirección")) {
            varAdress.setText("");
            varAdress.setForeground(Color.black);
        }
        if(varDocumento.getText().equals("Nombre")) {
            varDocumento.setText("Nombre");
            varDocumento.setForeground(Color.gray);
        }
        if(varName.getText().equals("Apellido")){
            varName.setText("Apellido");
            varName.setForeground(Color.gray);
        }
        if(varLastName.getText().equals("Carrera")){
            varLastName.setText("Carrera");
            varLastName.setForeground(Color.gray);
        }
        if(varPhone.getText().equals("Equipo")){
            varPhone.setText("Equipo");
            varPhone.setForeground(Color.gray);
        }
        if(varEmail.getText().equals("Correo")) {
            varEmail.setText("Correo");
            varEmail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_varAdressActionPerformed

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        // TODO add your handling code here:
        BackButton.setBackground(new Color(0, 153, 0));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        // TODO add your handling code here:
        BackButton.setForeground(new Color(0, 102, 0));
    }//GEN-LAST:event_BackButtonMouseExited

    private void varNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNameActionPerformed

    private void varDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varDocumentoActionPerformed
 
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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CheckIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator AdressSeparator;
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
    private javax.swing.JSeparator NameSeparator;
    private javax.swing.JLabel SingIn;
    private javax.swing.JSeparator TeamSoccerSeparator;
    private javax.swing.JPanel fondoPrincipal;
    private javax.swing.JTextField varAdress;
    private javax.swing.JTextField varDocumento;
    private javax.swing.JTextField varEmail;
    private javax.swing.JTextField varLastName;
    private javax.swing.JTextField varName;
    private javax.swing.JTextField varPhone;
    // End of variables declaration//GEN-END:variables
}
