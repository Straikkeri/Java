/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment04;

/**
 *
 * @author H8951
 */
public class Main {
 

    
    public static void main(String args[]){
        
        int number1 = 6;
        int number2 = 3;
    
        /*Divide div1 = new Divide();
        Multiply mul1 = new Multiply();
        Add add1 = new Add();
        */
        
        MyMath maths = new MyMath();
          
        System.out.println("number1: " + number1 + ", number2: " + number2);
        
        System.out.println("Divided: " + maths.callMultiply(number1, number2));
        System.out.println("Multiplied: " + maths.callDivide(number1, number2));
        System.out.println("Added: " + maths.callAdd(number1, number2));
        
    }
    
}
