package com.mycompany.proyectoaula;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameConImagen {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("JFrame con imagen");

        // Crear un JLabel para la imagen
        JLabel label = new JLabel();
        
        // Crear un objeto ImageIcon con la ruta de la imagen
        ImageIcon icono = new ImageIcon("/home/daniel/Imágenes/hamburguesa de pescado.jpg");

        // Establecer el icono en el JLabel
        label.setIcon(icono);

        // Agregar el JLabel al JFrame
        frame.getContentPane().add(label);

        // Ajustar el tamaño del JFrame al tamaño de la imagen
        frame.pack();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular las coordenadas para centrar el JFrame
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;

        // Establecer la posición del JFrame
        frame.setLocation(x, y);

        // Establecer la operación de cierre del JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Mostrar el JFrame
        frame.setVisible(true);

    }
}
