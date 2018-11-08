/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Calculate_Age_Lab9;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author JDIsmael
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inDay = 0, inMonth = 0, inYear = 0;
        boolean check = false;
        Calendar cal = new GregorianCalendar();
        
        while (!check){
            System.out.println("Ingrese el dia de nacimiento");
            inDay = in.nextInt();
            System.out.println("Ingrese el mes de nacimiento");
            inMonth = in.nextInt();
            System.out.println("Ingrese el año de nacimiento");
            inYear = in.nextInt();

            if (inDay<0|inDay>31){
                System.out.println("Ha ingresado mal el dia");
                check = true;
            }
            if (inMonth<0|inMonth>30){
                System.out.println("Ha ingresado mal el mes");
                check = true;
            }
            if (inYear<0|inYear>cal.get(Calendar.YEAR)){
                System.out.println("Ha ingresado mal el año");
                check = true;
            }
            if(check) check = false;
            else check = true;
        }
        
        Person person = new Person();
        person.CalculateDay(inDay, inMonth, inYear);
        person.calculateMonth(inDay, inMonth, inYear);
        person.calculateAge(inDay, inMonth, inYear);
        
        System.out.println("*** USTED TIENE ***\n"
                + person.getAge() + " años "
                        + person.getMonthLife() + " meses "
                                + person.getDayLife() +" dias");  
    }
   
}
