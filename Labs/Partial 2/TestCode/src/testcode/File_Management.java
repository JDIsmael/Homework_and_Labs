/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author JDIsmael
 */
public class File_Management {
    
    
    public static void writerFile(File file, String inString){
        try{
            
            BufferedWriter buffWriter = new BufferedWriter(
                    new FileWriter(file, true));
            buffWriter.write(inString);
            buffWriter.close();
            
        }catch(IOException e){
            System.out.println("No se encontro el archivo o"
                    + " ha ocurrido un error fatal :)");
        }
    }  
    
    public void readerFile(File file){
                String line = "";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
    }
    public ArrayList<String> reader(File file){
        ArrayList<String> line = new ArrayList<String>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int i =0;
            line.add("");
            while(line.get(i) != null){
                line.add(reader.readLine());
                i++;
            }
            reader.close();
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
        return line;
    }
    
    
    public void modifyFile(File file, String name, String inString, boolean check){
        
    }
    
    public void deleteField(File file, String name){
        modifyFile(file, name, null, false);
    }
    
    public void searchInFile(File file, String name){
        
    }
    
    
    
    
    public static void modificar(File fWork,String idString,String InputString)
    {
        File fOverride= new File("Override");
        overrideFIle(fWork, fOverride);
        BufferedReader br;
        try
        {
                br = new BufferedReader(new FileReader(fOverride));
                String linea;
                while((linea=br.readLine()) != null)
                {
                    if(linea.contains(idString))
                    {
                        writerFile(fWork,InputString+"\n");

                    }
                    else
                    {
                        writerFile(fWork,linea+"\n");
                    }
                }
                br.close();
                
            

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        fOverride.delete();
    }
  
    public static void overrideFIle(File fWork,File fOverride){ 
        BufferedReader br;
        try
        {
            if(fWork.exists())
            {
                br = new BufferedReader(new FileReader(fWork));
                String linea;
                while((linea=br.readLine()) != null)
                {
                        writerFile(fOverride,linea+"\n");
                }
                br.close();
            }
            else
            {
                System.out.println("Fichero no Existe");
            }
            fWork.delete();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
