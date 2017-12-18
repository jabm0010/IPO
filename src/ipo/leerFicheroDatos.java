/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Juan Béjar
 */
public class leerFicheroDatos {

    private List<List<String>> contenido = new ArrayList<>();
    //public static String datosImportar;

    public leerFicheroDatos(String datosImportar)throws FileNotFoundException, IOException {
            int contador=0;
        String datos=datosImportar;
        
        File file=new File(datos);
        Scanner archivo=new Scanner(file);
        while(archivo.hasNextLine()){
            contenido.add(new ArrayList<String>());
            String line=archivo.nextLine();
            Scanner lineScanner=new Scanner(line);
            lineScanner.useDelimiter(Pattern.compile(";"));
            while(lineScanner.hasNext()){
              
                String token=lineScanner.next();
                 System.out.println(token);
                contenido.get(contador).add(token);
                
            }
            lineScanner.close();
            contador++;
            
            
            
        }
       archivo.close();

        
        
        
    }
    public List<List<String>> devolverContenido(){
        
        return contenido;
    }
    
    
}
