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
import java.awt.event.*;
public class GuiAction implements ActionListener{
    //implementing the interface says "an instance of GuiAction IS-A ActionListener
    private JButton button;
    
    public void go() {
        JFrame frame = new JFrame();
        this.button = new JButton("click me");
        
        button.addActionListener(this);
        //register your interest with the button. argument must be an object from an ActionListener
        
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        //implement the ActionListener interface's actionPerformed() method
        this.button.setText("I've been clicked!");
        //the button calls this method to let you know an event happened
        
    }
}
