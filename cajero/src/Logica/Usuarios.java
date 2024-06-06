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
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;

/**
 * Esta clase es para gestionar todos los usuarios ya sea para verificar si
 * el usuario existe o tiene mas de una sub cuenta
 * tambien crea nuevos usuarios
 */

public class Usuarios {
    /**
     * Este metodo verifica si los datos que ingrese como parametro coinciden 
     * con los datos guardados del cajero 
     * @param pin
     * @param ci
     * @return 
     * el metodo usa IOException e para la entrada o salida de datos
     */
    public boolean verificarUsuario(String pin, String ci) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Archivos gestor\\Usuarios\\usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                
                // Verificar si el PIN coincide con el almacenado en el archivo
                if (partes.length >= 5 && partes[3].equals(pin) && partes[2].equals(ci)) {
                    
                    return true; // Coincide
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // No coincide o hubo un error
    }
    
     /**
      * Este metodo sirve para guardar el id del usuario que esta usando el 
      * cajero en cualquier momento recive como parametro el id del usuario
      * @param texto 
      * el metodo usa IOException e para la entrada o salida de datos
      */
     public void guardarEnArchivo(String texto) {
        String ruta = "C:\\Archivos gestor\\Usuarios\\informacion.txt"; 
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
    
      /**
       * Este metodo sirve para escribir en cualquier archivo de texto 
       * dependiendo de la ruta que se le asigne como parametro
       * @param texto
       * @param ruta 
       * el metodo usa IOException e para la entrada o salida de datos
       */     
      public void guardarEnArchivo(String texto,String ruta) {
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
     
     /**
      * Este metodo retorna el id del usuario guardado en un arvhivo txt el cual
      * obtiene verificando el pin y ci del usuario
      * @param pin
      * @param ci
      * @return 
      * el metodo usa IOException e para la entrada o salida de datos
      */
     public String DevolverId(String pin, String ci) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Archivos gestor\\Usuarios\\usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                
                // Verificar si el PIN coincide con el almacenado en el archivo
                if (partes.length >= 5 && partes[3].equals(pin) && partes[2].equals(ci)) {
                    
                    return partes[4]; // Coincide
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""; // No coincide o hubo un error
    } 
    
    /**
     * esto retorna el id de la cuenta que esta usando en todo momento 
     * el programa
     * @return 
     * el metodo usa IOException e para la entrada o salida de datos
     */
    public String IdCuenta() {
        String contenidoFila = "";
        String direccion = "C:\\Archivos gestor\\Usuarios\\informacion.txt";
        try {
            FileReader fr = new FileReader(direccion);
            BufferedReader br = new BufferedReader(fr);
            contenidoFila = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFila;
    } 
    
    /**
     * Este metodo sirve para cambiar el PIN del usuario 
     * @param idUsuario
     * @param pinActual
     * @param nuevoPin
     * @param confirmacionPin
     * @return
     * el metodo usa IOException e para la entrada o salida de datos
     */
    public boolean cambiarPin(String idUsuario, String pinActual, String nuevoPin, String confirmacionPin) {
        // Nombre del archivo
        String nombreArchivo = "C:\\Archivos gestor\\Usuarios\\usuarios.txt";

        // Crear un objeto File que represente el archivo
        File archivo = new File(nombreArchivo);
        // Crear una variable para guardar las líneas del archivo
        String linea;
        // Crear una variable para guardar las líneas actualizadas
        String lineaNueva = "";
        // Variable para verificar si se encontró al usuario
        boolean usuarioEncontrado = false;
        
        try {
            // Crear un lector de archivos
            FileReader lectorArchivo = new FileReader(archivo);
            BufferedReader lectorBuffer = new BufferedReader(lectorArchivo);
            
            // Recorrer el archivo línea por línea
            while ((linea = lectorBuffer.readLine()) != null) {
                // Dividir la línea en partes usando ":" como delimitador
                String[] partes = linea.split(":");
                // Si el idUsuario coincide, verificar el pinActual
                if (partes[4].equals(idUsuario)) {
                    if (partes[3].equals(pinActual)) {
                        usuarioEncontrado = true;
                        // Actualizar el pin solo si el pinActual coincide y la confirmación del nuevo pin es correcta
                        if (nuevoPin.equals(confirmacionPin)) {
                            partes[3] = nuevoPin; // El nuevo pin se coloca en la posición 3
                            System.out.println("PIN cambiado exitosamente para el usuario con ID: " + idUsuario);
                        } else {
                            System.out.println("La confirmación del nuevo PIN no coincide. No se realizó ningún cambio.");
                        }
                    } else {
                        System.out.println("El PIN actual proporcionado no coincide con el registrado para el usuario con ID: " + idUsuario);
                    }
                }
                // Reconstruir la línea
                lineaNueva += partes[0] + ":" + partes[1] + ":" + partes[2] + ":" + partes[3] + ":" + partes[4] + "\n";
            }
            
            // Cerrar el lector de archivos
            lectorBuffer.close();
            
            // Si no se encontró al usuario, mostrar un mensaje
            if (!usuarioEncontrado) {
                System.out.println("No se encontró ningún usuario con ID: " + idUsuario);
            } else {
                // Crear un escritor de archivos
                FileWriter escritorArchivo = new FileWriter(archivo);
                BufferedWriter escritorBuffer = new BufferedWriter(escritorArchivo);
                
                // Escribir las líneas actualizadas en el archivo
                escritorBuffer.write(lineaNueva);
                
                // Cerrar el escritor de archivos
                escritorBuffer.close();
            }
            
        } catch (IOException e) {
            // Manejar la excepción en caso de que ocurra un error de lectura/escritura
            System.err.println("Error al leer/escribir en el archivo: " + e.getMessage());
        }
      return usuarioEncontrado;  
    }
    
    /**
     * este metodo llena el combobox que es usado para identificar en que sub cuenta
     * nos encontramos en todo momento y cuantas sub cuentas tiene el usuario
     * @param comboBox
     * @param rutaBase 
     */
    public  void llenarComboBoxConArchivos(JComboBox<String> comboBox, String rutaBase) {
        // Crear un filtro para solo incluir archivos .txt
        FilenameFilter filtroTxt = new FilenameFilter() {
            public boolean accept(File dir, String nombre) {
                return nombre.toLowerCase().endsWith(".txt");
            }
        };

        // Definir las carpetas "Cuenta Ahorro" y "Cuenta Corriente"
        String[] carpetas = {"Cuenta Ahorro", "Cuenta Corriente"};

        // Recorrer cada carpeta
        for (String carpeta : carpetas) {
            File directorio = new File(rutaBase, carpeta);

            // Verificar que el directorio existe y es un directorio
            if (directorio.exists() && directorio.isDirectory()) {
                // Obtener la lista de archivos .txt en el directorio
                String[] archivosTxt = directorio.list(filtroTxt);

                // Añadir cada archivo al combo box sin la extensión .txt
                if (archivosTxt != null) {
                    for (String archivo : archivosTxt) {
                        // Remover la extensión .txt
                        String nombreSinExtension = archivo.substring(0, archivo.lastIndexOf("."));
                        comboBox.addItem(carpeta + ":  " + nombreSinExtension);
                        /* if(nombreSinExtension.equals("cuenta1"))comboBox.addItem(carpeta + ":  Dolares" );;
                         if(nombreSinExtension.equals("cuenta1"))comboBox.addItem(carpeta + ":  Bolivianos");;
                         if(nombreSinExtension.equals("cuenta1"))comboBox.addItem(carpeta + ":  Euros");;
                         if(nombreSinExtension.equals("cuenta1"))comboBox.addItem(carpeta + ":  Yuanes");;*/
                    }
                }
            } else {
            }
        }
    }
    
    /**
     * esste metodo guarda la ruta que se usa en todo momento para 
     * identificar en que sub cuenta se encuentra el usuario
     * @param texto 
     * el metodo usa IOException e para la entrada o salida de datos
     */
     public void guardarRutaEnArchivo(String texto) {
        String ruta = "C:\\Archivos gestor\\Usuarios\\ruta.txt"; 
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
     /**
      * este metodo retorna la ruta guardada previamente de las sub cuentas 
      * esto es usado casi para cualquier operción del programa
      * @return 
      * el metodo usa IOException e para la entrada o salida de datos
      */
     public String rutaCuenta() {
        String contenidoFila = "";
        String direccion = "C:\\Archivos gestor\\Usuarios\\ruta.txt";
        try {
            FileReader fr = new FileReader(direccion);
            BufferedReader br = new BufferedReader(fr);
            contenidoFila = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFila;
    } 
     /**
      * este metod retorna una ruta dependiendo el imput que se ingrese como
      * parametro
      * @param input
      * @return 
      */ 
     public String obtenerRuta(String input) {
        String[] partes = input.split(":  ");
        String resultado = partes[0] + "\\" + partes[1] + ".txt";
        return resultado;
    }
    
    /**
     * este metodo obtiene el id de la cuenta a la cual se transferira esto para 
     * verificar si la cuenta existe o es valida
     * @param ruta
     * @return 
     */
    public String IdTransferenci(String ruta) {
        Pattern pattern = Pattern.compile("\\\\Cuentas\\\\(\\d+)\\\\");
        Matcher matcher = pattern.matcher(ruta);

        if (matcher.find()) {
            String numero = matcher.group(1);
            System.out.println("Número encontrado: " + numero);
            return numero;
        } 
        return "";
    }
     
    /**
     * El método Control verifica si un archivo contiene una línea en la que
     * un campo específico coincide con un valor buscado
     * @param rutaArchivo
     * @param ciBuscado
     * @param campo
     * @return 
     * el metodo usa IOException e para la entrada o salida de datos
     */
    public boolean Control(String rutaArchivo, String ciBuscado,int campo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(":");
                if (campos.length == 5 && campos[campo].equals(ciBuscado)) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    
    /**
     * Este metodo sirve para obtener el ultimo id de la lista de usuarios 
     * para crear un nuevo usuario y asignarele un id que no este repetido o que 
     * no este separado por dos numeros
     * @return
     * @throws IOException 
     * el metodo usa IOException e para la entrada o salida de datos
     */
    private int obtenerUltimoId() throws IOException {
        int ultimoId = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Archivos gestor\\Usuarios\\usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(":");
                if (campos.length == 5) {
                    int idActual = Integer.parseInt(campos[4]);
                    if (idActual > ultimoId) {
                        ultimoId = idActual;
                    }
                }
            }
        }
        return ultimoId;
    }
    
    /**
     * Este metodo añade un nuevo usuario a la lista de usuarios ya existente
     * @param nombre
     * @param apellido
     * @param ci
     * @param contrasena 
     * el metodo usa IOException e para la entrada o salida de datos
     */
    public void anadirUsuario(String nombre, String apellido, String ci, String contrasena) {
        try {
            int ultimoId = obtenerUltimoId()+1;
            String nuevoUsuario = nombre + ":" + apellido + ":" + ci + ":" + contrasena + ":" + ultimoId;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Archivos gestor\\Usuarios\\usuarios.txt", true))) {
                bw.write(nuevoUsuario);
                bw.newLine();
            }
        } catch (IOException e) {
        }
    }
    
    /**
     * Este metodo sirve para obtener el ultimo id de la lista de usuarios 
     * para crear un nuevo usuario y asignarele un id que no este repetido o que 
     * no este separado por dos numeros
     * @return 
     * el metodo usa IOException e para la entrada o salida de datos
     */
    public int ObtenerUltimoId() {
        String rutaArchivo = "C:\\Archivos gestor\\Usuarios\\usuarios.txt";
        int ultimoId = -1;
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(":");
                if (campos.length == 5) {
                    try {
                        int idActual = Integer.parseInt(campos[4]);
                        if (idActual > ultimoId) {
                            ultimoId = idActual;
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
        } catch (IOException e) {
        }
        return ultimoId;
    }
        
    
        /**
         * este metodo retorna el id del usuario el cual lo busca por el numero
         * de ci del usuario
         * @param ci
         * @return 
         */
        public String DevolverId(String ci) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Archivos gestor\\Usuarios\\usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                
                // Verificar si el PIN coincide con el almacenado en el archivo
                if (partes.length >= 5 && partes[2].equals(ci)) {
                    
                    return partes[4]; // Coincide
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""; // No coincide o hubo un error
    }
     
    
}
