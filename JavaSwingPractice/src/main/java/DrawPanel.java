/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.sound.midi.*;
import javax.swing.*;
import java.util.Random;
public class DrawPanel extends JPanel{
    private boolean msg = false;
    
    public void controlChange(ShortMessage event) {
        msg = true;//set flag to true when event is registered
        this.repaint();
    }
    
    public void paintComponent(Graphics g) {
        Random random = new Random();
        if (msg) {
            int r = random.nextInt(256);
            int gr = random.nextInt(256);
            int b = random.nextInt(256);
            
            g.setColor(new Color(r,gr,b));
            
            int height = random.nextInt(120) + 10;
            int width = random.nextInt(120) + 10;
            
            int x = random.nextInt(40) + 10;
            int y = random.nextInt(40) + 10;
            
            g.fillRect(x,y,width,height);
            msg = false;
        }
    }
}
