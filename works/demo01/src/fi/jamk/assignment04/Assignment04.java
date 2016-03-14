/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment04;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Create a program that determines whether the given year is a leap year.
 */
public class Assignment04 {
    
    public static void main(String args[]){    
        
        Scanner input = new Scanner( System.in );
    
        int year;
        
        System.out.println("Input a year: ");
        year = input.nextInt();
        
        if(year % 4 == 0 && year > 100){
            if(year % 100 == 0){
                if(year % 400 == 0){
                System.out.println("It's a leap year");
            
                } else {
                System.out.println("It's not a leap year");
                }
            } else {
            System.out.println("It's a leap year");
            }
        } else if(year % 4 == 0 && year < 100){
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }
}
            