/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author JDIsmael
 */
public class FindString {
    
    
    public void FindStg(){
        try{
        Scanner in = new Scanner(new File("/Users/jdtysic/Desktop/prueba.txt"));
        while (in.hasNextLine()) {
          String text = in.nextLine();
            System.out.println(text);
        }
        }catch(IOException e){
            System.out.println("no funciona jajaja :(");
        }
    }
}
