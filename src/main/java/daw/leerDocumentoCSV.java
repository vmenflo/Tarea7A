/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor
 */
public class leerDocumentoCSV {
    //METODOS
    //Método para leer un fichero de texto plano
    //Usamos la clase files
    public static List<String> leerFichero(String nombreFichero){
        //Creamos una lista para almacenar la que nos devolvera ReadAllLines
        List<String> lista = new ArrayList<>();
        //Importante usar un try para controlar una posible excepcion
        try{
            lista = Files.readAllLines(Paths.get(nombreFichero));
        }catch(IOException ex){
            System.out.println("Error accediendo a " + nombreFichero);
        }
        lista.remove(0);
        return lista;
    }
    

    public static List<Vehiculo>  extraerDatosVehiculoPorLinea(List<String> lista){
        //En Java para escapar la barra invertida hay que añadir otra
        //Barra adicional
        List<Vehiculo> listaDevolver = new ArrayList();

        for(int i=0; i<lista.size();i++){
            
          String[] array = lista.get(i).split(",");
          
           //Por cada línea en esa lista cuenta y hace un sout
           Vehiculo temporal = new Vehiculo(array[0], array[1], Integer.parseInt(array[2]), array[3], array[4], array[5]);
           listaDevolver.add(temporal);
 
        }
        
        return listaDevolver;
    }
    

}
