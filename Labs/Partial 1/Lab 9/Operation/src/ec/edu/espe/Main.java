/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe;

/**
 *
 * @author JDIsmael
 */
public class Main {
    
    public static void main(String[] args) {
        Operation operation = new Operation();
        
        
        System.out.println(operation.add(5, 6));
        System.out.println(operation.sub(-5, 6));
        System.out.println(". El resultado de la division es: " 
                + operation.div(11,2));
        System.out.println(operation.multi(-2, -2));
    }
   
}
