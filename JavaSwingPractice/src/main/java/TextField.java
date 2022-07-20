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

public class TextField {
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton button = new JButton("click it");
        JTextField field = new JTextField(20);
        //20 columns (width)
        //System.out.println(field.getText());
        //gets text from the field
        field.setText("text here");
        //sets text in the field
        //field.setText("");
        //clears the field
        field.addActionListener(e -> System.out.println(""));
        //field.selectAll();
        //select/highlight the text in the field 
        //field.requestFocus();
        //put cursor back in the field 
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH,field);
        frame.setSize(350,300);
        frame.setVisible(true);
    }
}
