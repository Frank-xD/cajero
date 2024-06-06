/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Esta clase es para guardar todas las acciones que realiza el usuario mientras
 * esta en la cuenta registrando la accion y el momento que lo realizo 
 * 
 */
public class Registros {
    
    /**
     * El siguiente metodo registra todas las actividades que se realiza en las
     * cuentas
     * @param monto 
     * @param id
     * @param tipoAccion
     * @param cuenta 
     */
    public void guardarRegistroOperaciones(String monto,String id, int tipoAccion, String cuenta) {
        // Obtener la acción correspondiente al número
        String accion = obtenerAccion(tipoAccion);

        // Obtener la fecha y hora actual
        String fechaHoraActual = obtenerFechaHoraActual();

        // Construir el registro a guardar en el archivo
        String registro = fechaHoraActual + ";" + accion + ";" + monto+";"+cuenta;

        // Ruta del archivo donde se guardarán los datos
        String rutaArchivo = "C:\\Archivos gestor\\Cuentas\\"+id+"\\registroActividades.txt";

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir el registro en el archivo
            escritor.write(registro);
            escritor.newLine(); // Agregar un salto de línea
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * el metodo obtiene le tipo de accion que realizo el usuario, retorna un 
     * string con la accion correspondiente el cual sirve para guardar en el
     * registro
     * @param tipoAccion
     * @return 
     */
    private String obtenerAccion(int tipoAccion) {
        // Definir las acciones correspondientes a cada tipo
        String accion;
        switch (tipoAccion) {
            case 1:
                accion = "Deposito";
                break;
            case 2:
                accion = "Retiro";
                break;
            case 3:
                accion = "Consulta de saldo";
                break;
            case 4:
                accion = "Transferencia";
                break;
            case 5:
                accion = "Cambio de Pin";
                break;
            default:
                accion = "Acción Desconocida";
                break;
        }
        return accion;
    }
    /**
     * este metodo retorna la fecha y hora actual del equipo para guardarlo en 
     * el registro
     * @return 
     */
    public String obtenerFechaHoraActual() {
        // Obtener la fecha y hora actual en el formato deseado
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaHoraActual = new Date();
        return formatter.format(fechaHoraActual);
    }
    
}
