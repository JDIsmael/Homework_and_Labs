/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_zoo;

import ec.edu.espe.project_zoo.model.Inventory;

/**
 * @author JDIsmael
 */
public class Project_Zoo {
    private static String name = "JDIsmael";
    public static void main(String[] args) {
        Inventory material;
        material = new Inventory("Cemento", 5);
        
        System.out.println("El material ingresado es: " + material.getName() 
                + "\nEl id es: " + material.getId());
        
        material.setId(6);
        material.setName("Arena");
        
        System.out.println("El material ingresado es: " + material.getName() 
        + "\nEl id es: " + material.getId());
        
    }

}
