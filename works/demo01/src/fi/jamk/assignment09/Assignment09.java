/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment09;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Create a program that asks for 5 score numbers, sums them and subtracts the biggest and smallest score number from the sum.
 */
public class Assignment09 {
    public static void main(String args[]){ 
        
        int points[];
        points = new int[5];
        int sumOfPoints = 0;
        
        Scanner input = new Scanner( System.in );
        int biggest = 0;
        int smallest = 11;
                
        for(int i = 0; i < 5; i++){
            
            System.out.print("Give " + (i+1) + ". evaluator's points: ");
            points[i]= input.nextInt(); 
            sumOfPoints += points[i];
        }
  
        for(int i = 0; i < 5; i++){
            if(points[i] > biggest){
                biggest = points[i];
            }
            if(points[i] < smallest){
                smallest = points[i];
            }   
        }
        
        sumOfPoints -= biggest + smallest;       
        System.out.println("Final score is: " + sumOfPoints + " with the highest value " + biggest + " and lowest value " + smallest + " subtracted." );
    }
}