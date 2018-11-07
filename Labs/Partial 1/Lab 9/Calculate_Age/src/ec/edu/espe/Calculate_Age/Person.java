/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Calculate_Age;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/*
 * @author JDIsmael
 */
public class Person {
    private Calendar cal;
    private Operation operation;
    private int inDay,inMonth,inYear,dayLife,monthLife;
    private int age;

    public void calculateAge(int inDay, int inMonth, int inYear){
        age = operation.sub(cal.get(Calendar.YEAR),this.inYear);
    }
    
    public void CalculateDay(){
        
    }
    
    public void calculateMonth(int inDay, int inMonth, int inYear){
        if(inMonth < 1 + cal.get(Calendar.MONTH))
            this.inYear = operation.sub(inYear,1);
        if((inDay < cal.get(Calendar.DAY_OF_MONTH)) 
                && (inMonth == cal.get(Calendar.MONTH) + 1) )
            this.inYear = operation.sub(inYear,1);
        
        monthLife = operation.sub(inYear, inYear);
        
        
        //System.out.println("Mes: "+cal.get(Calendar.MONTH) + " Dia:" + cal.get(Calendar.DAY_OF_MONTH)+ " Año: "+cal.get(Calendar.YEAR));
    }
    //Contructor
    public Person() {
        operation = new Operation();
        cal = Calendar.getInstance(); 
    }

    //Methods getter and setter
    public int getInDay() {
        return inDay;
    }

    public void setInDay(int inDay) {
        this.inDay = inDay;
    }

    public int getInMonth() {
        return inMonth;
    }

    public void setInMonth(int inMonth) {
        this.inMonth = inMonth;
    }

    public int getInYear() {
        return inYear;
    }

    public void setInYear(int inYear) {
        this.inYear = inYear;
    }

    public int getDay() {
        return dayLife;
    }

    public void setDay(int day) {
        this.dayLife = day;
    }

    public int getMonthActtuality() {
        return monthLife;
    }

    public void setMonthActtuality(int monthActtuality) {
        this.monthLife = monthActtuality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
