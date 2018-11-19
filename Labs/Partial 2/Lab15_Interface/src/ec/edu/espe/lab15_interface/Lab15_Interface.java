/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab15_interface;

import ec.edu.espe.Model.Mammal;
import ec.edu.espe.Model.Reptile;
import ec.edu.espe.interface_.Animal;

/**
 *
 * @author JDIsmael
 */
public class Lab15_Interface {


    public static void main(String[] args) {
        
        Animal[] animal = new Animal[2];
        
        animal[0] = new Mammal();
        animal[1] = new Reptile();
        
                animal[0].feed(); 
                animal[0].assignHabitat();
                animal[1].feed(); 
                animal[1].assignHabitat();
        
        
        
        
    }
    
}
