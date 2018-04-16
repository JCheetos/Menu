/*
 * Menu.java
 * Copyright (c) 2018 Valentina Tobo 20172020063, Camilo Torres 20172020067, Johan Mendez 20172020070
 */
package restaurante.menu.logica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * La clase Plato inicializa un array con los componentes que contendrá, ademas
 * de un string para asignar el nombre del plato, con su respectivo getter y
 * setter, ademas que contiene acciones para agregar mas componentes al mismo y
 * listarlos al momento de mostrarlos al usuario
 *
 * @author Valentina Uscategui Tobo - 20172020063
 * @author Camilo Torres Rodriguez - 20172020067
 * @author Johan Mendez Vega - 20172020070
 */
public class Plato {

    ArrayList<Componente> componentes = new ArrayList<Componente>();

    /**
     * Recibe un componente al ser llamado y agrega ese componente al array de
     * componentes que componen el plato
     *
     * @param componente
     */
    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }
    protected String nombrePlato;

    /**
     * Toma el array de Componentes y crea un String organizado con el nombre de
     * cada componente, retornando el valor string para ser adjuntado al metodo
     * listarPlatos de la clase Menu
     *
     * @return cadena
     */
    public String listarComponentes() {
        String cadena = "";
        for (Iterator<Componente> iterator = componentes.iterator(); iterator.hasNext();) {
            Componente next = iterator.next();
            cadena += next.getNombre() + "\n";

        }
        return cadena;
    }

    /**
     * Obtiene el nombre del plato indicado
     *
     * @return nombrePlato
     */
    public String getNombre() {
        return this.nombrePlato;
    }

    /**
     * Setea el nombre del plato indicado tomando el String que viene arrastrado
     * desde el GUI correspondiente al cuadro de texto donde ingresa el nombre
     * el usuario
     *
     * @param nombrePlato
     */
    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

}
