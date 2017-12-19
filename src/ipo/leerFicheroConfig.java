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
    private LinkedList<LinkedList<String>> fotos=new LinkedList<>();
    private int pos=0;
    private int posFotos=0;
    int numCadenasId;
      
    
    public leerFicheroConfig() throws FileNotFoundException, IOException{


        int contadorIdiomas=0;
        File fich=new File("archivoconfiguracion.txt");
        Scanner scnr = new Scanner(fich);
        String cadena=scnr.nextLine();
        int numCadenasIdioma=Integer.parseInt(cadena);
        numCadenasId=numCadenasIdioma;
       
        
        while(!scnr.hasNextInt() && scnr.hasNextLine()){

                LinkedList<String> lis=new LinkedList<>();
                for(int i=0;i<numCadenasIdioma;i++){
                    String actual=scnr.nextLine();
                    System.out.println(pos+"-"+i+"-"+actual);
                    lis.addLast(actual);
                    
                }
                
                contenido.add(pos,lis);
                pos++;
                contadorIdiomas++;
            }
            
        leerFotos();

        
    }
    
    public void leerFotos() throws FileNotFoundException{
        int tmp=pos+1;
        int nuevaPos=0;
        int cadenasAIgnorar=numCadenasId*pos;
        cadenasAIgnorar++;
        File fich=new File("archivoconfiguracion.txt");
        Scanner scnr = new Scanner(fich);
        for(int i=0;i<cadenasAIgnorar;i++){
            String ab=scnr.nextLine();
           // System.out.println(ab);
        }
        
        String cadenaFotos=scnr.nextLine();
        int numCadenasFotos=Integer.parseInt(cadenaFotos);
        
        while(scnr.hasNextLine()){
                LinkedList<String> lis=new LinkedList<>();
                for(int i=0;i<numCadenasFotos;i++){
                    String actual=scnr.nextLine();
                    System.out.println(nuevaPos+"-"+i+"-"+actual);
                    lis.addLast(actual);
                }
                
                fotos.add(nuevaPos,lis);
                nuevaPos++;
                
        }
        

        
    }
    
    
    
    public LinkedList<LinkedList<String>> contenidos(){
        return contenido;
    }

        public LinkedList<LinkedList<String>> fotos(){
        return fotos;
    }
    
    
    
    
}
