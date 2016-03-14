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
public class RegisterTest {
    public static void main(String args[]){
        Register friends = new Register();
        Person p = new Person("Mitch", "Macho", "B2");
        
        if (friends.addMember(p))
            System.out.println("Added.");
        else
            System.out.println("Failed.");
        
        System.out.println("Contents of the register: ");
        for(int i = 0; i < friends.getMembersCount(); i++){
            p = friends.getMember(i);
            System.out.println(p.getDetails());
            
         }
        
        String findSocSecNum = "B1";
        p = friends.findMember(findSocSecNum);
        
        if (p != null)
            System.out.println(p.getDetails());
        else
            System.out.println("A person matching the given social security number could not be found.");
    }
}
