package com.mycompany.proyectoaula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class InterfazGestionEquipos extends JFrame implements ActionListener {
    private DefaultTableModel model;
    private JTable table;
    private JTextArea textArea;
    private JTextField idField, nombreEquipoField, nombreEntrenadorField;
    private JButton agregarButton, modificarButton, eliminarButton;

    public InterfazGestionEquipos() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Gestión de Equipos");
        setSize(600, 400);
        setLayout(null);
        
        // Etiquetas
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 10, 80, 25);
        add(idLabel);
        
        JLabel nombreEquipoLabel = new JLabel("Nombre del equipo:");
        nombreEquipoLabel.setBounds(10, 40, 150, 25);
        add(nombreEquipoLabel);
        
        JLabel nombreEntrenadorLabel = new JLabel("Nombre del entrenador:");
        nombreEntrenadorLabel.setBounds(10, 70, 150, 25);
        add(nombreEntrenadorLabel);
        
        // Campos de texto
        idField = new JTextField();
        idField.setBounds(170, 10, 80, 25);
        add(idField);
        
        nombreEquipoField = new JTextField();
        nombreEquipoField.setBounds(170, 40, 200, 25);
        add(nombreEquipoField);
        
        nombreEntrenadorField = new JTextField();
        nombreEntrenadorField.setBounds(170, 70, 200, 25);
        add(nombreEntrenadorField);
        
        // Botones
        agregarButton = new JButton("Agregar");
        agregarButton.setBounds(10, 100, 100, 25);
        agregarButton.addActionListener(this);
        add(agregarButton);
        
        modificarButton = new JButton("Modificar");
        modificarButton.setBounds(120, 100, 100, 25);
        modificarButton.addActionListener(this);
        add(modificarButton);
        
        eliminarButton = new JButton("Eliminar");
        eliminarButton.setBounds(230, 100, 100, 25);
        eliminarButton.addActionListener(this);
        add(eliminarButton);
        
        // Tabla de equipos
        model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("ID");
        model.addColumn("Nombre del equipo");
        model.addColumn("Nombre del entrenador");
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 140, 560, 200);
        add(scrollPane);
        
        // Área de texto
        textArea = new JTextArea();
        textArea.setBounds(10, 350, 560, 200);
        add(textArea);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregarButton) {
            agregarEquipo();
        } else if (e.getSource() == modificarButton) {
            modificarEquipo();
        } else if (e.getSource() == eliminarButton) {
            eliminarEquipo();
        }
    }

    private void agregarEquipo() {
        String id = idField.getText();
        String nombreEquipo = nombreEquipoField.getText();
        String nombreEntrenador = nombreEntrenadorField.getText();
        
        // Agregar los datos a la tabla
        model.addRow(new Object[] { id, nombreEquipo, nombreEntrenador });
        
        // Limpiar los campos de texto
        idField.setText("");
        nombreEquipoField.setText("");
        nombreEntrenadorField.setText("");
        
        // Mostrar un mensaje de éxito en el área de texto
        textArea.setText("Equipo agregado exitosamente.");
    }

    private void modificarEquipo() {
        int selectedRow = table.getSelectedRow();
        
        if (selectedRow != -1) {
            String id = idField.getText();
            String nombreEquipo = nombreEquipoField.getText();
            String nombreEntrenador = nombreEntrenadorField.getText();
            
            // Modificar los datos en la tabla
            model.setValueAt(id, selectedRow, 0);
            model.setValueAt(nombreEquipo, selectedRow, 1);
            model.setValueAt(nombreEntrenador, selectedRow, 2);
            
            // Limpiar los campos de texto
            idField.setText("");
            nombreEquipoField.setText("");
            nombreEntrenadorField.setText("");
            
            // Mostrar un mensaje de éxito en el área de texto
            textArea.setText("Equipo modificado exitosamente.");
        } else {
            // Mostrar un mensaje de error en el área de texto
            textArea.setText("Seleccione un equipo para modificar.");
        }
    }

    private void eliminarEquipo() {
        int selectedRow = table.getSelectedRow();
        
        if (selectedRow != -1) {
            // Eliminar la fila seleccionada de la tabla
            model.removeRow(selectedRow);
            
            // Limpiar los campos de texto
            idField.setText("");
            nombreEquipoField.setText("");
            nombreEntrenadorField.setText("");
            
            // Mostrar un mensaje de éxito en el área de texto
            textArea.setText("Equipo eliminado exitosamente.");
        } else {
            // Mostrar un mensaje de error en el área de texto
            textArea.setText("Seleccione un equipo para eliminar.");
        }
    }

    public static void main(String[] args) {
        InterfazGestionEquipos interfazGestionEquipos = new InterfazGestionEquipos();

    }
}