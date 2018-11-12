/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculate_age_lab10;

import ec.edu.espe.file_management.util.File_Management;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author JDIsmael
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar cal = new GregorianCalendar();
        File_Management fileMan = new File_Management();
        File file = new File("Register_Age.csv");
        
        String name, inString;
        int inDay = 0, inMonth = 0, inYear = 0;
        boolean check = false;
        System.out.println("*********************");
        System.out.println("* Ingresa el nombre * ");
        System.out.println("*********************");
        name = in.nextLine();
        
        while (!check){
            System.out.print("* Ingrese el dia de nacimiento: ");
            inDay = in.nextInt();
            System.out.print("* Ingrese el mes de nacimiento: ");
            inMonth = in.nextInt();
            System.out.print("* Ingrese el año de nacimiento: ");
            inYear = in.nextInt();

            if (inDay<0 || inDay>31){
                System.out.println("Ha ingresado mal el dia");
                check = true;
            }
            if (inMonth<0 || inMonth>30){
                System.out.println("Ha ingresado mal el mes");
                check = true;
            }
            if (inYear < 0|| inYear > cal.get(Calendar.YEAR)){
                System.out.println("Ha ingresado mal el año");
                check = true;
            }
            if(inYear >= cal.get(Calendar.YEAR) 
                    && inMonth >= cal.get(Calendar.MONTH) 
                    && inDay >= cal.get(Calendar.DAY_OF_MONTH)){
                System.out.println("Todavia no nace compita!!");
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
        
        inString = "("+ name + "), " + person.getAge() + ", " 
                + person.getMonthLife() + ", " + person.getDayLife();
        
        fileMan.WriterFile(file, inString);
        System.out.println("*** Registro ***");
        fileMan.ReaderFile(file);
        
        
    }
   
}
