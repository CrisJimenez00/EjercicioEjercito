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

        System.out.println("-----------Lista sin modificar------------");
        diccionario.imprimir();
        
        System.out.println("------------------");
        //traduce una palabra
        System.out.println("La palabra have significado");
        System.out.println("have: " + diccionario.traducir("have"));

        //borra una traduccion
        System.out.println("Elimina la palabra right");
        diccionario.eliminarElemento("right");

        //modifica una traduccion
        diccionario.modificarPalabra("bye", "chiao");

        System.out.println("IMPRIME LA LISTA SIN LA MODIFICACION CON LAS KEYS---------");
        //imprime listado de Keys
        for (String key : diccionario.listaIngles()) {
            System.out.println(key);
        }

        //modifica una traduccion
        diccionario.modificarPalabra("bye", "chiao");
        System.out.println("LISTA MODIFICADA EL BYE IMPRIME POR VALUE--------");
        //imprime listado de Values
        for (String value : diccionario.listaEspaniol()) {
            System.out.println(value);
        }
        System.out.println("-----------Lista final-------------");
        diccionario.imprimir();
    }
}
