/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculate_age_hw11;

import ec.edu.espe.file_management.util.Validation;
import java.util.Calendar;

/*
 * @author JDIsmael
 */
public class Person {
    
    private final Calendar cal;
    private final Operation operation;
    
    private int inDay,inMonth,inYear,dayLife,monthLife;
    private int age;

    public void calculateAge(int inDay, int inMonth, int inYear){
        
        age = operation.sub(cal.get(Calendar.YEAR),this.inYear);
    }
    
    public void calculateDay(int inDay, int inMonth, int inYear){
        
        dayLife=operation.sub(cal.get(Calendar.DAY_OF_MONTH), inDay);
        
        if(Validation.dayInMonth){
            dayLife=dayLife+30; 
            if(dayLife >= 30){
                dayLife = operation.sub(dayLife, 30);
                monthLife++;
            }
        }else{
            dayLife=dayLife+31; 
            if(dayLife >= 31){
                dayLife = operation.sub(dayLife, 31);
                monthLife++;
            }
                
        }
           
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
        
        if (dayLife>=cal.get(Calendar.DAY_OF_MONTH)) 
            monthLife=monthLife-1;
         
        if(monthLife < 0)
            monthLife = operation.add(12, monthLife);
        
    }
    
    //Contructor
    
    public Person() {
        operation = new Operation();
        cal = Calendar.getInstance(); 
    }

    //Methods getter and setter

    public int getInDay() { return inDay; }

    public void setInDay(int inDay) { this.inDay = inDay; }

    public int getInMonth() { return inMonth; }

    public void setInMonth(int inMonth) { this.inMonth = inMonth; }

    public int getInYear() { return inYear; }

    public void setInYear(int inYear) { this.inYear = inYear; }

    public int getDayLife() { return dayLife; }

    public void setDayLife(int dayLife) { this.dayLife = dayLife; }

    public int getMonthLife() { return monthLife; }

    public void setMonthLife(int monthLife) { this.monthLife = monthLife; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}
