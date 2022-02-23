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

    //Método el cual añade premios al map
    public void addPremio(String decimo, Integer premio) {
        this.listadoPremios.put(decimo, premio);
    }

    //Metodo el cual coge el premio
    public Integer consulta(String decimo) {
        return this.listadoPremios.get(decimo);
    }

    //Metodo el cual devuelve todo el listado de premios
    public Map<String, Integer> listadoPremios() {
        return listadoPremios;
    }

}
