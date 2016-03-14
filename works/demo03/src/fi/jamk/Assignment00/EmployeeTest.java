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
public class EmployeeTest {

    public static void main(String args[]){
    
        Employee emp1 = new Employee("Esa", "Nahkaamon päällikkö", 1200);
        Employee emp2 = new Employee("Markus", "Chattaaja", 3200);
        
        Boss boss1 = new Boss("Jarkko", "Kyöpeli", 2100, "Mazda", 500);
        Boss boss2 = new Boss("Hilkka", "Pyöräkorjaamon vanhempi laakerintarkistaja", 1700, "Mitsu", 150);
         
        emp2.setName("Valtti");
        boss2.setCar("Honda");
        
        emp1.returnDetails();
        emp2.returnDetails();
        
        System.out.println(boss1.returnDetails());
        System.out.println(boss2.returnDetails());
        
        
        
        
    }
    
}
