/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment02;

import java.util.TreeSet;

/**
 *
 * @author H8951
 */
public class TreeSetter {
    
    public static void main(String args[]){
        
    
        TreeSet members = new TreeSet();
        
        Person person1 = new Person("Esa", "Nahka", "A1");
        Person person2 = new Person("Nysä", "Pahka", "A2");
        Person person3 = new Person("Vesa", "Vahka", "A3");
        Person person4 = new Person("Pertti", "Puhka", "A4");
        Person person5 = new Person("Kalle", "Suhta", "A5");
        Person person6 = new Person("Kalle", "Suhta", "A5");
        
        // lisätään henkilöt tietorakenteeseen, sotu toimii avaimena
        
        members.add(person1);
        members.add(person2);
        members.add(person3);
        members.add(person4);
        members.add(person5);
       
        if(!members.add(person6)){
            System.out.println("Input failed. Matching name found.");
        }
        System.out.println(members.toString());
        
    
    }
}