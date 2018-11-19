/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Model;

import ec.edu.espe.interface_.Animal;

/**
 *
 * @author JDIsmael
 */
public class Reptile implements Animal{

    @Override
    public void feed() {
        System.out.println("Esta comiendo insectos");
        
    }

    @Override
    public void assignHabitat() {
        System.out.println("Se le asigno pantano");
    }
    
    
}
