/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5e.paquetec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Cris
 */
public class Ejercito {

    private Set<Soldado> lista;

    //Constructor
    public Ejercito() {
        this.lista = new HashSet<>();
    }

    //Saber el número de soldados
    public int numeroSoldados() {
        return lista.size();
    }

    //Método el cual alista a los soldados(los añade)
    public void alistarSoldado(Soldado soldado) {
        lista.add(soldado);
    }

    //Método el cual sabe si el ejercito no tiene soldados
    public boolean tieneSoldados() {
        return lista.isEmpty();

    }

    //Método el cual dice si hay un soldado alistado
    public boolean containsSoldado(Soldado s) {

        return lista.contains(s);
    }

    //Método el cual saca todos los soldados en forma de ArrayList
    public ArrayList<Soldado> arraySoldados() {

        return new ArrayList<>(lista);

    }

    //Método el cual desmatricula a un soldado del ejército.
    public void desmatricularSoldado(Soldado s) {
        lista.remove(s);

    }

    public void mostrarLista() {
        for (Soldado soldado : lista) {
            System.out.println(soldado);
        }

    }
//    //Método el cual imprime el map completo(otra forma de imprimirlo)
//    public void imprimir() {
//        
//        //Se importa import java.util.Map.Entry 
//        
//        for (Map.Entry<String, String> aux : lista.entrySet()) {
//            System.out.println(aux.getKey() + " - " + aux.getValue());
//        }
//        
//    }

}
