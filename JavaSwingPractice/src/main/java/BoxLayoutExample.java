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

public class BoxLayoutExample {
    public void go() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setBackground(Color.darkGray);
        
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        //this method sets the layout to a different one than the default 
        //y axis is for a vertical stack
        //x axis is for a horizontal stack
        
        JButton button = new JButton("click me");
        JButton button2 = new JButton("click here");
        p.add(button);
        p.add(button2);
        f.getContentPane().add(BorderLayout.EAST,p);
        f.setSize(250,200);
        f.setVisible(true);
    }
}
