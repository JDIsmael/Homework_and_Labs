/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JDIsmael
 */
public class FileWtr {
   Scanner in = new Scanner(System.in);
   String inString;
    public void WriterFile(){
        
        try{
            
            BufferedWriter buffWriter = new BufferedWriter(
                    new FileWriter("/Users/jdtysic/Desktop/prueba.txt", true));
            System.out.println("Ingrese el texto que se ingresara en el archivo");
            inString = in.nextLine();
            buffWriter.newLine();
            buffWriter.write(inString);
            buffWriter.close();
            
        }catch(IOException e){
            System.out.println("No se encontro el archivo o"
                    + " ha ocurrido un error fatal :)");
        }
    }  
}
