/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author JDIsmael
 */
public class FileRdr {
    public void ReaderFile(){
                String line = "";
        try{
            BufferedReader reader = new BufferedReader(
                    new FileReader("/Users/jdtysic/Desktop/prueba.txt"));
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
        
    }
}
