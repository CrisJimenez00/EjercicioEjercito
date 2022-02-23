/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
        ArrayList<Soldado> listaSoldados = new ArrayList<>();
        for (Soldado soldado : lista) {
            listaSoldados.add(soldado);
        }
        //OTRA FORMA DE HACERLO(Más directo y fácil)
//        ArrayList<Soldado> listaSoldados2 = new ArrayList<>(lista);

        //El objeto Iterator sirve para recorrer todos los elementos de una estructura de datos
        //Es equivalente a usar el for/each
//        Iterator<Soldado> iterador = lista.iterator();
//        while (iterador.hasNext()) {
//            Soldado soldado = iterador.next();
//        }
        return listaSoldados;
    }

    //Método el cual desmatricula a un soldado del ejército.
    public void desmatricularSoldado(Soldado s) {
        lista.remove(s);

    }
    
    public void mostrarLista(){
        for (Soldado soldado : lista) {
            System.out.println(soldado);
        }
    
    }

}
