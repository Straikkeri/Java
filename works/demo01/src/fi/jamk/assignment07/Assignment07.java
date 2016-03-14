/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment07;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Create a program that asks for 3 digits
 * and then prints out the biggest one.
 */
public class Assignment07 {
 
    public static void main(String args[]){
        
        int big, bigger = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please give the amount of layers in the pyramid: " + input.nextInt());
        
        for(int i = 1; i <= 3; i++){
            
            System.out.println("*");
        }
    }
}
