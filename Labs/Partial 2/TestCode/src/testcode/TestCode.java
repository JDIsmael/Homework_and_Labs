/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JDIsmael
 */
public class TestCode {
     public static int cont=0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*int numeros = 23453;
        // compilamos el patron
Pattern patron = Pattern.compile("^[0-9]+$");
// creamos el Matcher a partir del patron, la cadena como parametro
Matcher encaja = patron.matcher(numeros);
// invocamos el metodo replaceAll

System.out.println(encaja.find());
        
        
        Scanner in = new Scanner(System.in);
        int numeros = 0;
        System.out.println("Ingrese solo numeros\n");
        try{
            
        numeros = in.nextInt( );
        }catch(Exception e){
            System.out.println("ingrese bien los numeros");
        }
        
        System.out.println(numeros);*/
        
        for(int i=0;i<5;i++)
            cont++;
        
        Prueba2 prueba=new Prueba2();
        
        prueba.imprimier();
        System.out.println("el contador es el mismo en prueba 2 que en Tescodey es: "+cont);
    }
    
    
  
       
        
        
        
        public static class Prueba2{
            int num=TestCode.cont;
            
            public void imprimier(){
                System.out.println("el contador es: " + num);
                TestCode.cont=8;
                System.out.println("el contador en la clase prueba2es: "+ TestCode.cont);
                
            }
                    
        }
    
}
