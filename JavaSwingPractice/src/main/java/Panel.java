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

public class Panel {
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b = new JButton("tes");
        frame.add(BorderLayout.SOUTH,b);
        
        JPanel p = new JPanel();
        p.setBackground(Color.darkGray);
        JButton b2 = new JButton("watari");
        p.add(b2);
        
        frame.add(BorderLayout.CENTER,p);
        
        
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
