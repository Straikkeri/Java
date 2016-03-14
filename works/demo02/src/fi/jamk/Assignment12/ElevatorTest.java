/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment12;

/**
 *
 * @author H8951
 */
public class ElevatorTest {
    public static void main(String args[]){
        Elevator lift = new Elevator(750, 1975, 60, "Jaska's lifts", "Herska's hissi hustlers", "13.5.1988");
        
        lift.decreaseRPM();
        
        lift.displayDetails();
    }
}
