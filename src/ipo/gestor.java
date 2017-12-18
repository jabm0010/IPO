/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipo;

import java.util.LinkedList;

/**
 *
 * @author Juan Béjar
 */
public class gestor {
    
        LinkedList<Pelicula> peliculasAlmacenadas=new LinkedList<>();
    
        
     public void insertarPelicula(String _nombre, String _fechaLanzamiento, String _director){
        Pelicula p=new Pelicula(_nombre,_fechaLanzamiento,_director);
        
        peliculasAlmacenadas.addLast(p);
        
    }
     
         
    public void eliminarPelicula(Pelicula p){
        peliculasAlmacenadas.remove(p);
    }
     
}
