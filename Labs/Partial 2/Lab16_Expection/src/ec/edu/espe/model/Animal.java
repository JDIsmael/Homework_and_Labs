 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/*
 * @author JDIsmael
 */
public class Animal {
    
    public String eyes ;
    public static int bainNumber = 7;
    
    public void feed(){
        System.out.println("El animal esta comiendo ");
    }
    
    public void assaignBain(int bn){
        bainNumber = bn;
    }

    public int getBainNumber() {
        return bainNumber;
    }
    
}
