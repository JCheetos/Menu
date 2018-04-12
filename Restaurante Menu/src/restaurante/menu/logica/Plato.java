/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.menu.logica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Estudiantes
 */
// NOTE: please use a PRESERVE:BEGIN/PRESERVE:END comment block
//       to preserve your hand-coding across code generations.

public class Plato {
    ArrayList<Componente> componentes = new ArrayList<Componente>();
	public void agregarComponente(Componente componente) {
		componentes.add(componente);
	}
        protected String nombrePlato;
        
        
        public String listarComponentes(){
            String cadena = "";
            for (Iterator<Componente> iterator = componentes.iterator(); iterator.hasNext();) {
                Componente next = iterator.next();
                cadena += next.getNombre() + "\n";
                
            }
            return cadena;
        }
        public String getNombre(){
            return this.nombrePlato;
        }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }
        
}
