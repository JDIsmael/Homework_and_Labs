/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab17_unit_testing.bussines;

/**
 *
 * @author JDIsmael
 */
public class Operation {
    private short operand1, operand2, result;
    
    public short add(short addend1, short addend2){
        return (short) (addend1 + addend2);
    }
}
