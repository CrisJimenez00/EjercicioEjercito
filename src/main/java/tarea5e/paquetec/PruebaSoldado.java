/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5e.paquetec;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author cristina
 */
public class PruebaSoldado {

    public static void main(String[] args) {

        Map<String, Ejercito> mapeo = new HashMap();
        Ejercito lista = new Ejercito();

        //Añadimos objeros a la lista
        lista.alistarSoldado(new Soldado("09117894L", "Pepe", "Martinez", "Velez", 23));
        lista.alistarSoldado(new Soldado("09117876N", "Antonio", "Fernández", "Martinez", 40));
        lista.alistarSoldado(new Soldado("01117898T", "Manuela", "Jiménez", "Bénitez", 20));
        lista.alistarSoldado(new Soldado("22117894L", "Antonia", "Vazquez", "Vera", 18));
        lista.alistarSoldado(new Soldado("09117897P", "Juan", "Sanchez", "Chacon", 30));
        mapeo.put("00001", lista);
        Ejercito lista2 = new Ejercito();

        //Añadimos objeros a la lista
        lista2.alistarSoldado(new Soldado("09117894L", "Pepa", "Martinez", "Velez", 23));
        lista2.alistarSoldado(new Soldado("09117876N", "Antonia", "Fernández", "Martinez", 40));
        lista2.alistarSoldado(new Soldado("01117898T", "Manuel", "Jiménez", "Bénitez", 20));
        lista2.alistarSoldado(new Soldado("22117894L", "Fernando", "Vazquez", "Vera", 18));
        lista2.alistarSoldado(new Soldado("09117897P", "Juana", "Sanchez", "Chacon", 30));
        mapeo.put("00002", lista2);

        System.out.println("-----------Pruebas para ver si funciona el código corectamente---------");
        boolean containsKey = mapeo.containsKey("00002");
        System.out.println("¿Mapeo contiene la lista con número 00002?: " + containsKey);
        System.out.println("¿Mapeo contiene la lista número 1?: " + mapeo.containsValue(lista) + "\n");

        System.out.println("----------LISTA 1---------");
        lista.mostrarLista();
        System.out.println("--------LISTA 2--------");
        lista2.mostrarLista();
    }

}
