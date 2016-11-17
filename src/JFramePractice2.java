/* JFramePractice2.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   11/16/2016
*/

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.*;

public class JFramePractice2 extends JFrame
    {
        BorderLayout border = new BorderLayout(10, 10);
        
        JPanel mainPnl = new JPanel();
        
        JPanel northPnl = new JPanel();
        JPanel eastPnl = new JPanel();
        JPanel southPnl = new JPanel();
        JPanel westPnl = new JPanel();
        JPanel centerPnl = new JPanel();
        
        JLabel northLbl = new JLabel("NORTH");
        JLabel eastLbl = new JLabel("EAST");
        JLabel westLbl = new JLabel("WEST");
        JLabel southLbl = new JLabel("SOUTH");
        JLabel centerLbl = new JLabel("CENTER");
        
        JButton pressMe = new JButton("Press me!");
    
    public JFramePractice2()
        {
            // going to JFrame constructor
            super("Practice Using BorderLayout");
            setSize(450, 450);
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            setLocationRelativeTo(null);
            add(mainPnl);
            mainPnl.setBackground(Color.yellow);
            mainPnl.setLayout(border);
            
            // north
            northPnl.setBackground(Color.red);
            northPnl.add(northLbl);
            mainPnl.add(northPnl, BorderLayout.NORTH);
            repaint();
            
            // south panel
            southPnl.setBackground(Color.cyan);
            southPnl.add(southLbl);
            mainPnl.add(southPnl, BorderLayout.SOUTH);
            
            // east panel
            eastPnl.setBackground(Color.DARK_GRAY);
            eastPnl.add(eastLbl);
            mainPnl.add(eastPnl, BorderLayout.EAST);
            
            // west panel
            westPnl.setBackground(Color.blue);
            westPnl.add(westLbl);
            mainPnl.add(westPnl, BorderLayout.WEST);
            
            // center panel
            centerPnl.setBackground(Color.orange);
            centerPnl.add(westLbl);
            mainPnl.add(westPnl, BorderLayout.WEST);
            
        }

    public static void main(String[] args)
        {
            JFramePractice2 myFrame = new JFramePractice2();
        
        }// end main method
    
    }
    