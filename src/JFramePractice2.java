/* JFramePractice2.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   11/16/2016
*/

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFramePractice2 extends JFrame
    {
        BorderLayout border = new BorderLayout();
        
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
        }

    public static void main(String[] args)
        {
        
        }// end main method
    
    }
