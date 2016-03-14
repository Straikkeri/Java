/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment03;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: A car expends 7.01 liters per 100 km and the price of gasoline is 1.595€. 
 * Create a program that asks for a distance and prints the amount of gas expended and the cost.
 */
public class Assignment03 {
    
    public static void main(String args[]){ 
        
        Scanner input = new Scanner( System.in );
        
        System.out.println("Input a distance in kilometers: ");
        
        double km;
        double gasExpended;
        double cost;
        
        km = input.nextInt();
        
        gasExpended = 7.01 / 100 * km;
        cost = gasExpended * 1.595;
        
        System.out.println("Gas used: " + gasExpended + "l, cost: " + cost + "€");
        
        
        
        
        
        
        
    }
    
}
