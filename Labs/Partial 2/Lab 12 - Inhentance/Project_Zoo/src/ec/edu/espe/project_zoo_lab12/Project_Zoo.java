/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project_zoo_lab12;

import ec.edu.espe.project_zoo.model.Animal;
import ec.edu.espe.project_zoo.model.Mammal;
import ec.edu.espe.project_zoo.model.Reptile;
import ec.edu.espe.util.File_Management;
import java.io.File;

/**
 * @author JDIsmael
 */
public class Project_Zoo {
    
    public static void main(String[] args) {
        
        Animal[] animal = new Animal[4];
        File_Management fileMan = new File_Management(); 
        File file = new File("Register.csv");
        String  inString = "";
        
        animal[0] = new Mammal(3, "Mammal", 1998, 2);
        animal[1] = new Mammal(15, "Mammal", 1997, 3);
        animal[2] = new Reptile(5, 20, "Reptile", 1997);
        animal[3] = new Reptile(2, 100, "Reptile", 2000);

        for(Animal a : animal)
            if(a instanceof Mammal)
                 System.out.println("El animal es un : " + a.getCientifyName() 
                         + ", tiene " + ((Mammal) a).getNumberNipple() 
                         + " tetillas\nsu id es: " + a.getId() + " su estancia es de "
                         + a.getYearsOfStay() + " años");
            else
                System.out.println("El animal es un : " + a.getCientifyName() 
                     + ", tiene " + ((Reptile) a).getEggs()
                     + " huevos\nsu id es: " + a.getId() + " su estancia es de "
                     + a.getYearsOfStay() + " años");

        for(Animal a : animal)
            if(a instanceof Mammal){
                inString= "El animal es un : " + a.getCientifyName() 
                         + ", tiene " + ((Mammal) a).getNumberNipple() 
                         + " tetillas\nsu id es: " + a.getId() + " su estancia es de "
                         + a.getYearsOfStay() + " años";
                fileMan.writerFile(file, inString);
            }else{
                inString = "El animal es un : " + a.getCientifyName() 
                     + ", tiene " + ((Reptile) a).getEggs()
                     + " huevossu id es: " + a.getId() + " su estancia es de "
                     + a.getYearsOfStay() + " años";
                fileMan.writerFile(file, inString);
                
            }
        
    }

}
