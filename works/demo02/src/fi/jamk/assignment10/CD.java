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
public class CD {
    
    String name, copyright, version;
    int year;
    
    public CD(String newName){
        this.name = newName;
    }
    
    public CD(String newName, String newCopyright, String newVersion, int newYear){
        this.name = newName;
        this.copyright = newCopyright;
        this.version = newVersion;
        this.year = newYear;      
    } 
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setCopyright(String newCopyright){
        this.copyright = newCopyright;
    }
    
    public void  setVersion(String newVersion){
        this.version = newVersion;
    }
    
    public void setYear(int newYear){
        this.year = newYear;
    }
    
    public String returnDetails(){
        return " Name: " + this.name + ", copyright: " + this.copyright + ", version: " + this.version + ", Year: " + this.year;
    }
    
}
