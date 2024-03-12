/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.List;

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
        //lineasFichero.forEach(System.out::println);   
        
        //String[] datosVehiculo = leerDocumentoCSV.extraerDatosVehiculoPorLinea(fichero);
        //for (String s : datosVehiculo) {
     //       System.out.println(s);
       // }
        
        List<Vehiculo> listaVehiculos;
        
        listaVehiculos = leerDocumentoCSV.extraerDatosVehiculoPorLinea(lineasFichero);
        
        for (Vehiculo l : listaVehiculos) {
            System.out.println(l);
        }
    }
}
