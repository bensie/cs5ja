//James Miller
//06-03-03
//CS5JA Programming Assignment 6
//TA: Rahul Nimral
//Discussion: Mon@10
////////////////////////////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.text.*;

public class Tables {

  public static void main (String[] args) {

  String m,n;
  int x1, y1;
  int i;
  int k;
  int input;
  int j;
  double input2;
  DecimalFormat twoDigits   = new DecimalFormat("0.00");
  DecimalFormat threeDigits = new DecimalFormat("0.000");   
  
/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Create JFrame Window:
/////////////////////////////////////////////////////////////////////////////////////////////////////////

  JFrame window;
    Container contentPane;
    Graphics g;

    window = new JFrame();
    window.setSize(600,350);
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane=window.getContentPane();
    g = contentPane.getGraphics();

/////////////////////////////////////////////////////////////////////////////////////////////////////////
// Choose Sine or Cosine with values 1 or 2:
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    input  = Integer.parseInt(JOptionPane.showInputDialog(null, "Press (1) for Sine or (2) for Cosine"));

    while (input != 1 && input != 2) { 
      input = Integer.parseInt(JOptionPane.showInputDialog("Press (1) for Sine or (2) for Cosine"));
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Choose the Starting Value:
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    input2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Starting Value of x"));

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Table Title
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    m = ("Table of values for sin(x) in the range "
        + (twoDigits.format(input2)) + " to " + (twoDigits.format(input2 + .99)));

    n = ("Table of values for cos(x) in the range "
        + (twoDigits.format(input2)) + " to " + (twoDigits.format(input2 + .99)));


    if (input == 1) {
      g.drawString(m, 150, 15); }
    if (input == 2) {
      g.drawString(n, 150, 15); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//If user chooses Sine:
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    y1 = 44;
    if (input == 1) {
      for (j = 1; j <= 10; j++) {
      x1 = 49;
        for (k = 1; k <= 10; k++) {
        String math = (" " + threeDigits.format(Math.sin(input2)));
        g.drawString(math, x1, y1);
        input2 = input2 + 0.01;
        x1 = (x1 + 50);    
        }
      y1 = y1 + 30;
      }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//If user chooses Cosine:
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    y1 = 44;
    if (input == 2) {
      for (j = 1; j <= 10; j++) {
      x1 = 49;
        for (k = 1; k <= 10; k++) {
        String math = (" " + threeDigits.format(Math.cos(input2)));
        g.drawString(math, x1, y1);
        input2 = input2 + 0.01;
        x1 = (x1 + 50);    
        }
      y1 = y1 + 30;
      }
    }
  
  }

}