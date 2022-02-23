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
        
    }

}
