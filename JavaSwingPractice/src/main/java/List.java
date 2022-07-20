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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class List implements ListSelectionListener{
    private JList<String> list;
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        String[] listEntries = {"a","b","c","d","e","f"};
        list = new JList<>(listEntries);
        
        JScrollPane scroller = new JScrollPane(list);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);
        
        list.setVisibleRowCount(4);
        //sets number of lines to show before scrolling
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //restricts the user to selecting only one thing at a time
        
        frame.setSize(300,200);
        frame.setVisible(true);
    }
    
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String selection = list.getSelectedValue();
            System.out.println(selection);
        }
    }
}
