/*
 * Menu.java
 * Copyright (c) 2018 Valentina Tobo 20172020063, Camilo Torres 20172020067, Johan Mendez 20172020070
 */
package restaurante.menu;

import java.util.ArrayList;
import java.util.Iterator;
import restaurante.menu.logica.Componente;
import restaurante.menu.logica.Plato;
import restaurante.menu.logica.componente.entrada.*;
import restaurante.menu.logica.componente.adiciones.*;
import restaurante.menu.logica.componente.bebida.*;
import restaurante.menu.logica.componente.platofuerte.*;
import restaurante.menu.logica.componente.postre.*;

/**
 * La clase Menu contiene las acciones que seran usadas en el GUI, conectandose
 * con la clase Plato y cada uno de los componentes, la base logica del programa
 * se encuentra aqui
 *
 * @author Valentina Uscategui Tobo - 20172020063
 * @author Camilo Torres Rodriguez - 20172020067
 * @author Johan Mendez Vega - 20172020070
 */
public class Menu {

    /**
     * Le asigna el nombre al plato en base a lo escrito en el cuadro de texto
     * del GUI y se agrega el plato al array del Menú
     *
     * @param menu
     * @param plato
     * @param nombrePlato
     */
    public static void agregarPlato(ArrayList<Plato> menu, Plato plato, String nombrePlato) {
        plato.setNombrePlato(nombrePlato);
        menu.add(plato);
    }

    /**
     * El componente se reasigna como uno especifico segun la opcion elegida en
     * el GUI y se agrega al plato actual
     *
     * @param plato
     * @param componente
     * @param nombreComp
     */
    public static void agregarComponente(Plato plato, Componente componente, String nombreComp) {
        switch (nombreComp) {
            case "Ensalada":
                componente = new Ensalada();
                break;
            case "Extra":
                componente = new Extra();
                break;
            case "BebidaCaliente":
                componente = new BebidaCaliente();
                break;
            case "Gaseosa":
                componente = new Gaseosa();
                break;
            case "Jugo":
                componente = new Jugo();
                break;
            case "Licor":
                componente = new Licor();
                break;
            case "EnsaladaAd":
                componente = new EnsaladaAd();
                break;
            case "Quesos":
                componente = new Quesos();
                break;
            case "Sopa":
                componente = new Sopa();
                break;
            case "PlatoFuerte1":
                componente = new PlatoFuerte1();
                break;
            case "PlatoFuerte2":
                componente = new PlatoFuerte2();
                break;
            case "Galletas":
                componente = new Galletas();
                break;
            case "Gelatinas":
                componente = new Gelatinas();
                break;
            case "Helado":
                componente = new Helado();
                break;
            case "Tortas":
                componente = new Tortas();
                break;
        }
        plato.agregarComponente(componente);
    }

    /**
     * Toma el array del Menú y crea un String organizado con el nombre de cada
     * plato y sus respectivos componentes, retornando el valor string para ser
     * mostrado en el GUI
     *
     * @param menu
     * @return cadena
     */
    public static String listarPlatos(ArrayList<Plato> menu) {
        String cadena = "";
        for (Iterator<Plato> iterator = menu.iterator(); iterator.hasNext();) {
            Plato next = iterator.next();
            cadena += next.getNombre() + "\n \n" + next.listarComponentes() + "\n";
        }
        return cadena;
    }
}
