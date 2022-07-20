/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
public class SimpleAnimation {
    private int x = 40;
    private int y = 40;
    
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyDrawPanel drawPanel = new MyDrawPanel();
        
        frame.getContentPane().add(drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
        
        for (int i = 0; i < 130; i++) {
            x++;
            //y++;
            drawPanel.repaint();
            try {
                TimeUnit.MILLISECONDS.sleep(50);
                //length of pause between repaints (otherwise it will move too quickly to see)
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    class MyDrawPanel extends JPanel {//we make this an inner class so it can always access x and y 
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);//sel panel color to white
            g.fillRect(0,0,this.getWidth(),this.getHeight());//fill the whole entier panel
            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    }
}
