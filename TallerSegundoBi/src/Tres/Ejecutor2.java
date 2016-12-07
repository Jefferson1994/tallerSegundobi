/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tres;

/**
 *
 * @author SALAS
 */
public class Ejecutor2 {
    public static void main( String args[] )
   {
       Estudiante2 a= new Estudiante2();
       
       a.abrirArchivo();
       a.leer_informacion();
       a.cerrarArchivo();
   }
  
}
