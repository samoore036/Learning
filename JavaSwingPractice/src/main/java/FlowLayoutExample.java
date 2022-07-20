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

public class FlowLayoutExample {
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button = new JButton("click me");
        panel.add(button);//panel layout by default controlled by FlowLayout
        JButton button2 = new JButton("check me");
        panel.add(button2);
        JButton button3 = new JButton("click here");
        panel.add(button3);
        frame.getContentPane().add(BorderLayout.EAST,panel);//frame layout by default controlled by BorderLayout
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
