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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox implements ItemListener {
    private JCheckBox cb;
    private JLabel l;
    
    public void go() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        cb = new JCheckBox("Goes to 11");
        l = new JLabel("not selected");
        l.setForeground(Color.red);
        p.add(cb);
        //listen for when item is selected or deselected 
        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String onOrOff = "off";
        if (cb.isSelected()) {
            onOrOff = "on";
        }
        System.out.println(String.format("Check box is %s",onOrOff));
    }
}
