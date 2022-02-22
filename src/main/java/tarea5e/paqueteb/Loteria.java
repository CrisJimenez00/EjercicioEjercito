/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5e.paqueteb;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cristina
 */
public class Loteria {

    private Map<String, Integer> listadoPremios;

    public Loteria() {
        listadoPremios = new HashMap<>();

    }

    public void addPremio(String decimo, Integer premio) {
        this.listadoPremios.put(decimo, premio);
    }

    public Integer consulta(String decimo) {
        return this.listadoPremios.get(decimo);
    }

    public Map<String, Integer> listadoPremios() {
        return listadoPremios;
    }

}
