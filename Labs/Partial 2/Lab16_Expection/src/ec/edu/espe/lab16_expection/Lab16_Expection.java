/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab16_expection;

import ec.edu.espe.model.Animal;
import ec.edu.espe.operation.Operation;
import java.io.IOException;

/**
 *
 * @author JDIsmael
 */
public class Lab16_Expection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Operation operation = new Operation();
        
        System.out.println("la division de 3/5 es: " + operation.divide(3, 5));
        System.out.println("la division es: " + operation.divide(386,847));
        System.out.println("la division es: " + operation.divide(5.8f , 1.3f));
        System.out.println("la division de 8/0 es: " + operation.divide(8, 0));
        System.out.println(operation.add(345, 23));
        System.out.println(operation.add(1.2f, 2));
        System.out.println(operation.add(1.2f, 2.9f));
        */


        Animal animal = new Animal();
        //Animal animal = null;
        animal.eyes = "Brown";
        
        if(animal != null) System.out.println("The animal exites");
        else System.out.println("el animal no existe");
        
        try{
            
            System.out.println("la primera linea corre");
            System.out.println(animal.eyes);
            System.out.println("tl Prorgrama esta corriendo");
        
        }catch (NullPointerException e){
            System.out.println("Error" + e);
            System.out.println(e.getMessage());
            
            if(e.toString().equals("java.lang.NullPointerException"))
                    System.out.println("Hay un error");
            
            System.out.println(e.getStackTrace());
            e.printStackTrace();
            
            if(animal == null)
                animal = new Animal(); 
            animal.eyes = "Brown";
        }finally{
            System.out.println("FInally Exception");
        }
        
        //System.out.println("Ahora si funciona el animal\ntiene ojos " + animal);
        
        System.out.println("this is bain number " + animal.getBainNumber());
        
        Animal animal2 = new Animal();
        
        System.out.println(animal2.getBainNumber());
        
        animal.assaignBain(18);
     
        System.out.println(animal2.bainNumber);
    }
    
}
