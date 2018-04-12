/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.menu;

import java.util.ArrayList;
import restaurante.menu.logica.Componente;
import restaurante.menu.logica.Plato;
import restaurante.menu.logica.componente.Postre;
import restaurante.menu.logica.componente.bebida.Jugo;

/**
 *
 * @author Estudiantes
 */
public class Menu {

    public int i = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Plato> platitos = new ArrayList<Plato>();
        Componente j = new Jugo();
        Componente x = new Postre();
        platitos(i).agregarComponente(x);
        platitos(i).agregarComponente(j);

        for (int o = 0; o < (i + 1); o++) {
            System.out.println(platitos(o).listarComponentes());
        }
    }

}
// NOTE: please use a PRESERVE:BEGIN/PRESERVE:END comment block
//       to preserve your hand-coding across code generations.

