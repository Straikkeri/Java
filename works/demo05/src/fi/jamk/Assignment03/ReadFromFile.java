package fi.jamk.Assignment03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

/**
 *
 * @author H8951
 */
public class ReadFromFile {
    public static void main(String args[]){
        
        FileReader fr;      // tiedoston avaaminen lukemista varten
        BufferedReader br;  // puskuroitu tiedoston lukeminen
        
        try {
            fr = new FileReader("testi.txt");
            br = new BufferedReader(fr);
            LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("testi.txt")));

            //do{         
                String s = br.readLine();
                
                lnr.skip(Long.MAX_VALUE);
                System.out.println(lnr.getLineNumber() + 1); 
   
            //} while(true);  
            
                lnr.close();
                br.close(); 
            
        } catch(Exception e){
            System.out.println("Exception occurred:" + e);
        }

    }
//while()newOutput = br.readLine()) != null)
}