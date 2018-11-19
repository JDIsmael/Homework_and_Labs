/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.edu.espe.Lab14_AbstractClass.model;

/**
 *
 * @author DayannaSilva
 */
public class TheLittleStager extends Terror{

    @Override
    public void allowedAges() {
               
        }

    @Override
    public void getNameTerror() {
       
        
        System.out.println("La pelicula es " + getClass().getSimpleName());
         }
    
}
