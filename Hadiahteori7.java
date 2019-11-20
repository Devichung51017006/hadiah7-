package hadiahteori7;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Frame;
import java.awt.GridLayout;

public class Hadiahteori7 extends JFrame {
    JTextField text = new JTextField();
    JButton a0 = new JButton("0");
    JButton a1 = new JButton("1");
    JButton a2 = new JButton("2");
    JButton a3 = new JButton("3");
    JButton a4 = new JButton("4");
    JButton a5 = new JButton("5");
    JButton a6 = new JButton("6");
    JButton a7 = new JButton("7");
    JButton a8 = new JButton("8");
    JButton a9 = new JButton("9");
    JButton titik = new JButton(".");
    JButton ce = new JButton("CE");
    
    public Hadiahteori7(){
        super("Kalkulator");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(text, BorderLayout.NORTH);
        JPanel pane = new JPanel();
        GridLayout kalkul  = new GridLayout(4,3,0,0);
        pane.setLayout(kalkul);
        pane.add(a7);
        pane.add(a8);
        pane.add(a9);
        pane.add(a4);
        pane.add(a5);
        pane.add(a6);
        pane.add(a3);
        pane.add(a2);
        pane.add(a1);
        pane.add(a0);
        pane.add(titik);
        pane.add(ce);
        add(pane);
        setVisible(true);}
             
        public static void main (String[] args){
           Hadiahteori7 frame = new Hadiahteori7();
           frame.setVisible(true);
        }
        
    }
    

