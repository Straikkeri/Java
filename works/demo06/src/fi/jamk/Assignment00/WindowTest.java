/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment00;

import javax.swing.JFrame;

/**
 *
 * @author H8951
 */
public class WindowTest extends JFrame {
    
    public WindowTest(){
        super("WindowTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setResizable(false);
    }

public static void main(String args[]){
    new WindowTest().setVisible(true);
}
}
