//James Miller
//04-29-03
//CS5JA Programming Assignment 3
//TA: Rahul Nimral
//Discussion: Mon@10
/////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.text.*;

class Interest {

  public static void main( String[] args) {

    double P;
    double R;
    double N;
    double output;
    
    String input, space;
    
    space      = new String (" ");

    input  = JOptionPane.showInputDialog(null, "Input dollars to invest: ");
    P      = Double.parseDouble(input);
    
    input  = JOptionPane.showInputDialog(null, "Input Interest Rate: ");
    R      = Double.parseDouble(input);
    
    input  = JOptionPane.showInputDialog(null, "Input Number of Years: ");
    N      = Double.parseDouble(input);
    
    output = (Math.pow((1 + R/(100)),(N)))*P;
    
    DecimalFormat dollar  = new DecimalFormat("0.00");
    DecimalFormat number  = new DecimalFormat("0");
    DecimalFormat percent = new DecimalFormat("0.0");

    JOptionPane.showMessageDialog(null, 

    "When" + space + "$" + dollar.format(P) + space + 
    "is invested"							+"\n"
    +"at a rate of" + space + percent.format(R) + "%" + space +
    "for" + space + number.format(N) + " years" 			+"\n"
    +"compounded annually, the final" 					+"\n"
    +"result is" + space + "$" 	+ dollar.format(output)+".");		
    


    System.exit(0);

  }
} 
