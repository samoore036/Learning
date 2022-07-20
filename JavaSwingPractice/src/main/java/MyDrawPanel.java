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
import java.util.Random;

public class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color initialColor = new Color(red,green,blue);
        
        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color endColor = new Color(red,green,blue);
        
        GradientPaint gradient = new GradientPaint(70,70,initialColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
    
    
    
}
