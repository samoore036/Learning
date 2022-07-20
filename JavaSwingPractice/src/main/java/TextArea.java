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

public class TextArea {
    public void go() {
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      JButton button = new JButton("Just click it");
      JTextArea text = new JTextArea(10,20);
      //10 means 10 lines (height) and 20 means 20 columns (width)
      text.setLineWrap(true);
      button.addActionListener(e -> text.append("button clicked \n"));
      
      
      JScrollPane scroller = new JScrollPane(text);
      //makes a scroller and give it the text area it will scroll for 
      //turn on line wrapping
      scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      panel.add(scroller);
      //tells the scroll pane to use only a vertical scrollbar
      
      frame.getContentPane().add(BorderLayout.CENTER, panel);
      frame.getContentPane().add(BorderLayout.SOUTH, button);
      frame.setSize(350,300);
      frame.setVisible(true);
    }
    
    
}
