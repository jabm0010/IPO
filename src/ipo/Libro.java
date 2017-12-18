/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipo;

/**
 *
 * @author Juan Béjar
 */
public class Libro {
  private  String nombre;
  private  String fechaLanzamiento;
  private  String director;
  
  
     
    public Libro(String _nombre,String _fechaLanzamiento,String _director){
        nombre=_nombre;
        fechaLanzamiento=_fechaLanzamiento;
        director=_director;
                
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaLanzamiento
     */
    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * @param fechaLanzamiento the fechaLanzamiento to set
     */
    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }
  
}
