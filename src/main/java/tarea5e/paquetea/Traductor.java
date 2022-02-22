/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5e.paquetea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cristina
 */
public class Traductor {

    private Map<String, String> traductor;

    public Traductor() {
        this.traductor = new HashMap();
    }

    public void anadeElemento(String ingles, String espaniol) {
        traductor.put(ingles, espaniol);
    }

    public void eliminarElemento(String ingles) {
        traductor.remove(ingles);
    }

    public void modificarpalabra(String ingles, String espaniol) {
        traductor.replace(ingles, espaniol);
    }

    public String traducir(String ingles) {
        return traductor.get(ingles);
    }

    public ArrayList<String> listadoKeys() {
        return new ArrayList<String>(traductor.keySet());
    }

    public ArrayList<String> listadoValues() {
        return new ArrayList<String>(traductor.values());
    }

}
