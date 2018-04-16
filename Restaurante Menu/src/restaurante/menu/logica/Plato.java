/*
 * Menu.java
 * Copyright (c) 2018 Valentina Tobo 20172020063, Camilo Torres 20172020067, Johan Mendez 20172020070
 */
package restaurante.menu.logica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Valentina Uscategui Tobo - 20172020063
 * @author Camilo Torres Rodriguez - 20172020067
 * @author Johan Mendez Vega - 20172020070
 */
public class Plato {

    ArrayList<Componente> componentes = new ArrayList<Componente>();

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }
    protected String nombrePlato;

    public String listarComponentes() {
        String cadena = "";
        for (Iterator<Componente> iterator = componentes.iterator(); iterator.hasNext();) {
            Componente next = iterator.next();
            cadena += next.getNombre() + "\n";

        }
        return cadena;
    }

    public String getNombre() {
        return this.nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

}
