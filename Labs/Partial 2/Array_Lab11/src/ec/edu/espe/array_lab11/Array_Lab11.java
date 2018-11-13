/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.array_lab11;

import ec.edu.espe.array_lab11.util.File_Management;
import java.io.File;
import java.util.ArrayList;

/*
 * @author JDIsmael
 */
public class Array_Lab11 {
    static File file; 
    static File_Management fileMan;

    public static void main(String[] args) {
        
        ArrayList<Person> person = new ArrayList<>();
        fileMan = new File_Management();
        file = new File("Register.csv");
        
        fileMan.writerFile(file, "Dario,31,05,1996");
        fileMan.writerFile(file, "Edwin,18,08,1997");
        fileMan.writerFile(file, "Carlos B.,09,03,1995");
        fileMan.writerFile(file, "Jose,21,04,1999");
        fileMan.writerFile(file, "Francisco,21,09,1998");
        fileMan.writerFile(file, "Sebastian Z.,05,03,1998");
        fileMan.writerFile(file, "Jazz,25,03,1999");
        fileMan.writerFile(file, "Valentine,04,03,1999");
        fileMan.writerFile(file, "Omar,08,10,1997");
        fileMan.writerFile(file, "Victor,04,07,1996");
        
        person = recoverData(fileMan, file);
        
        for(Person p : person)
            System.out.println("Nombre: " + p.getName() + ", " 
                    + p.getAge() + " años");
    }
    
    public static ArrayList<Person>  recoverData(File_Management fileMan, File file){
        ArrayList<String> recoverS = new ArrayList<>();
        ArrayList<Person> person = new ArrayList<>();
        recoverS = fileMan.reader(file);
        
        for ( int i = 1; i < recoverS.size() - 1; i++){
            String[] separator = recoverS.get(i).split(",");
            person.add(new Person(separator[0], Integer.parseInt(separator[1]),
                    Integer.parseInt(separator[2]),Integer.parseInt(separator[3])));
            
        }
        return person;
    }
}
