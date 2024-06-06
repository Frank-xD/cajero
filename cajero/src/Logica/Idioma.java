/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Esta clase "Idioma" es la que utilizamos para modificar el idioma del 
 * programa el cual tiene metodos para leer un archivo de texto que identifica 
 * y que idioma se selecciono y los lee y escribe en las interfaces graficas
 */
public class Idioma {
  
/**
 * Este metodo resive como parametro la el número de fila y la direccion 
 * del archuvivo .txt el cual retorna toda la fila como string 
 * el metodo usa IOException e para la entrada o salida de datos
 */    
public String leerFila(int numeroFila,String direccion) {
        String contenidoFila = "";
        try {
            FileReader fr = new FileReader(direccion);
            BufferedReader br = new BufferedReader(fr);
            for (int i = 1; i <= numeroFila; i++) {
                contenidoFila = br.readLine();
                if (contenidoFila == null) return "";
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFila;
    }     
  
/**
 * Este metodo recive como parametro el nombre del idioma que se selecciono 
 * el cual lo guardada en un archivo.txt que designa el estado del idioma,
 * si esta en uno o otro
 * el metodo usa IOException e para la entrada o salida de datos
 */ 
    public void guardarEnArchivo(String texto) {
        String ruta = "C:\\Archivos gestor\\Idiomas\\Estado.txt"; 
        try {
            FileWriter fw = new FileWriter(ruta, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
