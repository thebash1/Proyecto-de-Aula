package com.mycompany.proyectoaula;

import java.io.*;
import java.util.ArrayList;

public class Archivo {
    File Archivo = new File("Datos.txt");
    
    public void EscrituraDatos(String fila){
        try {
            if(!Archivo.exists()){
                Archivo.createNewFile();
            }

            FileWriter EscribirDatos = new FileWriter(Archivo, true);
            try (BufferedWriter TransferirEscritura = new BufferedWriter(EscribirDatos); PrintWriter ImprimirDatos = new PrintWriter(TransferirEscritura)) {
                ImprimirDatos.append(fila);
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

    
    public void EliminarDatos(String documento) throws IOException{
        ArrayList<Object []> DatosArchivo = this.LecturaDatos();
        this.EliminarArchivo();
        for (Object[] cliente : DatosArchivo) {
            if(!String.valueOf(cliente[0]).equals(documento)){
                String linea = String.valueOf(cliente[0])+";"+String.valueOf(cliente[1])+";"+String.valueOf(cliente[2])+";"+String.valueOf(cliente[3])+";"+String.valueOf(cliente[4])+";"+String.valueOf(cliente[5])+"\n";
                this.EscrituraDatos(linea);
            }
            
        }
    }
    
    public void EliminarArchivo(){
        try {
            if(!Archivo.exists()){
                Archivo.createNewFile();
            }
            FileWriter EscribirDatos = new FileWriter(Archivo); 
            PrintWriter ImprimirDatos;
            try (BufferedWriter TransferirEscritura = new BufferedWriter(EscribirDatos)) {
                ImprimirDatos = new PrintWriter(TransferirEscritura);
            }
            ImprimirDatos.close();
                       
        } catch (IOException e) {
        }
    }
    
    
    public void ActualizarDatos(String documento){
        
        
        
        
    }
    
    
    
}
