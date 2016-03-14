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
public class Employee {
    
    private String name;
    private String station;
    private Double pay;
    
    public Employee(String name, String station, double pay){
    
     this.name = name;
     this.station = station;
     this.pay = pay;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }
    
    public String returnDetails(){
        return "Name: " + this.name + ", station: " + station + ", pay: " + this.pay;
    }
    
    
    
}

