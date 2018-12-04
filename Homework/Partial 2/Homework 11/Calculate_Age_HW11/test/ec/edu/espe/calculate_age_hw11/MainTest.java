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
public class MainTest {
    
    public MainTest() {
    }
    
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

    
    @Test
    public void testDayPerson() {
        System.out.println("dayPerson");
        int inday = 8;
        int inMonth = 10;
        int inYear = 1997;
        int expResult = 26;
        int result = Main.dayPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of agePerson method, of class Main.
     */
    @Test
    public void testAgePerson() {
        System.out.println("agePerson");
        int inday = 8;
        int inMonth = 10;
        int inYear = 1997;
        int expResult = 21;
        int result = Main.agePerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of monthPerson method, of class Main.
     */
    @Test
    public void testMonthPerson() {
        System.out.println("monthPerson");
        int inday = 8;
        int inMonth = 10;
        int inYear = 1997;
        int expResult = 1;
        int result = Main.monthPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }
    
    
    
        @Test
    public void testDay2() {
        System.out.println("dayPerson");
        int inday = 03;
        int inMonth = 27;
        int inYear = 1997;
        int expResult = 26;
        int result = Main.dayPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of agePerson method, of class Main.
     */
    @Test
    public void testage2() {
        System.out.println("agePerson");
        int inday = 03;
        int inMonth = 27;
        int inYear = 1997;
        int expResult = 21;
        int result = Main.agePerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of monthPerson method, of class Main.
     */
    @Test
    public void testMonth2() {
        System.out.println("monthPerson");
        int inday = 03;
        int inMonth = 27;
        int inYear = 1997;
        int expResult = 1;
        int result = Main.monthPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

        @Test
    public void testDay3() {
        System.out.println("dayPerson");
        int inday = 29;
        int inMonth = 02;
        int inYear = 1998;
        int expResult = 26;
        int result = Main.dayPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of agePerson method, of class Main.
     */
    @Test
    public void testage3() {
        System.out.println("agePerson");
        int inday = 29;
        int inMonth = 02;
        int inYear = 1998;
        int expResult = 21;
        int result = Main.agePerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of monthPerson method, of class Main.
     */
    @Test
    public void testMonth3() {
        System.out.println("monthPerson");
        int inday = 29;
        int inMonth = 02;
        int inYear = 1998;
        int expResult = 1;
        int result = Main.monthPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

        @Test
    public void testDay4() {
        System.out.println("dayPerson");
        int inday = 13;
        int inMonth = -1;
        int inYear = 0;
        int expResult = 26;
        int result = Main.dayPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of agePerson method, of class Main.
     */
    @Test
    public void testage4() {
        System.out.println("agePerson");
        int inday = 13;
        int inMonth = -1;
        int inYear = 0;
        int expResult = 21;
        int result = Main.agePerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of monthPerson method, of class Main.
     */
    @Test
    public void testMonth4() {
        System.out.println("monthPerson");
        int inday = 13;
        int inMonth = -1;
        int inYear = 0;
        int expResult = 1;
        int result = Main.monthPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

        @Test
    public void testDay5() {
        System.out.println("dayPerson");
        int inday = Integer.parseInt("junio");
        int inMonth = 1;
        int inYear = 1998;
        int expResult = 26;
        int result = Main.dayPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of agePerson method, of class Main.
     */
    @Test
    public void testage5() {
        System.out.println("agePerson");
        int inday = Integer.parseInt("junio");
        int inMonth = 1;
        int inYear = 1998;
        int expResult = 21;
        int result = Main.agePerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of monthPerson method, of class Main.
     */
    @Test
    public void testMonth5() {
        System.out.println("monthPerson");
        int inday = Integer.parseInt("junio");
        int inMonth = 1;
        int inYear = 1998;
        int expResult = 1;
        int result = Main.monthPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

        @Test
    public void testDay6() {
        System.out.println("dayPerson");
        int inday = 35;
        int inMonth = 12;
        int inYear = 1998;
        int expResult = 26;
        int result = Main.dayPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of agePerson method, of class Main.
     */
    @Test
    public void testage6() {
        System.out.println("agePerson");
        int inday = 35;
        int inMonth = 12;
        int inYear = 1998;
        int expResult = 21;
        int result = Main.agePerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of monthPerson method, of class Main.
     */
    @Test
    public void testMonth6() {
        System.out.println("monthPerson");
        int inday = 35;
        int inMonth = 12;
        int inYear = 1998;
        int expResult = 1;
        int result = Main.monthPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

        @Test
    public void testDay7() {
        System.out.println("dayPerson");
        int inday = 31;
        int inMonth = 04;
        int inYear = 1998;
        int expResult = 26;
        int result = Main.dayPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of agePerson method, of class Main.
     */
    @Test
    public void testage7() {
        System.out.println("agePerson");
        int inday = 31;
        int inMonth = 04;
        int inYear = 1998;
        int expResult = 21;
        int result = Main.agePerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of monthPerson method, of class Main.
     */
    @Test
    public void testMonth7() {
        System.out.println("monthPerson");
        int inday = 31;
        int inMonth = 04;
        int inYear = 1998;
        int expResult = 1;
        int result = Main.monthPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }



        @Test
    public void testDay8() {
        System.out.println("dayPerson");
        int inday = 1998;
        int inMonth = 1;
        int inYear = 31;
        int expResult = 26;
        int result = Main.dayPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of agePerson method, of class Main.
     */
    @Test
    public void testage8() {
        System.out.println("agePerson");
        int inday = 1998;
        int inMonth = 1;
        int inYear = 31;
        int expResult = 21;
        int result = Main.agePerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of monthPerson method, of class Main.
     */
    @Test
    public void testMonth8() {
        System.out.println("monthPerson");
        int inday = 1998;
        int inMonth = 1;
        int inYear = 31;
        int expResult = 1;
        int result = Main.monthPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }


        @Test
    public void testDay9() {
        System.out.println("dayPerson");
        int inday = 8;
        int inMonth = 10;
        int inYear = 1997;
        int expResult = 26;
        int result = Main.dayPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of agePerson method, of class Main.
     */
    @Test
    public void testage9() {
        System.out.println("agePerson");
        int inday = 8;
        int inMonth = 10;
        int inYear = 1997;
        int expResult = 21;
        int result = Main.agePerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }

    /**
     * Test of monthPerson method, of class Main.
     */
    @Test
    public void testMonth9() {
        System.out.println("monthPerson");
        int inday = 8;
        int inMonth = 10;
        int inYear = 1997;
        int expResult = 1;
        int result = Main.monthPerson(inday, inMonth, inYear);
        assertEquals(expResult, result);
    }  
}
