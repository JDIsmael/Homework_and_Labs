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
public class Reptile extends Animal{
    
    private int eggs;
    public Reptile(int eggs,int id, String cientifyName, int arrivalYear) {
        super(id, cientifyName, arrivalYear);
        this.eggs = eggs;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }
    
}
