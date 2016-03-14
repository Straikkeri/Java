/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment06;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Create a program that asks for an endless number of digits until 0 is inputted.
 */
public class Assignment06 {
    
    public static void main(String args[]){  
    
        Scanner input = new Scanner( System.in );
        int digit;
        
        System.out.println("Input as many digits as desired. Stop with 0: ");
        
        do{
            digit = input.nextInt();
        }while(digit != 0);
    }
}
