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
import java.util.concurrent.TimeUnit;

public class ShrinkingRectangle {
    int x = 1;
    int y = 1;
    
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RectanglePanel p = new RectanglePanel();
        frame.getContentPane().add(p);
        frame.setSize(500,270);
        frame.setVisible(true);
        for (int i = 0; i < 130; i++, y++, x++) {
            x++;
            p.repaint();
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (Exception e) {}
        }
        
        for (int i = 0; i < 130; i++, y--, x--) {
           x--;
           p.repaint();
           try {
               TimeUnit.MILLISECONDS.sleep(30);
           } catch (Exception e) {}
        }
    }
    
    public class RectanglePanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,500,250);
            g.setColor(Color.blue);
            g.fillRect(x, y, 500-x*2, 250-y*2);
        }
    }
}
