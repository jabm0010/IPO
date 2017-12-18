/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipo;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Juan Béjar
 */
public class leerFicheroConfig {
    private LinkedList<LinkedList<String>> contenido=new LinkedList<>();
    private int pos=0;
      
    
    public leerFicheroConfig() throws FileNotFoundException, IOException{


        int contadorIdiomas=0;
        FileReader fichero=new FileReader("archivoconfiguracion.txt");
        String cadena;

        BufferedReader lectura = new BufferedReader(fichero);
        
        cadena=lectura.readLine();
        int numCadenasIdioma;
        numCadenasIdioma=Integer.parseInt(cadena);
        System.out.println(numCadenasIdioma);
        
        while((cadena=lectura.readLine())!=null){
            

            LinkedList<String> lis=new LinkedList<>();
        
            lis.addLast(cadena);
            for(int i=1;i<numCadenasIdioma;i++){
                String actual=lectura.readLine();
                System.out.println(pos+"-"+i+"-"+actual);
                lis.addLast(actual);
            }
            
            
            contenido.add(pos, lis);
            pos++;  
            contadorIdiomas++;
            
        }
            
            
            
        
        
        
        
        
        
        lectura.close();
        
        
    }
    
    
    public LinkedList<LinkedList<String>> contenidos(){
        return contenido;
    }

    
    
    
}
