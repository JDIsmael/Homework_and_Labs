/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculate_age_hw11;

import ec.edu.espe.file_management.util.File_Management;
import ec.edu.espe.file_management.util.Validation;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author JDIsmael
 */
public class Main {
    
    static Scanner in = new Scanner(System.in);
    
    static Calendar cal = new GregorianCalendar();
    static File_Management fileMan = new File_Management();
    static File file = new File("Register_Age.csv");
    static Person person = new Person();
    
    static String name, inString;
    static int inDay = 0, inMonth = 0, inYear = 0;


    
    public static void main(String[] args) {
        byte op;
        do{
        System.out.println("*** Registro de Fechas ***");
        
        System.out.println("**************************");
        System.out.println("*   Escoga una opcion   *");
        System.out.println("**************************");
        System.out.println("    1. Ingresar Datos");
        System.out.println("    2. Leer Datos");
        System.out.println("    3. Modificar Datos");
        System.out.println("    4. Borrar Datos");
        System.out.println("    5. Buscar Datos");
        System.out.println("    6. Salir");
        do{
            System.out.println("* Solo las opciones de arriba *");
            op = in.nextByte();
        }while(op <= 0 || op > 6);
        
        switch(op){
            case 1:
                writer();
                break;
            case 2:
                read(true);
                break;
            case 3:
                modify();
                break;
            case 4:
                delete();
                break;
            case 5:
                search();
                break;
            case 6:
                System.out.println("\n\n\n\n\n\n\nCerrando sistema...\n* Hasta Pronto *");
                break;
        }
        }while(op != 6);
        
        
    }
    
    /*//Method for test
    
    public static int dayPerson(int inDay, int month, int inYear){
        Person age = new Person();
        age.calculateDay(inDay, month, inYear);
        age.calculateMonth(inDay, month, inYear);
        age.calculateAge(inDay, month, inYear);
        return age.getDayLife();
    }
    
    public static int agePerson(int inDay, int inMonth, int inYear){
        Person age = new Person();
        age.calculateDay(inDay, inMonth, inYear);
        age.calculateMonth(inDay, inMonth, inYear);
        age.calculateAge(inDay, inMonth, inYear);
        return age.getAge();
    }
    public static int monthPerson(int inDay, int inMonth, int inYear){
        Person age = new Person();
        age.calculateDay(inDay, inMonth, inYear);
        age.calculateMonth(inDay, inMonth, inYear);
        age.calculateAge(inDay, inMonth, inYear);
        return age.getMonthLife();
    }*/
    
    public static void read(boolean check){
        System.out.print("*** Registro ***");
        fileMan.readerFile(file);
        if(check){
        System.out.println("* Digite cualquier cosa y pulse enter para salir al Menu *");
        in.next();
        }
    }
    
    public static void modify(){
        read(false);
        String nameModify;
        System.out.println("Escriba el nombre para modificar sus datos");
        nameModify = in.nextLine();
        inString = askForData();
        fileMan.modifyFile(file, nameModify, inString, true);
        
        System.out.println("** Registro Modificado **");
        System.out.println("* Teclee lo que quiera y pulse enter para continuar *");
        in.next();
    }
    
    public static void delete(){
        read(false);
        String nameRemove;
        in.nextLine();
        System.out.println("Escriba el nombre para eliminar sus datos");
        nameRemove = in.nextLine();
        
        fileMan.deleteField(file, nameRemove);
        
    }
    
    public static void search(){
        System.out.println("Funcion por implmentar :(\nEstamos trabajando en ello :)");
        System.out.println("* Teclee lo que quiera y pulse enter para continuar *");
        in.next();
    }
    
    public static void writer(){        
        inString = askForData();
        
        fileMan.writerFile(file, inString);
        System.out.println("*** Registro ingresado exitoso ***\n"
                + "Nombre: " + name + " " +
                + person.getAge() + " años "
                        + person.getMonthLife() + " meses "
                                + person.getDayLife() +" dias");
        System.out.println("* Teclee lo que quiera y pulse enter para continuar *");
        in.next();
    }
   
    public static String askForData(){
        String input = ""; 
        
        in.nextLine();        
        System.out.println("*********************");
        System.out.println("* Ingresa el nombre * ");
        System.out.println("*********************");
        name = in.nextLine();
        
        do{
            
            do{
                do{
                    System.out.print("\n* Ingrese el año de nacimiento: ");
                    input = in.nextLine();
                }while(Validation.onlyDigit(input));
                inYear = Integer.parseInt(input);
            }while(Validation.checkYear(inYear));
            
            do{
                do{
                    System.out.print("\n* Ingrese el mes de nacimiento: ");
                    input = in.nextLine();
                }while(Validation.onlyDigit(input));
                inMonth = Integer.parseInt(input);
            }while(Validation.cheackMonth(inMonth));
            
            do{
                do{
                    System.out.print("\n* Ingrese el dia de nacimiento: ");
                    input = in.nextLine();
                }while(Validation.onlyDigit(input));
                inDay = Integer.parseInt(input);
            }while(Validation.checkDay(inDay, inMonth, inYear));
            
        }while(Validation.checkBirth(inDay, inMonth, inYear));
        
        int age = person.calculateDay(inDay, inMonth, inYear);
        int month =person.calculateMonth(inDay, inMonth, inYear);
        int day = person.calculateAge(inDay, inMonth, inYear);
        
        return "("+ name + "), " + age + ", " 
                + month + ", " + day;
    }

}
