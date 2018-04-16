/*
 * Menu.java
 * Copyright (c) 2018 Valentina Tobo 20172020063, Camilo Torres 20172020067, Johan Mendez 20172020070
 */
package restaurante.menu.logica;

/**
 * La clase Componente crea un valor nombre el cual será usado por cada uno de
 * los componentes del menú, junto al metodo getNombre que será usado para al
 * momento de listar los componentes y los platos, para que sea visualizado que
 * componentes estan en cada plato
 *
 * @author Valentina Uscategui Tobo - 20172020063
 * @author Camilo Torres Rodriguez - 20172020067
 * @author Johan Mendez Vega - 20172020070
 */
public class Componente {

    protected String nombre;

    /**
     * Obtiene el nombre del componente del plato indicado
     *
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

}
