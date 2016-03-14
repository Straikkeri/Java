/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment01;

import java.util.Scanner;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Create a program that asks for the users score and determines his grade.
 */
public class Assignment01 {
    
    Scanner input = new Scanner( System.in );
    
    public static void main(String args[]){ 
        
        System.out.println("Your grade is: " + new Assignment01().ask());
    }
    
    private int ask() {
        
        int score;
        
        System.out.println("Give score: ");
        score = input.nextInt();
    
        return compare(score);
        
    }
    
    private int compare(int score){
        
        int number; 
        
        if (score <= 1){
            number = 0;
        }    
        else if(score >= 2 && score <= 3){
            number = 1;
        } 
        else if(score >=4 && score <= 5){
            number = 2;
        }
        else if(score >= 6 && score <= 7){
            number = 3;
        }
        else if(score >= 8 && score <= 9){
            number = 4;
        }
        else{
            number = 5;
        } 
        return number;
    }
    //first_name = user_input.next( );
    
}
