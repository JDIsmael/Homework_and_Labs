/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab19_library;

import ec.edu.espe.area.Figure;
import ec.edu.espe.area.Triangle;

import ec.edu.espe.operation.BasicOperation;

/**
 *
 * @author JDIsmael
 */
public class ConsumeLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figure triangle = new Triangle(1, 2);
        
        float a = triangle.computeArea();
        
        System.out.println("el area es: " + triangle.getArea());
        
        BasicOperation op = new BasicOperation(2.4f, 5.4f);
        
        System.out.println("suma: " + op.add());
        System.out.println("resta: " + op.sub());
        System.out.println("multi: " + op.mult());
        System.out.println("div: " + op.div());
        
    }
    
}
