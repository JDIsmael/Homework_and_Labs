/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.edu.espe.Lab14_AbstractClass.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author DayannaSilva
 */
public abstract class Animal {
    protected int id;
    protected String cientifyName;
    protected int arrivalYear;
    //protected int yearsOfStay;
    public abstract void giveBrith ();

}

