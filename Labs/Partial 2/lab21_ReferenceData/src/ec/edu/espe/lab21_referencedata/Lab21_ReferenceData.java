/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab21_referencedata;

import ec.edu.espe.controller.SalesPrice;

/**
 *
 * @author JDIsmael
 */
public class Lab21_ReferenceData {
    
    public static void main(String[] args) {
        
        SalesPrice salesPrice = new SalesPrice(20, 10, 0);//
        
        float base = 0;
        float tax = 12;
        float finalPrice = 0;
        Integer integer = 0;
        
        base = 10;
        System.out.println("printing from main -> base = " + base + ", finalPrice = " + finalPrice);
        computeFinalPrice(finalPrice, tax, base);
        System.out.println("printing from main -> base = " + base + ", finalPrice = " + finalPrice + "\n");
        
        System.out.println("Printing from main " + salesPrice);
        computeFinalPrice(salesPrice);
        System.out.println("Printing from main " + salesPrice + "\n");
        
        integer = 14;
        System.out.println("printing from main -> Integer = " + integer);
        computeFinalPrice(integer);
        System.out.println("printing from main -> Integer = " + integer);        
        
        
        
        
    }
    
    public static void computeFinalPrice(SalesPrice msalesPrice){
        msalesPrice.setFinalPrice((msalesPrice.getBase()*msalesPrice.getTax())/100+msalesPrice.getBase());
        System.out.println("Printing from computeFinalPrice -> " + msalesPrice);
    }
    
    public static void computeFinalPrice(float mfinalPrice, float mtax, float mbase){
        mfinalPrice = (mbase*mtax)/100+mbase;
        System.out.println("printing from computeFinalPrice -> base = " + mbase 
                + ", finalPrice = " + mfinalPrice);
    }
    
    public static void computeFinalPrice(Integer integer){
        integer = integer*integer;
        System.out.println("printing from computeFinalPrice -> Integer = " + integer );  
    }
    
    
    
}
