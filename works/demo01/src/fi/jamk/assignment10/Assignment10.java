package fi.jamk.assignment10;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Write a program that asks the user for students' grades (you can decide the quit command). Print the grade dispersion using * as follows:

Grade dispersion:
0:
1:****
2:**
3:******
4:*****
5:**
 */
public class Assignment10 {
    public static void main(String args[]){
    
        Scanner grade = new Scanner( System.in );
        
        ArrayList<Integer> grades = new ArrayList<>();
        
        int input;
        int i = 0;
        //String grade1, grade2, grade3, grade4, grade5;
        
        StringBuilder grade0 = new StringBuilder();
        StringBuilder grade1 = new StringBuilder();
        StringBuilder grade2 = new StringBuilder();
        StringBuilder grade3 = new StringBuilder();
        StringBuilder grade4 = new StringBuilder();
        StringBuilder grade5 = new StringBuilder();
        
        do{
            input = grade.nextInt();
            if(input >= 0 && input < 6){
                //grades.add(input); 
                
                switch(input){
                    case 0:
                        grade0.append("*");
                        break;
                    case 1:
                        grade1.append("*");
                        break;
                    case 2:
                        grade2.append("*");
                        break;
                    case 3:
                        grade3.append("*");
                        break;
                    case 4:
                        grade4.append("*");
                        break;
                    case 5:
                        grade5.append("*");
                        break;
                    
                }
                i++;
            } else {
            System.out.println("Invalid grade.");
            }
        }while(input != 6);
        
        System.out.println("0: " + grade0);
        System.out.println("1: " + grade1);
        System.out.println("2: " + grade2);
        System.out.println("3: " + grade3);
        System.out.println("4: " + grade4);
        System.out.println("5: " + grade5);        
    }
}
