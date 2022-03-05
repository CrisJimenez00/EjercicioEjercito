/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5e.paqueteb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author cristina
 */
public class PruebaLoteria {

    public static void main(String[] args) {

        Loteria loteria = new Loteria();
        loteria.generar1000casos();
        //Comprueba un numero, va a dar null casi siempre
        System.out.println("Premio del 12345: " + loteria.consulta("12345") + "€");

        loteria.imprimir();

    }
}
