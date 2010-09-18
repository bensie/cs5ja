//James Miller
//04-29-03
//CS5JA Programming Assignment 3
//TA: Rahul Nimral
//Discussion: Mon@10
/////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.text.*;
import java.io.*;

class Fibonacci {

  public static void main( String[] args) throws IOException {

    
    BufferedReader bufReader = new BufferedReader(
                               new InputStreamReader( System.in ) );
    String input, space;
    long   fib;
    double A,B,C,D,N;
    double out;

    space = new String (" ");    
    
    System.out.print("Compute which Fibonacci number: ");
    input = bufReader.readLine();
    
    N = Double.parseDouble(input);
    
    A   =  1/(Math.sqrt(5));
    B   =  Math.pow(((1 + Math.sqrt(5))/2), (N));
    C   =  Math.pow(((1 - Math.sqrt(5))/2), (N));
    D   =  B-C;
    out =  A*D;

    DecimalFormat number  = new DecimalFormat("0");

    fib = (long) out;
    System.out.println("Fibonacci number" + space + number.format(N) + space + "is equal to: " + fib);

    System.exit(0);

  }
} 
