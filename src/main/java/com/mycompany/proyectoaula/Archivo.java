package com.mycompany.proyectoaula;

import java.io.*;
import java.util.ArrayList;

public class Archivo {
    File Archivo = new File("Datos.txt");
    
    public void EscrituraDatos(){
        try {
            if(!Archivo.exists()){
                Archivo.createNewFile();
            }

            FileWriter EscribirDatos = new FileWriter(Archivo);
            try (BufferedWriter TransferirEscritura = new BufferedWriter(EscribirDatos); PrintWriter ImprimirDatos = new PrintWriter(TransferirEscritura)) {
                ImprimirDatos.append("");
            }
        
        } catch (IOException e) {
            System.out.println("Error");
        }
    } //cierre de metodo escribir datos 
    
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
        
    } //cierre de metodo leer datos
    
}
