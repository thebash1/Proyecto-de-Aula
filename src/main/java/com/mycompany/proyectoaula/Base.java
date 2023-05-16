package com.mycompany.proyectoaula;

import java.io.*;
import java.util.ArrayList;

public class Base {
    File Archivo = new File("Datos.txt");
    
    public void EscrituraDatos(){
        try {
        FileWriter EscribirDatos = new FileWriter(Archivo);
        BufferedWriter TransferirEscritura = new BufferedWriter(EscribirDatos);
        PrintWriter ImprimirDatos = new PrintWriter(TransferirEscritura);
        ImprimirDatos.append("");
        ImprimirDatos.close();
        TransferirEscritura.close();
        
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    
    public ArrayList<Object []> LecturaDatos() throws IOException{
        
        ArrayList<Object []> Lectura = new ArrayList();
        try {
            FileReader LeerDatos = new FileReader(Archivo);
            BufferedReader TransferirLectura = new BufferedReader(LeerDatos);
            String fila = "";
            while((fila = TransferirLectura.readLine()) != null){
                System.out.println(fila);
                Object [] ObjetoFila = fila.split(";");
                Lectura.add(ObjetoFila);
            }
                    
        } catch (FileNotFoundException e) {
        }
        
        return Lectura;
    }
    
}
