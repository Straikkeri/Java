/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment00;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Create a program that asks for a number between 1 and 3 and prints the number as a word. 
 * If some other figure is given, print "some other number".
 */
public class Assignment00 {
    
     public static void main(String args[]){
        //ask the user for a number
        int number;
        System.out.println("Give a number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        //print the corresponding word
        switch(number){
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            default: System.out.println("Some other figure"); 
        }
     }   
}
