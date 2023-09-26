/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class peliculaServicio {
    private ArrayList <Pelicula> peliculas=new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPelicula(){
        String opc="si";
        do{
            System.out.println("Ingrese el título de la pelicula");
            String titulo=leer.next();
            titulo=titulo.toLowerCase();
            System.out.println("Ingrese el director");
            String direc=leer.next();
            direc=direc.toLowerCase();
            System.out.println("Ingrese la duración en horas");
            double dura=leer.nextDouble();
            peliculas.add(new Pelicula(titulo, direc, dura));
            System.out.println("Pelicula ingresada.");
            System.out.println("¿Desea ingresar otra pelicula si/ no?");
             opc=leer.next();
                               
        } while (opc.equalsIgnoreCase("si"));
        
    }
  
    public void mostrarPelicula(){
       for (int i = 0; i < peliculas.size(); i++) {
            System.out.println(peliculas.get(i));
        }
    }
    
    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    public void ordenarPeliculas(){
         Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        System.out.println("Peliculas ordenadas por duración de mayor a menor ");
         for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
          Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion));
        System.out.println("Peliculas ordenadas por duración de menor a mayor ");
         for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
       Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
        System.out.println("Peliculas ordenadas alfabeticamente por Titulo");
         for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
           Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
        System.out.println("Peliculas ordenadas alfabeticamente por Director");
         for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }     
    }
}
