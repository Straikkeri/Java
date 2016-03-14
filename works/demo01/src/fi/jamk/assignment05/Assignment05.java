/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment05;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Create a program that asks for 3 digits
 * and then prints out the biggest one.
 */
public class Assignment05 {
 
    public static void main(String args[]){
        
        int big, bigger = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please give three digits.");
        
        for(int i = 1; i <= 3; i++){
            System.out.println("Give digit no. " + i);
            big = input.nextInt();
            
            if(big > bigger){
                bigger = big;
            }
        }
        System.out.println("Biggest number of the given digits is: " + bigger);
    }
}
