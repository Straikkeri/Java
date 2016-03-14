/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Assignment00;

import fi.jamk.Assignment01.Ball;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javazoom.jl.player.Player;
/**
 *
 * @author H8951
 */
public class GraphicsTesting extends JFrame implements Runnable {
    
    private Font f1;
    private Image bgImage;
    private MediaTracker mt;
    private Ball ball;
    private Thread thread;
    private ArrayList<Ball> balls;
    
    public GraphicsTesting(){
        super("Graphics Testing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        this.f1 = new Font("verdana", Font.ITALIC, 20);
        this.bgImage = getToolkit().createImage("bg.jpg");
        this.mt = new MediaTracker(this);
        this.mt.addImage(bgImage, 0);
        
        try{
            this.mt.waitForAll();
        }catch(Exception e){
        }
        //this.ball = new Ball(800,600);
        this.balls = new ArrayList<>();
        
        for (int i =1;i<=1000;i++){
            balls.add( new Ball(800,600));
        }
        
        getContentPane().add(new DrawPanel());
        this.thread = new Thread(this);
        this.thread.start();
    }
    
    public static void main(String args[]){
        new GraphicsTesting().setVisible(true);
    }
 
    @Override
    public void run(){
        while(true){
            for(Ball ball:balls){
                ball.move();
            }
            repaint();
            try {
                thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(GraphicsTesting.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class DrawPanel extends JPanel{
        
        @Override
        public void paintComponent(Graphics g){
            
            g.drawImage(bgImage, 0, 0, this);
            g.setColor(Color.red);
            g.setFont(f1);
            g.drawString("Random lorem ipsum dolor", 10, 20);
            
            for(Ball ball : balls){
                g.setColor(ball.getColor());
                g.fillOval(ball.getX(), 
                        ball.getY(), 
                        ball.getSize(), 
                        ball.getSize());
            }
        }
    }
    
}
