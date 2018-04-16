/*
 * Menu.java
 * Copyright (c) 2018 Valentina Tobo 20172020063, Camilo Torres 20172020067, Johan Mendez 20172020070
 */
package restaurante.menu.logica.componente.bebida;

import restaurante.menu.logica.componente.Bebida;

/**
 * Esta clase hereda las caracteristicas y metodos de la clase Bebida
 *
 * @author Valentina Uscategui Tobo - 20172020063
 * @author Camilo Torres Rodriguez - 20172020067
 * @author Johan Mendez Vega - 20172020070
 */
public class BebidaCaliente extends Bebida {

    /**
     * Este metodo constructor le asigna el nombre al componente al cual se
     * define como BebidaCaliente
     *
     */
    public BebidaCaliente() {
        this.nombre = "Bebida Caliente";
    }

}
