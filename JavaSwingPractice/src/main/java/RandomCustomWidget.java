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

public class RandomCustomWidget extends JPanel{
    
    public void paintComponent(Graphics g) {
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        //no color selected so by default the rectangle will be black
        //widget starts upper left corner (0,0) relative to the panel
        //makes the width and height of the widget fill the whole panel
        
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        
        Color randomColor = new Color(red,green,blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }
}
