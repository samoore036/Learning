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

public class CustomWidget extends JPanel{
//you need a subclass of JPanel to customize your own widget

    public void paintComponent(Graphics g) {
        //you will never call Graphics yourself, the system will 
        
        g.setColor(Color.orange);
        //Graphics g is a paint machine that colors and shapes your graphic
        
        g.fillRect(20,50,100,100);
        //fill a Rectangle at coords (20,50) size 100x100
        
        //adding a picture to the widget
        Image image = new ImageIcon("imageFileName.jpg").getImage();
        
        g.drawImage(image,3,4,this);
        //x,y coords of where top left corner should go
    }
}
