/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.operation;

/**
 *
 * @author JDIsmael
 */
public class Operation {
    
    
    public short add(short operand1, short operand2){
        return (short) (operand1 + operand2);
    }
    public float add(float operand1, float operand2){
            return operand1 + operand2;
    }
    
    public float divide(float f1, float f2){
        return f1/f2;
    }
}
