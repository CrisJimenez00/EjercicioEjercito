/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5e.paqueteb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author cristina
 */
public class Loteria {

    private Map<String, Integer> listadoPremios;

    public Loteria() {
        listadoPremios = new HashMap<>();

    }

    //Método el cual añade premios al map
    public void addPremio(String decimo, Integer premio) {
        this.listadoPremios.put(decimo, premio);
    }

    //Metodo el cual coge el premio
    public Integer consulta(String decimo) {
        return this.listadoPremios.get(decimo);
    }

    public void imprimir() {
        for (String aux : listadoPremios.keySet()) {
            System.out.println("El premio del boleto: " + aux + " es de: " + listadoPremios.get(aux) + "€");
        }
    }

    public void generar1000casos() {
        Random random = new Random();
        String aux;
        //Aquí geneamos los 1000 registros 
        for (int i = 0; i < 1000; i++) {
            aux = "";
            for (int j = 0; j < 5; j++) {
                aux += random.nextInt(10);
            }
            addPremio(aux, random.nextInt(40000));
        }

    }

}
