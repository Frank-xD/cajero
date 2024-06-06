/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Esta clase "Operaciones" es para guardar todos los metodos que el programas
 * usara para realizar operaciones como transacciones, depositos, etc.
 * 
 */
public class Operaciones {
/**
 * Este metodo recive como parametro la direccion donde esta la cuenta que se 
 * quiere saber el saldo de dicha cuenta
 * el metodo usa IOException e para la entrada o salida de datos
 */     
    public String SaldoActual(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                return partes[0];
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""; // No coincide o hubo un error
    }

/**
 * Este metodo recive como parametro la direccion donde esta la cuenta que se 
 * quiere el tipo de moneda de la cuenta ya sea (USD, BO, EUR, CNY) el cual es 
 * util para las transferencias 
 * el metodo usa IOException e para la entrada o salida de datos
 */      
    public String MonedaCuenta(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                return partes[1];
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""; // No coincide o hubo un error
    }
   
   /**
 * Este metodo recive como parametro la direccion donde esta la cuenta y el 
 * nuevo valor que se reemplazara esto es util para deposito retiro y otros
 * el metodo usa IOException e para la entrada o salida de datos
 */  
   public void modificarSaldo(String rutaArchivo, String nuevoNumero) {
        // Crear un objeto File con la ruta del archivo
        File archivo = new File(rutaArchivo);

        // Crear un objeto StringBuilder para construir el nuevo contenido del archivo
        StringBuilder nuevoContenido = new StringBuilder();
        try {
            // Crear un FileReader para leer el archivo
            FileReader fr = new FileReader(archivo);
            // Crear un BufferedReader para leer líneas de texto
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                // Separar la línea en dos partes utilizando ":" como delimitador
                String[] partes = linea.split(":");
                if (partes.length >= 2) {
                    // Reemplazar el primer componente con el nuevo número
                    partes[0] = nuevoNumero;
                    // Reconstruir la línea con los componentes modificados
                    nuevoContenido.append(String.join(":", partes)).append("\n");
                } else {
                    // Si la línea no tiene el formato esperado, agregarla sin modificaciones
                    nuevoContenido.append(linea).append("\n");
                }
            }
            // Cerrar el BufferedReader
            br.close();
            // Sobrescribir el archivo con el nuevo contenido
            FileWriter fw = new FileWriter(archivo);
            fw.write(nuevoContenido.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
   /**
 * Este metodo recive como parametro el numero de la cuenta para saber si el 
 * directorio exite en la ruta donde estan guardados los datos del usuario
 * 
 */ 
   public  File buscarArchivoPorNumeroCuenta(String numeroCuenta) {
        // Ruta del directorio principal de cuentas
        String rutaCuentas = "C:\\Archivos gestor\\Cuentas";

        // Objeto File que representa el directorio principal de cuentas
        File directorioCuentas = new File(rutaCuentas);

        // Verificar si el directorio de cuentas existe
        if (!directorioCuentas.exists() || !directorioCuentas.isDirectory()) {
            System.err.println("El directorio de cuentas no existe.");
            return null;
        }

        // Obtener una lista de los subdirectorios (carpetas de usuarios) dentro del directorio de cuentas
        File[] usuarios = directorioCuentas.listFiles(File::isDirectory);

        // Recorrer cada carpeta de usuario
        for (File usuario : usuarios) {
            // Buscar dentro de las subcarpetas "Cuenta Ahorro" y "Cuenta Corriente"
            for (String subcarpeta : new String[]{"Cuenta Ahorro", "Cuenta Corriente"}) {
                for (int i = 1; i <= 4; i++) {
                    File cuenta = new File(usuario, subcarpeta + "\\cuenta" + i + ".txt");
                    // Verificar si el archivo de cuenta coincide con el número de cuenta
                    if (buscarNumeroCuentaEnArchivo(cuenta, numeroCuenta)) {
                        return cuenta;
                    }
                }
            }
        }

        // Si no se encontró ninguna coincidencia, retornar null
        return null;
    }
/**
 * Este metodo recive como parametro un archivo y el numero de cuanta de un usuario 
 * el cual verifica retorna un booleano true si el numero de cuenta coincide con 
 * el numero del archivo
 * el metodo usa IOException e para la entrada o salida de datos
 */ 
    private boolean buscarNumeroCuentaEnArchivo(File archivo, String numeroCuenta) {
        if (archivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    // Dividir la línea en partes usando ":" como delimitador
                    String[] partes = linea.split(":");
                    // Verificar si el número de cuenta coincide
                    if (partes.length >= 3 && partes[2].equals(numeroCuenta)) {
                        return true;
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        }
        return false;
    }
 
    /**
    * Este metodo recive como parametro el tipo de cambio de alguna cuenta 
    * el cual retirna el cambio de cada moneda a bolivianos
    * se usa throw se utiliza para lanzar una excepción explícitamente 
    * desde un método o un bloque de código. 
    */ 
    private double getTipoMoneda(String moneda) {
        switch (moneda) {
            case "USD":
                return 1.0;   // Dólar estadounidense
            case "EUR":
                return 0.91;  // Euro
            case "BS":
                return 6.96;  // Boliviano
            case "CNY":
                return 6.92;  // Yuan chino
            default:
                throw new IllegalArgumentException("Código de moneda no válido.");
        }
    }
/**
 *  El método convertirMoneda realiza la conversión de un monto de una moneda de 
 *  origen a una moneda de destino utilizando sus respectivos tipos de cambio.
 * @param monedaOrigen
 * @param monedaDestino
 * @param monto
 * @return 
 */
    public double convertirMoneda(String monedaOrigen, String monedaDestino, double monto) {
        // Obtener el tipo de cambio para la moneda de origen
        double tasaOrigen = getTipoMoneda(monedaOrigen);

        // Obtener el tipo de cambio para la moneda de destino
        double tasaDestino = getTipoMoneda(monedaDestino);

        // Convertir el monto a dólares (USD)
        double montoEnUsd = monto / tasaOrigen;

        // Convertir de dólares (USD) a la moneda de destino
        double montoConvertido = montoEnUsd * tasaDestino;

        return montoConvertido;
    }
}
