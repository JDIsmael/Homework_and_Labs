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
public abstract class Terror extends Films {

    @Override
    public void releaseDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public abstract void allowedAges();
    public abstract void getNameTerror();
    
}
