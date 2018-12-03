/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.file_management.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;


/**
 *
 * @author JDIsmael
 */
public class Validation {
    public static boolean dayInMonth;
    public static boolean dayLeap;
    public static boolean yearLeap;
    
    public static boolean onlyDigit(String digit){
        Pattern patron = Pattern.compile("^[0-9]+$");
        if(!patron.matcher(digit).find())
            System.out.println("\n*** Solo se permite ingresar ENTEROS POSITIVOS :) ***"
                    + "\n*** Digite bien Broo :)***");
        return !patron.matcher(digit).find();
    } 
    
    public static boolean checkDay(int day, int month, int year){
        
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12)
            if(day<0 || day>31){
                System.out.println("\n*** Ha ingresado mal el dia ***");
                System.out.println("*** Por favor ingrese de nuevo el dia... ***");
                return true;
            }else{
                dayInMonth = false;
                return false;
            }
                
        if(month == 4 || month == 6 || month == 9 || month == 11)
            if(day<0 || day>30){
                System.out.println("\n*** Ha ingresado mal el dia ***");
                System.out.println("*** Por favor ingrese de nuevo el dia... ***");
                return true;
            }else{
                dayInMonth = true;
                return false;
            }
                
        if(month == 2)
            if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                yearLeap = true;
                if(day<0 || day>29){
                    System.out.println("\n*** Ha ingresado mal el dia ***");
                    System.out.println("*** Por favor ingrese de nuevo el dia... ***");
                    return true;
                }else{
                    dayLeap = false;
                    return false;
                }
                    
            }else{
                if(day<0 || day>28){
                    System.out.println("\n*** Ha ingresado mal el dia ***");
                    System.out.println("*** Por favor ingrese de nuevo el dia... ***");
                    return true;
                }else{
                    dayLeap = true;
                    return false;
                }
            }
        return true;
    }
    
    public static boolean checkYear(int year){
        Calendar cal = new GregorianCalendar();
        if (year < 1800 || year > cal.get(Calendar.YEAR)){
                System.out.println("\n*** Ha ingresado mal el año ***");
                System.out.println("*** Por favor ingrese de nuevo el año... ***");
                return true;
        }else
            return false;
    }
    
    public static boolean cheackMonth(int month){
        Calendar cal = new GregorianCalendar();
        if (month<1 || month>12){
                System.out.println("\n*** Ha ingresado mal el mes ***");
                System.out.println("*** Por favor ingrese de nuevo el mes... ***");
                return true;
        }else
            return false;
    }
    
    public static boolean checkBirth(int day, int month, int year){
        Calendar cal = new GregorianCalendar();
        if(year >= cal.get(Calendar.YEAR) 
                    && month >= cal.get(Calendar.MONTH) 
                    && day >= cal.get(Calendar.DAY_OF_MONTH)){
                System.out.println("\n*** Todavia no nace compita!! ***");
                System.out.println("*** Por favor Vuelva a ingresar todo los datos de nuevo ***");
                return true;
        }else
            return false;
    }
    
}
