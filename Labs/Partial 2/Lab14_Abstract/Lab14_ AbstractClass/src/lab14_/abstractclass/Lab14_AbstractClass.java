/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_.abstractclass;

import ed.edu.espe.Lab14_AbstractClass.model.Anabel;
import ed.edu.espe.Lab14_AbstractClass.model.Animal;
import ed.edu.espe.Lab14_AbstractClass.model.Films;
import ed.edu.espe.Lab14_AbstractClass.model.Mamal;
import ed.edu.espe.Lab14_AbstractClass.model.Terror;
import ed.edu.espe.Lab14_AbstractClass.model.TheLittleStager;

/**
 *
 * @author DayannaSilva
 */
public class Lab14_AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Films film;
        film = new Anabel();
        ((Anabel) film).getNameTerror();
        film = new TheLittleStager();
        ((TheLittleStager) film ).getNameTerror();
    }
    
}
