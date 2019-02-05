/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculate_age_hw11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JDIsmael
 */
public class PersonTest {
    
    public PersonTest() {
    }
    /*
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateAge method, of class Person.
     
    @Test
    public void testCalculateAge() {
        System.out.println("calculateAge");
        int inDay = 18;
        int inMonth = 3;
        int inYear = 1999;
        Person instance = new Person();
        int expResult = 19;
        int result = instance.calculateAge(inDay, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateDay method, of class Person.
     
    @Test
    public void testCalculateDay() {
        System.out.println("calculateDay");
        int inDay = 18;
        int inMonth = 3;
        int inYear = 1999;
        Person instance = new Person();
        int expResult = 24;
        int result = instance.calculateDay(inDay, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateMonth method, of class Person.
     
    @Test
    public void testCalculateMonth() {
        System.out.println("calculateMonth");
        int inDay = 31;
        int inMonth = 5;
        int inYear = 1996;
        Person instance = new Person();
        int expResult = 6;
        int result = instance.calculateMonth(inDay, inMonth, inYear);
        assertEquals(expResult, result);
    }
    
    
        @Test
    public void testCalculateAge2() {
        System.out.println("calculateAge");
        int inDay = 25;
        int inMonth = 3;
        int inYear = 1999;
        Person instance = new Person();
        int expResult = 19;
        int result = instance.calculateAge(inDay, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateDay method, of class Person.
     
    @Test
    public void testCalculateDay2() {
        System.out.println("calculateDay");
        int inDay = 31;
        int inMonth = 5;
        int inYear = 1996;
        Person instance = new Person();
        int expResult = 13;
        int result = instance.calculateDay(inDay, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateMonth method, of class Person.
     
    @Test
    public void testCalculateMonth2() {
        System.out.println("calculateMonth");
        int inDay = 31;
        int inMonth = 11;
        int inYear = 1996;
        Person instance = new Person();
        int expResult = 0;
        int result = instance.calculateMonth(inDay, inMonth, inYear);
        assertEquals(expResult, result);
    }
    
    
      @Test
    public void testCalculateAge3() {
        System.out.println("calculateAge");
        int inDay = 15;
        int inMonth = 07;
        int inYear = 1997;
        Person instance = new Person();
        int expResult = 21;
        int result = instance.calculateAge(inDay, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateDay method, of class Person.
     
    @Test
    public void testCalculateDay3() {
        System.out.println("calculateDay");
        int inDay = 15;
        int inMonth = 07;
        int inYear = 1997;
        Person instance = new Person();
        int expResult = 27;
        int result = instance.calculateDay(inDay, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateMonth method, of class Person.
     
    @Test
    public void testCalculateMonth3() {
        System.out.println("calculateMonth");
        int inDay = 15;
        int inMonth = 7;
        int inYear = 1997;
        Person instance = new Person();
        int expResult = 4;
        int result = instance.calculateMonth(inDay, inMonth, inYear);
        assertEquals(expResult, result);
    }*/
    
    
    
    
    
    
    
    
    
    
    
    @Test
    public void testCalculate1() {
        
        int inDay = 29;
        int inMonth = 2;
        int inYear = 2015;
        Person instance = new Person();
        int expResultday = -1;
        int resultday = instance.calculateDay(inDay, inMonth, inYear);
        System.out.println("day");
        assertEquals(expResultday, resultday);
        int expResultmonth = -1;
        int resultmont = instance.calculateMonth(inDay, inMonth, inYear);
        System.out.println("Month");
        assertEquals(expResultmonth, resultmont);
        int expResultage = -1;
        int resultage = instance.calculateAge(inDay, inMonth, inYear);
        System.out.println("age");
        assertEquals(expResultage, resultage);
    }
    
    
    @Test
    public void testCalculate2() {
        System.out.println("calculateMonth");
        int inDay = 31;
        int inMonth = 4;
        int inYear = 2016;
        Person instance = new Person();
        int expResultday = -1;
        int resultday = instance.calculateDay(inDay, inMonth, inYear);
        assertEquals(expResultday, resultday);
        int expResultmonth = -1;
        int resultmont = instance.calculateMonth(inDay, inMonth, inYear);
        assertEquals(expResultmonth, resultmont);
        int expResultage = -1;
        int resultage = instance.calculateAge(inDay, inMonth, inYear);
        assertEquals(expResultage, resultage);
    }
    @Test
    public void testCalculate3() {
        System.out.println("calculateMonth");
        int inDay = 31;
        int inMonth = 11;
        int inYear = 2013;
        Person instance = new Person();
        int expResultday = -1;
        int resultday = instance.calculateDay(inDay, inMonth, inYear);
        assertEquals(expResultday, resultday);
        int expResultmonth = -1;
        int resultmont = instance.calculateMonth(inDay, inMonth, inYear);
        assertEquals(expResultmonth, resultmont);
        int expResultage = -1;
        int resultage = instance.calculateAge(inDay, inMonth, inYear);
        assertEquals(expResultage, resultage);
    }
    @Test
    public void testCalculate4() {
        System.out.println("calculateMonth");
        int inDay = 17;
        int inMonth = 12;
        int inYear = 1970;
        Person instance = new Person();
        int expResultday = 27;
        int resultday = instance.calculateDay(inDay, inMonth, inYear);
        assertEquals(expResultday, resultday);
        int expResultmonth = 11;
        int resultmont = instance.calculateMonth(inDay, inMonth, inYear);
        assertEquals(expResultmonth, resultmont);
        int expResultage = 47;
        int resultage = instance.calculateAge(inDay, inMonth, inYear);
        assertEquals(expResultage, resultage);
    }
    @Test
    public void testCalculate5() {
        System.out.println("calculateMonth");
        int inDay = 17;
        int inMonth = 12;
        int inYear = 1970;
        Person instance = new Person();
        int expResultday = 27;
        int resultday = instance.calculateDay(inDay, inMonth, inYear);
        assertEquals(expResultday, resultday);
        int expResultmonth = 11;
        int resultmont = instance.calculateMonth(inDay, inMonth, inYear);
        assertEquals(expResultmonth, resultmont);
        int expResultage = 47;
        int resultage = instance.calculateAge(inDay, inMonth, inYear);
        assertEquals(expResultage, resultage);
    }
    
    @Test
    public void testCalculate6() {
        System.out.println("calculateMonth");
        int inDay = 13;
        int inMonth = 12;
        int inYear = 1970;
        Person instance = new Person();
        int expResultday = 0;
        int resultday = instance.calculateDay(inDay, inMonth, inYear);
        assertEquals(expResultday, resultday);
        int expResultmonth = 0;
        int resultmont = instance.calculateMonth(inDay, inMonth, inYear);
        assertEquals(expResultmonth, resultmont);
        int expResultage = 48;
        int resultage = instance.calculateAge(inDay, inMonth, inYear);
        assertEquals(expResultage, resultage);
    }
    
}
