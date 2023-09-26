/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.ejer4;

import Service.peliculaServicio;

/**
 *
 * @author Usuario
 */
public class CollectionEjer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     peliculaServicio ps = new peliculaServicio();
     ps.crearPelicula();
     ps.mostrarPelicula();
     ps.ordenarPeliculas();
    }
    
}
