/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import GUI.menuPrincipal;

/**
 *
 * @author Juan Béjar
 */
public class escribirFicheroDatos {

    private static final String FILENAME = "ficheroNuevo.txt";

    public escribirFicheroDatos() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

           // String content = "This is the content to write into file\n";

            for (int i = 0; i < menuPrincipal.datos.size(); i++) {

                String content = menuPrincipal.datos.get(i).get(0) + ";" + menuPrincipal.datos.get(i).get(1) + ";" + menuPrincipal.datos.get(i).get(2)+"\n";
                System.out.println(content);

                bw.write(content);
                bw.newLine();
            }

            


            // no need to close it.
            //bw.close();
            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

