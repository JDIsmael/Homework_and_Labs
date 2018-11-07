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
        int day,month,year;
        
       System.out.println("Ingrese el dia de nacimiento");
        day = in.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        month = in.nextInt();
        System.out.println("Ingrese el year de nacimiento");
        year = in.nextInt();
        
       Person person = new Person(day, month, year);
        person.calculateAge();
        System.out.println("Usted tiene " + person.getAge() + " años");
        
        
    }
   
}
