/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5e.paqueteb;

import java.util.Random;

/**
 *
 * @author cristina
 */
public class PruebaLoteria {

    public static void main(String[] args) {
        Random rd = new Random();

        Loteria loteria = new Loteria();
        String aux;
        for (int i = 0; i < 1000; i++) {
            aux = "";
            for (int j = 0; j < 5; j++) {
                aux += rd.nextInt(10);
            }
            loteria.addPremio(aux, rd.nextInt(4000000));
        }
        //Comprueba un numero, va a dar null casi siempre
        System.out.println("Premio del 12345: " + loteria.consulta("12345") + "€");

        //Consultamos uno que exista
        String decimoExistente = loteria.listadoPremios().keySet().toArray()[0].toString();

        System.out.println("Premio del " + decimoExistente + ": "
                + loteria.consulta(decimoExistente) + "€");
    }
}
