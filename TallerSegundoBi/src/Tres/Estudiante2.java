/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Estudiante2 {
     private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("estudiantes.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

 
    // lee registro del archivo
    public void leer_informacion() {
        String A;
        Archivo2 ar2= new Archivo2();
        ar2.abrir_archivo();
        boolean verdadero = false;
       
       
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

               
                
               
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split("\\|")));
                String nombre= linea_partes.get(0);
                String apellido= linea_partes.get(1);
                int anos= Integer.parseInt(linea_partes.get(2));
                int edad= 2016-anos;
                ar2.agregar_informacion(nombre, apellido, anos);
                //System.out.println(linea_partes);    

            }
            ar2.cerrar_archivo();
            // fin de while
         }catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
            catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
            // fin de catch
        } // fin del metodo leerRegistros
        // cierra el archivo y termina la aplicación

    

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo

  


} // fin de la clase LeerArchivoTexto

    

    

