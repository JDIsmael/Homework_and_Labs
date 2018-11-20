/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab16_expection;

import ec.edu.espe.model.Animal;
import ec.edu.espe.operation.Operation;

/**
 *
 * @author JDIsmael
 */
public class Lab16_Expection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operation operation = new Operation();
        
        System.out.println("la division de 3/5 es: " + operation.divide(3, 5));
        System.out.println("la division es: " + operation.divide(386,847));
        System.out.println("la division es: " + operation.divide(5.8f , 1.3f));
        System.out.println("la division de 8/0 es: " + operation.divide(8, 0));
        System.out.println(operation.add(345, 23));
        System.out.println(operation.add(1.2f, 2));
        System.out.println(operation.add(1.2f, 2.9f));


        Animal animal = null;
        
        System.out.println(animal.eyes);
    }
    
}
