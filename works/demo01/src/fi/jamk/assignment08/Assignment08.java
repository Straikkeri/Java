/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment08;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Create a program that asks for 5 digits that are held in an array, then prints the digits in reverse order.
 */
public class Assignment08 {
    
    public static void main(String args[]){ 
    
        Scanner input = new Scanner( System.in );
        
        int digits[];
        digits = new int[5];
        
        for(int i = 0; i < 5; i++){
            
            System.out.print("Give number " + (i+1) + ": ");
              digits[i]= input.nextInt(); 
            
        }
        
        for(int i = 4; i >= 0; i--){
            
            System.out.println(digits[i]);
        }
    }
}