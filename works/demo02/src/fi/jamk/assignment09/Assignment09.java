/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.assignment09;;

/**
 *
 * Name: Aleksi Tommila
 * Date: 13.01.2015
 * Description: Write Vehicle-class after the following guidelines: 
 * 
 Properties
 + speed(int)
 + name(String)

 Methods 
 + setSpeed(int speed)
 + setName(String name)
 + printDetails()
 + returnName():String 

 Description of methods: 
 - setSpeed, sets the speed based on a given paramenter. 
 - setname, sets the name based on a given paramenter. 
 - returnName, returns the name to the caller. 
 - printDetails, prints vehicle's speed and name on the screen.
 * 
 * Appendix: Vehicle.java
 */
public class Assignment09 {
    
    
    public static void main(String args[]){
        Vehicle myVehicle = new Vehicle();
        
        myVehicle.setSpeed(320);
        myVehicle.setName("Janne");
        System.out.println("Vehicle's name: " + myVehicle.returnName());
        myVehicle.printDetails(); 
    }
}

