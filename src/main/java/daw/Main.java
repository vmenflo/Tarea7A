/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author victor
 */
public class Main {
    public static void main(String[] args) {
        
        //Obtebenos el fichero
        List<String> lineasFichero;
        String fichero = "vehiculos.csv";
             
        lineasFichero = leerDocumentoCSV.leerFichero(fichero);
        System.out.println("******* Mostrar fichero ********");
        lineasFichero.forEach(System.out::println);   
        
        List<Vehiculo> listaVehiculos;
        
        listaVehiculos = leerDocumentoCSV.extraerDatosVehiculoPorLinea(lineasFichero);
        
        for (Vehiculo l : listaVehiculos) {
            System.out.println(l);
        }
        
        //Probar método Map
        Map<Integer,Integer> lista = leerDocumentoCSV.contarPalabrasEnLinea(lineasFichero);
        System.out.println(lista);
        
    }
}