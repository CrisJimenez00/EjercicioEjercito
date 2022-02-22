/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5e.paquetea;

/**
 *
 * @author cristina
 */
public class PruebaTraductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Traductor diccionario = new Traductor();

        //Añade 10 traducciones al diccionario
        diccionario.anadeElemento("new", "nuevo");
        diccionario.anadeElemento("have", "tener");
        diccionario.anadeElemento("butterfly", "mariposa");
        diccionario.anadeElemento("mosquito", "mosquito");
        diccionario.anadeElemento("hello", "hola");
        diccionario.anadeElemento("bye", "adiós");
        diccionario.anadeElemento("chicken", "pollo");
        diccionario.anadeElemento("right", "derecho");
        diccionario.anadeElemento("left", "izquierdo");
        diccionario.anadeElemento("cook", "cocinar");

        //traduce una palabra
        System.out.println("small: " + diccionario.traducir("small"));

        //borra una traduccion
        diccionario.eliminarElemento("give");

        //modifica una traduccion
        diccionario.modificarpalabra("bye", "chiao");

        System.out.println("IMPRIME LA LISTA SIN LA MODIFICACION CON LAS KEYS---------");
        //imprime listado de Keys
        for (String key : diccionario.listadoKeys()) {
            System.out.println(key);
        }

        //modifica una traduccion
        diccionario.modificarpalabra("bye", "chiao");
        System.out.println("LISTA MODIFICADA EL BYE IMPRIME POR VALUE--------");
        //imprime listado de Values
        for (String value : diccionario.listadoValues()) {
            System.out.println(value);
        }
    }
}
