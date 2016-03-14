/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author H8951
 */
public class WriteToFile {
    public static void main(String args[]){
        
        FileWriter fw;      // tiedoston avaaminen kirjoittamista varten
        FileReader fr;      // tiedoston avaaminen lukemista varten
        BufferedWriter bw;  // puskuroitu tiedostoon kirjoittaminen merkkeinä
        BufferedReader br;  // puskuroitu tiedoston lukeminen
        
        Scanner scan = new Scanner( System.in );
        
        try {
            fw = new FileWriter("testi.txt");
            bw = new BufferedWriter(fw);
            
            System.out.println("Write lines of text. They'll go to testi.txt");

            do{

                String s = scan.nextLine();
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
        
        
        
        
        
        /*
        Scanner scan = new Scanner( System.in );
        Path path = FileSystems.getDefault().getPath("AleksiT","Demo05Assignment02");
        
        try {
            byte dataToWrite[] = scan.nextLine().getBytes();
            
            
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(path, CREATE));
            //OutputStream out = new BufferedOutputStream(Files.newOutputStream(CREATE, APPEND));
            //FileOutputStream out = new FileOutputStream("Assignment02.txt");
            
            out.write(dataToWrite);
            out.close();
        } catch(Exception e){
            System.out.println("Derp");
        }*/
    }
}
