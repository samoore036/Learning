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

public class BorderLayoutExample {
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.EAST,button);
        JButton button2 = new JButton("There is no spoon...");
        Font bigFont = new Font("serif",Font.BOLD,28);
        button2.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH,button2);
        JButton button3 = new JButton("center text");
        button3.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.CENTER,button3);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
