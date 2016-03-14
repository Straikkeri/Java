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
public class Radio {
    
    private boolean onOff;
    private int volume;
    private double channel;

    public Radio(boolean onOff, int volume, double channel) {
        this.onOff = onOff;
        this.volume = volume;
        this.channel = channel;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 9 ){
            this.volume = volume;
        } else {
            System.out.println("No can do. Must be within 0-9");
        }
    }

    public double getChannel() {
        return channel;
    }

    public void setChannel(double channel) {
        if(channel >= 2000 && channel <= 26000 ){
            this.channel = channel;
        } else {
            System.out.println("No can do. Must be within 2000.0 and 26000.0");
        }
    }  
    
}
