/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment00;

import java.util.ArrayList;

/**
 *
 * @author H8951
 */
public class Register {
    private ArrayList<Person>members;
    
    public Register(){
        this.members = new ArrayList<>();
    }
    
    public int getMembersCount(){
        return this.members.size();
    }
    
    public boolean addMember(Person p){
        return this.members.add(p);
    
    }
    
    public Person getMember(int index){
        if(index < getMembersCount()){
            return this.members.get(index);
        } else
            return null;
    }
    
    public Person findMember(String socSecNum){
        for(Person p : this.members){
            if(socSecNum.equalsIgnoreCase(p.getSocSecNum())){
                return p;
            }
        }
        return null;
    }
}