/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment00;

/**
 *
 * @author H8951
 */
public class Boss extends Employee {
    
    String car;
    double bonus;
    
    public Boss(String name, String station, double pay, String car, double bonus){
        super(name, station, pay);
        this.car = car;
        this.bonus = bonus;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String returnDetails() {
        return super.returnDetails() + " " + this.car + " " + this.bonus;
    }
    
}
