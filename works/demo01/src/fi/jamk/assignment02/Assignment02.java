/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment02;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Create a program that asks for an amount of seconds and displays it in hours, minutes and seconds.
 */

public class Assignment02 {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner( System.in );
        
        int secondsGiven;
        int secondsLeft;
        int minutes;
        int hours;
        
        System.out.print("Give an amount of seconds: ");
        
        secondsGiven = input.nextInt();
        
        hours = secondsGiven / 3600;
        
        secondsLeft = secondsGiven % 3600;
        
        minutes = secondsLeft / 60;
        
        secondsLeft = secondsLeft % 60;
        
        System.out.print("The stack of seconds equals to: " + hours + " hours, " + minutes + " minutes, " + secondsLeft + " seconds.");
    }
}
