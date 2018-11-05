/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe;

import java.io.File;

/**
 *
 * @author JDIsmael
 */
public class File_Management {

    public static void main(String[] args) {
        File file = new File("prueba.txt");
        
        FileRdr reader = new FileRdr();
        FileWtr writer = new FileWtr();
        
        writer.WriterFile(file);
        reader.ReaderFile(file);
        /*FindString find=new FindString();
        find.FindStg();*/
    }
    
}
