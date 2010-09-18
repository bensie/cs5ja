//James Miller
//04-19-03
//CS5JA Programming Assignment 2
//TA: Rahul Nimral
//Discussion: Mon@10
/////////////////////////////////////////////////////////////////////////

import javax.swing.*;

class Name {

  public static void main( String[] args) {

    String fullName, first, middle, last, space, midinitial, output;
    space      = new String (" ");

    fullName   = JOptionPane.showInputDialog(null, "What is your name (First Middle Last)? ");

    first      = fullName.substring(0, fullName.indexOf(space));
    fullName   = fullName.substring(fullName.indexOf(space) + 1, fullName.length());
    middle     = fullName.substring(0, fullName.indexOf (space));
    last       = fullName.substring(fullName.indexOf(space) + 1, fullName.length());
    midinitial = middle.substring(0,1);
    
    output     = last 
               + ","
               + space 
               + first
               + space 
               + midinitial 
               + ".";
       
    JOptionPane.showMessageDialog(null, "Full Name: " + output);

    System.exit(0);

  }
} 

