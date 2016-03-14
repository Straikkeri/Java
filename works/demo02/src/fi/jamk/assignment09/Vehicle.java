package fi.jamk.assignment09;

/**
 *
 * @author H8951
 */
public class Vehicle {
    
    int speed;
    String name;
    
    private void Vechicle(){
        this.speed = 0;
        this.name = "";    
    }
    
    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String returnName(){
        return name;
    }
    
    public void printDetails(){
        System.out.println("Name: " + name +", Speed: " + speed);
    }
}
