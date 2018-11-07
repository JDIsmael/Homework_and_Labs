/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Calculate_Age;

import java.util.Scanner;

/**
 *
 * @author JDIsmael
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inDay,inMonth,inYear;
        
       /*System.out.println("Ingrese el dia de nacimiento");
        inDay = in.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        inMonth = in.nextInt();
        System.out.println("Ingrese el year de nacimiento");
        inYear = in.nextInt();*/
        
        Person person = new Person();
        //person.calculateAge(inDay, inMonth, inYear);
        //System.out.println("Usted tiene " + person.getAge() + " años");
        person.calculateMonth(05, 10, 1996);
        
        
    }
   
}
