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
public class Person {
    private String firstName;
    private String lastName;
    private String socSecNum;

    public Person(String firstName, String lastName, String socSecNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecNum = socSecNum;
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
}
