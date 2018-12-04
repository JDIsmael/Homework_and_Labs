/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab18_collection;

import ec.edu.espe.lab18_colletion.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author JDIsmael
 */
public class Lab18_Collection {

    public static void main(String[] args) {
        Collection things = new ArrayList<>();
        Person person = new Person(1320, "Dario", 1500.56f);
        
        
        System.out.println("Size at biginin " + things.size());
        things.add(18000);
        things.add("Hello Quito!!");
        things.add(5000.45f);
        things.add(person);
        System.out.println("Size at biginin " + things.size());
        System.out.println("Los elementos de la list es: " + things);
        
        
        
        Object[] thingArray = new Object[things.size()];
        thingArray = things.toArray();
        System.out.println("El 3er elemento es: " + thingArray[2]);
        
        things.remove(5000.45f);
        System.out.println("Size at biginin " + things.size());
        System.out.println("Los elementos de la list es: " + things);
        
        things.add(3);
        things.add(3);
        things.add(3);
        
        System.out.println("Size at biginin " + things.size());
        System.out.println("Los elementos de la list es: " + things);
        
        things.remove(3);
        System.out.println("Size at biginin " + things.size());
        System.out.println("Los elementos de la list es: " + things);
        
        things.add(5);
        things.add(8);
        things.add(4);
        things.add(8);
        things.add(9);
        things.add(8);
        
        things.remove(8);
        System.out.println("Size at biginin " + things.size());
        System.out.println("Los elementos de la list es: " + things);
        
        things.remove(person);
        System.out.println("Size at biginin " + things.size());
        System.out.println("Los elementos de la list es: " + things);
        System.out.println("\n");
        
        
        Collection integer = new ArrayList<>();
        integer.add(1);
        integer.add(1.7f);
        
        ArrayList<Person> persons = new ArrayList<>();
        
        for(int i=0; i <5;i++)
            persons.add(new Person(i+1, "Dario"+(i+1), (i+1)*1000));
        
        for(Person a: persons)
            System.out.println("Sueldo: " +a);
        
        System.out.println("\n");
        
        persons.forEach((t) -> {
            System.out.println("Sueldo: " +t);
        });
        
    }
    
}
