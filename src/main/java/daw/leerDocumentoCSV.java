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
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author victor
 */
public class leerDocumentoCSV {

    //METODOS
    //Método para leer un fichero de texto plano
    //Usamos la clase files
    public static List<String> leerFichero(String nombreFichero) {
        //Creamos una lista para almacenar la que nos devolvera ReadAllLines
        List<String> lista = new ArrayList<>();
        //Importante usar un try para controlar una posible excepcion
        try {
            lista = Files.readAllLines(Paths.get(nombreFichero));
        } catch (IOException ex) {
            System.out.println("Error accediendo a " + nombreFichero);
        }
        lista.remove(0);//Eliminamos la primera porque no tiene el formato
        return lista;
    }

    public static List<Vehiculo> extraerDatosVehiculoPorLinea(List<String> lista) {
        //Creouna lista que devolvere
        List<Vehiculo> listaDevolver = new ArrayList();

        for (int i = 0; i < lista.size(); i++) {
            //Separamos por , para obtener los datos de cada vehiculo
            String[] array = lista.get(i).split(",");//Corta por cada coma
            //Creamos un objeto de vehiculo y metemos los datos en cada campo
            Vehiculo temporal = new Vehiculo(array[0], array[1], Integer.parseInt(array[2]), array[3], array[4], array[5]);
            listaDevolver.add(temporal);

        }

        return listaDevolver;
    }

    //Método para contar las palabras por linea del fichero
    public static Map<Integer, Integer> contarPalabrasEnLinea(List<String> lista) {
        Map<Integer, Integer> listaMap = new TreeMap();
        int posicionMap = 0;
        for (String linea : lista) {
            String[] array = linea.split(",");//Separar por , y espacio
            listaMap.put(posicionMap, array.length);//El tamaño son als palabras
            posicionMap++;
        }
        return listaMap;

    }

}
