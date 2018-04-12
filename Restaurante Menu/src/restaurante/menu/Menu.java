/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import restaurante.menu.logica.Componente;
import restaurante.menu.logica.Plato;
import restaurante.menu.logica.componente.Postre;
import restaurante.menu.logica.componente.bebida.Jugo;

/**
 *
 * @author Estudiantes
 */
public class Menu {
    protected static ArrayList<Plato> menu = new ArrayList<Plato>();
    protected static Scanner nombrePlato = new Scanner(System.in);
    public int i = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Plato plato = new Plato();
        agregarPlato(plato); 
        plato = new Plato();
        agregarPlato(plato); 
        System.out.println(listarPlatos());
    }

    public static void agregarPlato(Plato plato) {
        String nombre;
        nombre = nombrePlato.next();
        plato.setNombrePlato(nombre);
        Componente j = new Jugo();
        plato.agregarComponente(j);
        menu.add(plato);
    }

    public static String listarPlatos() {
        String cadena = "";
        for (Iterator<Plato> iterator = menu.iterator(); iterator.hasNext();) {
            Plato next = iterator.next();
            cadena += next.getNombre() +"\n"+ next.listarComponentes() +"\n";
        }
        return cadena;
    }
}
// NOTE: please use a PRESERVE:BEGIN/PRESERVE:END comment block
//       to preserve your hand-coding across code generations.

