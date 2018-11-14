/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project_zoo.model;

import ec.edu.espe.util.Operation;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author jdtysic
 */
public class Animal {
    protected int id;
    protected String cientifyName;
    protected int yearsOfStay;
    
    
    public void computingStay(int arrivalYear){
        
        Operation operation = new Operation();
        Calendar cal = new GregorianCalendar();
        yearsOfStay = operation.sub(cal.get(Calendar.YEAR), arrivalYear);
        
    }
    
    public Animal(int id, String cientifyName, int arrivalYear) {
        this.id = id;
        this.cientifyName = cientifyName;
        
        computingStay(arrivalYear);
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCientifyName() {
        return cientifyName;
    }

    public void setCientifyName(String cientifyName) {
        this.cientifyName = cientifyName;
    }

    public int getYearsOfStay() {
        return yearsOfStay;
    }

    public void setYearsOfStay(int yearsOfStay) {
        this.yearsOfStay = yearsOfStay;
    }
    
}
