/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment03;

import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author H8951
 */
public class HashMapAndTreeMap {
    public static void main(String args[]){
       
        // luodaan tietorakenne
        HashMap members = new HashMap();
        
        Person person1 = new Person("Esa", "Nahka", "A1");
        Person person2 = new Person("Nysä", "Pahka", "A2");
        Person person3 = new Person("Vesa", "Vahka", "A3");
        Person person4 = new Person("Pertti", "Puhka", "A4");
        Person person5 = new Person("Kalle", "Suhta", "A5");
        

        // lisätään henkilöt tietorakenteeseen, sotu toimii avaimena
        members.put("121290-121R", person1);
        members.put("101089-234F", person2);
        members.put("034534-452K", person3);
        members.put("876342-678L", person4);
        members.put("978562-123H", person5);

        // etsitään sotun perusteella
        Person member = (Person) members.get("978562-123H");
        
        System.out.println(member.getDetails());
        
        System.out.println(members.entrySet());
        
        /*-----------------------------------------*/
        //treemap järjestää tietorakenteen.
        TreeMap members2 = new TreeMap();
        
        members2.put("121290-121R", person1);
        members2.put("101089-234F", person2);
        members2.put("034534-452K", person3);
        members2.put("876342-678L", person4);
        members2.put("978562-123H", person5);
        
        member = (Person) members2.get("876342-678L");
        
        System.out.println(member.getDetails());
        
        System.out.println(members2.entrySet());        
        
    }
}
