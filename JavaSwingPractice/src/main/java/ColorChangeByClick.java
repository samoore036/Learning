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
import java.awt.event.*;

public class ColorChangeByClick {
    private JFrame frame;
    private JLabel label;
    private JButton colorButton = new JButton("Change colors");
    private JButton labelButton = new JButton("Change label");
    
    public void go() {
        this.frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        colorButton.addActionListener(event -> frame.repaint());
        //adds the listener (this) to the button 
        
        labelButton.addActionListener(event -> label.setText("Ouch!"));
        
        this.label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();
        
        this.frame.getContentPane().add(BorderLayout.SOUTH,this.colorButton);
        this.frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        this.frame.getContentPane().add(BorderLayout.EAST,this.labelButton);
        this.frame.getContentPane().add(BorderLayout.WEST,this.label);
        this.frame.setSize(500,500);
        this.frame.setVisible(true);
    }
    
   
}
