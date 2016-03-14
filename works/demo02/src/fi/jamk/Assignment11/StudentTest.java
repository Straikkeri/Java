/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment11;

/**
 *
 * @author H8951
 */
public class StudentTest {
    
    public static void main(String args[]){
    
        Student testStudent = new Student();
        
        testStudent.setName("Masi");
        testStudent.setAge(17);
        testStudent.setClass("3B");
        testStudent.addGrade(1);
        testStudent.addGrade(2);
        testStudent.addGrade(3);
        testStudent.addGrade(4);
        testStudent.addGrade(5);
        
        testStudent.printDetails();
        
        /*Student testStudent0 = new Student();
        Student testStudent1 = new Student();
        Student testStudent2 = new Student();
        
        testStudent.setName("Esa");
        testStudent.setAge(17);
        testStudent.setClass("2A");
        testStudent.addGrade(1);
        testStudent.addGrade(2);
        testStudent.addGrade(1);
        testStudent.addGrade(1);
        testStudent.addGrade(1);
        
        testStudent.setName("Juski");
        testStudent.setAge(17);
        testStudent.setClass("1C");
        testStudent.addGrade(1);
        testStudent.addGrade(3);
        testStudent.addGrade(3);
        testStudent.addGrade(3);
        testStudent.addGrade(1);
        
        testStudent.setName("Aatos");
        testStudent.setAge(17);
        testStudent.setClass("4A");
        testStudent.addGrade(3);
        testStudent.addGrade(2);
        testStudent.addGrade(4);
        testStudent.addGrade(4);
        testStudent.addGrade(5);
        
        Student students[] = new Student[3];
        
        students[0] = testStudent0;
        students[1] = testStudent1;
        students[2] = testStudent2;
        
        System.out.println(students[0].printDetails());
        System.out.println(students[1].printDetails());
        System.out.println(students[2].printDetails());
        */
    }
    
}
