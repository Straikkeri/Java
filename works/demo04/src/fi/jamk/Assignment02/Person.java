/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment02;

/**
 *
 * @author H8951
 */
public class Person implements Comparable {
    private String firstName;
    private String lastName;
    private String socSecNum;

    public Person(String firstName, String lastName, String socSecNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecNum = socSecNum;
    }
    
    @Override
    public int compareTo(Object next) {
    //KYSY WAT HAPPANS HAAAR!!    
        String bLastName = ((Person)next).getLastName();
        String bFirstName = ((Person)next).getFirstName();
        
        int familyCompare = lastName.compareTo(bLastName);
        
        if (familyCompare == 0) 
            return firstName.compareTo(bFirstName);
        else 
            return familyCompare;
  }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecNum() {
        return socSecNum;
    }

    public void setSocSecNum(String socSecNum) {
        this.socSecNum = socSecNum;
    }
    
    public String getDetails(){
        return this.firstName + " " + this.lastName + " " + this.socSecNum;
    }
    
    @Override
    public String toString() { 
    String result = getDetails(); 
    return result;
    }
}
