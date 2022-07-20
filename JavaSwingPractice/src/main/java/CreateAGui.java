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
public class CreateAGui {
    public void createGui() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.EAST,button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}
