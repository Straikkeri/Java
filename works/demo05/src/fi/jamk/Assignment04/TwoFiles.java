/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author H8951
 */
public class TwoFiles {
    public static void main(String args[]){
        
        FileWriter fw;      // tiedoston avaaminen kirjoittamista varten
        BufferedWriter bw;  // puskuroitu tiedostoon kirjoittaminen merkkeinä
        
        double dubs;
        int notDubs;
        
        Scanner scan = new Scanner( System.in );
        
        System.out.println("Give an int and a double.");
        
        String s = scan.nextLine();
        
        dubs = Double.parseDouble(s);
        
        try {
            fw = new FileWriter("Assignment04.txt");
            bw = new BufferedWriter(fw);
            
            System.out.println("");
            
            

            do{
                if(!s.equals("exit")){
                    bw.write(s);
                    bw.newLine();
                }
                else {
                    bw.close();
                    break;
                }
            } while(true);
            
        } catch(Exception e){
            System.out.println("Exception occurred.");
        }
    }
}