/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment00;

/**
 *
 * Description: introduction to OOP.
 */
public class Car {
    
    String merkki;
    int vuosimalli;
    int nopeus;
    
    public Car(){
        this.merkki = "";
        this.vuosimalli = 0;
        this.nopeus = 0;
    }
    
    public Car(String merkki, int vuosimalli, int nopeus){
        this.merkki = merkki;
        this.vuosimalli = vuosimalli;
        this.nopeus = nopeus;
    }
    
    public void kiihdyta(){
        nopeus++;
    }
    
    public String getMerkki(){
        return this.merkki;
    }
}
