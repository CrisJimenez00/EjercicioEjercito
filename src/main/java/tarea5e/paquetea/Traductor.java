/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5e.paquetea;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author cristina
 */
public class Traductor {

    private Map<String, String> traductor;

    //Constructor inicializado con HashMap
    public Traductor() {
        this.traductor = new TreeMap();
    }

    //Método el cual añade elementos
    public void anadeElemento(String ingles, String espaniol) {
        traductor.put(ingles, espaniol);
    }

    //Método el cual elimina elementos del map
    public void eliminarElemento(String ingles) {
        traductor.remove(ingles);
    }

    //Método el cual hace que modifiques (también vale put pero en este caso viene mejor replace)
    public void modificarPalabra(String ingles, String espaniol) {
        traductor.replace(ingles, espaniol);
    }

    //Método el cual devuelve la palabra en español
    public String traducir(String ingles) {
        return traductor.get(ingles);
    }

    //Método el cual devuelve todas las palabras en inglés
    public ArrayList<String> listaIngles() {
        ArrayList<String> palabrasIngles = new ArrayList<>(traductor.keySet());
        return palabrasIngles;
//        traductor.values();//Te recuelve un collection genérico
    }

    //Método el cual deuvleve todas las palabras en español
    public ArrayList<String> listaEspaniol() {
        ArrayList<String> palabrasEspaniol = new ArrayList<>(traductor.values());
        return palabrasEspaniol;
    }

    //Método el cual imprime el map completo(otra forma de imprimirlo)
    public void imprimir() {
        
        //Se importa import java.util.Map.Entry 
        
        for (Map.Entry<String, String> aux : traductor.entrySet()) {
            System.out.println(aux.getKey() + " - " + aux.getValue());
        }
        
    }

}
