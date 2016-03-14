/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment03;

/**
 *
 * @author H8951
 */
public class RadioTest {
    
    public static void main(String args[]){
        
        Radio myRadio = new Radio(true, 8, 5200);
        
        //myRadio.onOff = true;
        //myRadio.volume = 5000;
        //myRadio.channel = 7000;
        
        myRadio.setOnOff(false);
        myRadio.setVolume(5);
        myRadio.setChannel(5000);
        
        System.out.println("Channel: " + myRadio.getChannel() + ", Volume: " + myRadio.getVolume() + ", Channel: " + myRadio.getVolume());
        
        myRadio.setOnOff(true);
        myRadio.setVolume(1000);
        myRadio.setChannel(5);
        
        
    }
}
