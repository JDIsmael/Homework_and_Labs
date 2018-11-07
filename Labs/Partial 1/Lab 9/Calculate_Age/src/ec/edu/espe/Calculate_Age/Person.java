/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Calculate_Age;

import java.util.Calendar;
import java.util.Date;

/*
Deber
hacer una prueba de unidad 

*/

/*
 * @author JDIsmael
 */
public class Person {
    private Date date;
    private int inDay,inMonth,inYear,day,monthActtuality;
    private int age;

    public void calculateAge(){
        date = new Date();
        Operation operation = new Operation();
        age=operation.sub((date.getYear() + 1900),inYear);
    }
    
    public void CalculateDay(){
        
    }

    public Person(int day, int month, int year) {
        this.inDay = day;
        this.inMonth = month;
        this.inYear = year;
    }

    public int getDay() {
        return inDay;
    }

    public void setDay(int day) {
        this.inDay = day;
    }

    public int getMonth() {
        return inMonth;
    }

    public void setMonth(int month) {
        this.inMonth = month;
    }

    public int getYear() {
        return inYear;
    }

    public void setYear(int year) {
        this.inYear = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
    
}
