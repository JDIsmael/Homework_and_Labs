/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20_personalexceptions;

import ec.edu.espe.exception.MyException;
import java.util.Scanner;

/**
 *
 * @author JDIsmael
 */
public class Lab20_PersonalExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float divisor=0;
        float dividend=0;
        float result=0;
        
        Scanner in = new Scanner(System.in);
        
        try{
            System.out.print("Igrese un dividendo: ");
            dividend = in.nextFloat();
            result = dividend / divisor;
            System.out.println("Existe un error");
            throw new MyException();
        }catch(MyException ex){
            System.out.println(ex.ZeroDivisionException());
        }
    }
    
}
