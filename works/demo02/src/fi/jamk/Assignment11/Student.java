package fi.jamk.Assignment11;

import java.util.ArrayList;

/**
 *
 * @author H8951
 */
public class Student {
    
    String name, classID;
    int age;
    double average;
    
    ArrayList<Integer> grades = new ArrayList<>();
    
    public void Student(String newName){
        this.name = newName; 
    }
    
    public void Student(String newName, String classID, int age, double average){
        this.name = newName;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }
    
    public void setClass(String newClass){
        this.classID = newClass;
    }
    
    public void setAverage(double newAverage){
        this.average = newAverage;
    }
    
    public void addGrade(int grade){
        grades.add(grade);
        appendAverage(grades);
    }
    
    private void appendAverage(ArrayList grades){
        
        int sum = 0;
        Integer gradesArray[] = new Integer[grades.size()];
        grades.toArray(gradesArray);
        
        for(int i = 0; i < gradesArray.length; i++){
            sum = sum + gradesArray[i];
        }  
        this.average = sum / gradesArray.length;    
    }
    
    public void printDetails(){
        System.out.println("name: " + this.name + ", age: " + age + ", classID: " + this.classID + ", average: " + this.average);
        grades.toString();
    }
}
