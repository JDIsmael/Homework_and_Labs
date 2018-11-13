/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.array_lab11;

import ec.edu.espe.array_lab11.util.Operation;
import java.util.Calendar;

/**
 * @author JDIsmael
 */
public class Person {
    private final Calendar cal;
    private final Operation operation;
    
    private int inDay,inMonth,inYear,dayLife,monthLife;
    private String name;
    private int age;

    
    
    public void calculateAge(int inDay, int inMonth, int inYear){
        
        age = operation.sub(cal.get(Calendar.YEAR),this.inYear);
    }
    
    public void calculateDay(int inDay, int inMonth, int inYear){
        
        dayLife=operation.sub(cal.get(Calendar.DAY_OF_MONTH), inDay);
        
        if(dayLife < 0)
            dayLife=dayLife+30;               
    }
    
    public void calculateMonth(int inDay, int inMonth, int inYear){
        
        if(inMonth >= (1 + cal.get(Calendar.MONTH)) 
                && (inDay >= cal.get(Calendar.DAY_OF_MONTH))){
            this.inYear = operation.add(inYear,1);
        }
        else 
            this.inYear = inYear;
        
        if((operation.sub(cal.get(Calendar.MONTH) + 1, inMonth) <= 0) 
                && (inDay >= 30))
            inMonth++;
            
        monthLife = operation.sub(cal.get(Calendar.MONTH) + 1, inMonth);
        
        if (dayLife>cal.get(Calendar.DAY_OF_MONTH)) 
            monthLife=monthLife-1;
         
        if(monthLife <= 0)
            monthLife = operation.add(12, monthLife);
        
    }

    public int getAge() {
        calculateDay(inDay, inMonth, inYear);
        calculateMonth(inDay, inMonth, inYear);
        calculateAge(inDay, inMonth, inYear);
        
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //Contructor
    
    public Person(String name, int inDay, int inMonth, int inYear) {
        this.inDay = inDay;
        this.inMonth = inMonth;
        this.inYear = inYear;
        this.name = name;
        operation = new Operation();
        cal = Calendar.getInstance(); 
    }

}
