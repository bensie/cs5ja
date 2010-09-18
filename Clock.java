//James Miller
//05-22-03
//CS5JA Programming Assignment 5
//TA: Rahul Nimral
//Discussion: Mon@10
/////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.text.*;


public class Clock  {

  public static void main (String [] args) {

    String input;
    int H, M;
    
    input  = JOptionPane.showInputDialog(null, "Enter Hour: ");
    H      = Integer.parseInt(input);
    
    input  = JOptionPane.showInputDialog(null, "Enter Minutes: ");
    M      = Integer.parseInt(input);
    
    
    JFrame    win;
    Container contentPane;
    Graphics  g, Kmin, Khour;

    win = new JFrame();
    win.setSize (300,300);
    win.setVisible (true);

    contentPane = win.getContentPane();
    g = contentPane.getGraphics();
    g.setColor(Color.magenta);
    g.drawOval (50,50,200,200);
    
    Kmin = contentPane.getGraphics();
    Kmin.drawLine (150,150,(150 + 195((Math.cos(*M))),((150) - (195)(sin(M))));
  
    Khour = contentPane.getGraphics();
    Khour.drawLine (150,150,(150 + 180((Math.cos(*H)),(150 - 180(Math.sin(H))));
  }

}