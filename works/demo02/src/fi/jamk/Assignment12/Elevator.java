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
public class Elevator {
    
    int carryWeight, installYear, RPM;
    String manufacturer, maintenanceBy, maintenanceDate;
    double speed = 0;
    
    Elevator(int newCarryWeight, int newInstallYear, int newRPM, String newManufacturer, String newMaintenanceBy, String newMaintenanceDate){
        this.carryWeight = newCarryWeight;
        this.installYear = newInstallYear;
        this.RPM = newRPM;
        this.manufacturer = newManufacturer;
        this.maintenanceBy = newMaintenanceBy;
        this.maintenanceDate = newMaintenanceDate;
        
        calculateSpeed(this.RPM);
    }
    
    public void setCarryWeight(int newCarryWeight){
        this.carryWeight = newCarryWeight;
    }
    
    public void setInstallYear(int newInstallYear){
        this.installYear = newInstallYear;
    }
    
    public void increaseRPM(){
        this.RPM = this.RPM + 10;
    }
    
    public void decreaseRPM(){
        this.RPM = this.RPM - 10;
    }
    
    public void setManufacturer(String newManufacturer){
        this.manufacturer = newManufacturer;
    }

    public void setMaintenanceBy(String newMaintenanceBy){
        this.maintenanceBy = newMaintenanceBy;
    }
    
    public void setMaintenanceDate(String newMaintenanceDate){
        this.maintenanceDate = newMaintenanceDate;
    }
    
    private void calculateSpeed(int RPM){
        this.speed = 0.5 * RPM * 0.10472;
    }
    
    public void displayDetails(){
        System.out.println("Carry weight: " + this.carryWeight + ", install year: " + this.installYear + ", manufacturer: " + this.manufacturer + ", maintenace date: " + this.maintenanceDate + ", maintenance by: " + this.maintenanceBy + ", speed: " + this.speed + "mps.");
    }
}
