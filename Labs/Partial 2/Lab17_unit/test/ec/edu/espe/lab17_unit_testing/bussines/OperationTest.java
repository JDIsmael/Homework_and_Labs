/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab17_unit_testing.bussines;

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
public class OperationTest {
    
    public OperationTest() {
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

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        short addend1 = 0;
        short addend2 = 0;
        Operation instance = new Operation();
        short expResult = 0;
        short result = instance.add(addend1, addend2);
        assertEquals(expResult, result);
    }
    @Test
    public void testAddSimpleCase(){
        short operand1 = 1, operand2 = 2;
        short expResult = 3;
        Operation operation = new Operation();
        short actualresult = operation.add(operand1, operand2);
        assertEquals(expResult, actualresult);
        System.out.println(operand1 +" "+ operand2 + " succeeded");
        
        operand1 = 2;
        operand2 = -1;
        expResult = 1;
        actualresult = operation.add(operand1, operand2); 
        assertEquals(expResult, actualresult);
        System.out.println(operand1 +" "+ operand2 + " succeeded");
        
        
        operand1 = 2;
        operand2 = -1;
        expResult = 1;
        actualresult = operation.add(operand1, operand2); 
        assertEquals(expResult, actualresult);
        System.out.println(operand1 +" "+ operand2 + " succeeded");
        
        operand1 = 2;
        operand2 = -1;
        expResult = 1;
        actualresult = operation.add(operand1, operand2); 
        assertEquals(expResult, actualresult);
        System.out.println(operand1 +" "+ operand2 + " succeeded");
        
        operand1 = 2;
        operand2 = -1;
        expResult = 1;
        actualresult = operation.add(operand1, operand2); 
        assertEquals(expResult, actualresult);
        System.out.println(operand1 +" "+ operand2 + " succeeded");
        
        operand1 = 2;
        operand2 = -1;
        expResult = 1;
        actualresult = operation.add(operand1, operand2); 
        assertEquals(expResult, actualresult);
        System.out.println(operand1 +" "+ operand2 + " succeeded");
    }
    
    @Test
    public void worngCases(){
        short operand1 = 32000, operand2 = 32000;
        int expResult = 64000;
        Operation operation = new Operation();
        short actualresult = operation.add(operand1, operand2);
        assertEquals(expResult, actualresult);
        System.out.println(operand1 +" "+ operand2 + " succeeded");
        
        
    }

}
