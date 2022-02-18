/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5d;

import java.util.ArrayList;

/**
 *
 * @author Cris
 */
public class PruebaEjercito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos la lista de soldados
        Ejercito lista = new Ejercito();
        //ArrayList de soldados
        ArrayList<Soldado> listaSoldados = new ArrayList<>();

        //Añadimos objeros a la lista
        lista.alistarSoldado(new Soldado("09117894L", "Pepe", "Martinez", "Velez", 23));
        lista.alistarSoldado(new Soldado("09117876N", "Antonio", "Fernández", "Martinez", 40));
        lista.alistarSoldado(new Soldado("01117898T", "Manuela", "Jiménez", "Bénitez", 20));
        lista.alistarSoldado(new Soldado("22117894L", "Antonia", "Vazquez", "Vera", 18));
        lista.alistarSoldado(new Soldado("09117897P", "Juan", "Sanchez", "Chacon", 30));

        System.out.println("En el ejercito hay: " + lista.numeroSoldados() + " soldados");
        listaSoldados = lista.arraySoldados();
        for (Soldado listaSoldado : listaSoldados) {
            System.out.println(listaSoldado);
        }
        lista.containsSoldado(new Soldado("09117894L", "Pepe", "Martinez", "Velez", 23));
        lista.desmatricularSoldado(new Soldado("09117897P", "Juan", "Sanchez", "Chacon", 30));
        System.out.println("¿La lista de soldados está vacía? " + lista.noSoldados());
        boolean resultado = lista.containsSoldado(new Soldado("22117894Q", "Antonia", "Vazquez", "Vera", 18));
        System.out.println("¿Está el soldado introducido?: " + resultado);
    }

}
