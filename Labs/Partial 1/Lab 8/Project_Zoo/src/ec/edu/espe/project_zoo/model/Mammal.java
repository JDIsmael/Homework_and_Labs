/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project_zoo.model;

/**
 *
 * @author JDIsmael
 */
public class Mammal extends Animal {
    
    private int numberNipple;

    public Mammal(int id, String cientifyName, int arrivalYear, int numberNipple) {
        super(id, cientifyName, arrivalYear);
        this.numberNipple = numberNipple;
    }

    public int getNumberNipple() {
        return numberNipple;
    }

    public void setNumberNipple(int numberNipple) {
        this.numberNipple = numberNipple;
    }
    

}
