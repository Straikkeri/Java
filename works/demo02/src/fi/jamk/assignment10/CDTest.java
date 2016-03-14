/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment10;

/**
 *
 * @author H8951
 */
public class CDTest {
    
    static String name = "Mystic Mike's Magic Monologue";
    
    public static void main(String args[]){
        CD myCD = new CD(name);
        CD myOtherCD = new CD(name, "Mystic Mike", "1.0.1", 1988);
        
        System.out.println("Object myCD: " + myCD.returnDetails());
        System.out.println("Object myOtherCD: " + myOtherCD.returnDetails());
    
    }
}
