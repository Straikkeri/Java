/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment04;

/**
 *
 * @author H8951
 */
public class MyMath {
    
    Multiply multi1 = new Multiply();
    Divide div1 = new Divide();
    Add add1 = new Add();
    
    public int callMultiply(int luku1, int luku2){
          return multi1.doMultiply(luku1, luku2);
    }
    
    public int callDivide(int luku1, int luku2){ 
          return div1.doDivide(luku1, luku2);
    }
    
    public int callAdd(int luku1, int luku2){
          return add1.doAdd(luku1, luku2);
    }
    
    
}
