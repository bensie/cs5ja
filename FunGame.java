//James Miller
//05-22-03
//CS5JA Programming Assignment 5
//TA: Rahul Nimral
//Discussion: Mon@10
/////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.io.*;

public class FunGame  {

  public static void main (String [] args) throws IOException {

    PairOfDice you = new PairOfDice();
    PairOfDice me = new PairOfDice();

    int metotal;
    int youtotal;

    youtotal = 0;
    metotal  = 0;

    BufferedReader bufReader = new BufferedReader(
                               new InputStreamReader( System.in ) );


//Round 1  
    System.out.println("Round number 1, hit enter to roll the dice:");
    bufReader.readLine();

    you.roll();
  
    System.out.println("Your roll:" + "\t" + "DICE 1 = " + you.getDice1() + "\t" + "and DICE 2 = " + you.getDice2());
    System.out.println("Your total:" + "\t" + you.getSum());

    me.roll();
  
    System.out.println("My roll:" + "\t" + "DICE 1 = " + me.getDice1() + "\t" + "and DICE 2 = " + me.getDice2());
    System.out.println("My total:" + "\t" + me.getSum());
 

    if (you.getSum() > me.getSum()) {
      System.out.println("...Human Wins The Round!"+ "\n");
      youtotal += 1;
    }

    else if (you.getSum() < me.getSum()) {
      System.out.println("...Computer Wins The Round!" + "\n");
      metotal += 1;
    }

    else 
      System.out.println("...No Winner! It's A TIE!" + "\n");
    

//Round 2
    System.out.println("Round number 2, hit enter to roll the dice:");
    bufReader.readLine();

    you.roll();
  
    System.out.println("Your roll:" + "\t" + "DICE 1 = " + you.getDice1() + "\t" + "and DICE 2 = " + you.getDice2());
    System.out.println("Your total:" + "\t" + you.getSum());

    me.roll();
  
    System.out.println("My roll:" + "\t" + "DICE 1 = " + me.getDice1() + "\t" + "and DICE 2 = " + me.getDice2());
    System.out.println("My total:" + "\t" + me.getSum());

    if (you.getSum() > me.getSum()) {
      System.out.println("...Human Wins The Round!"+ "\n");
      youtotal += 1;
    }

    else if (you.getSum() < me.getSum()) {
      System.out.println("...Computer Wins The Round!" + "\n");
      metotal += 1;
    }

    else 
      System.out.println("...No Winner! It's A TIE!" + "\n");
    

//Round 3
    System.out.println("Round number 3, hit enter to roll the dice:");
    bufReader.readLine();

    you.roll();
  
    System.out.println("Your roll:" + "\t" + "DICE 1 = " + you.getDice1() + "\t" + "and DICE 2 = " + you.getDice2());
    System.out.println("Your total:" + "\t" + you.getSum());

    me.roll();
  
    System.out.println("My roll:" + "\t" + "DICE 1 = " + me.getDice1() + "\t" + "and DICE 2 = " + me.getDice2());
    System.out.println("My total:" + "\t" + me.getSum());


    if (you.getSum() > me.getSum()) {
      System.out.println("...Human Wins The Round!"+ "\n");
      youtotal += 1;
    }

    else if (you.getSum() < me.getSum()) {
      System.out.println("...Computer Wins The Round!" + "\n");
      metotal += 1;
    }

    else 
      System.out.println("...No Winner! It's A TIE!" + "\n");
    

//Round 4
    System.out.println("Round number 4, hit enter to roll the dice:");
    bufReader.readLine();

    you.roll();
  
    System.out.println("Your roll:" + "\t" + "DICE 1 = " + you.getDice1() + "\t" + "and DICE 2 = " + you.getDice2());
    System.out.println("Your total:" + "\t" + you.getSum());

    me.roll();
  
    System.out.println("My roll:" + "\t" + "DICE 1 = " + me.getDice1() + "\t" + "and DICE 2 = " + me.getDice2());
    System.out.println("My total:" + "\t" + me.getSum());


    if (you.getSum() > me.getSum()) {
      System.out.println("...Human Wins The Round!"+ "\n");
      youtotal += 1;
    }

    else if (you.getSum() < me.getSum()) {
      System.out.println("...Computer Wins The Round!" + "\n");
      metotal += 1;
    }

    else 
      System.out.println("...No Winner! It's A TIE!" + "\n");
    

//Round 5
    System.out.println("Round number 5, hit enter to roll the dice:");
    bufReader.readLine();

    you.roll();
  
    System.out.println("Your roll:" + "\t" + "DICE 1 = " + you.getDice1() + "\t" + "and DICE 2 = " + you.getDice2());
    System.out.println("Your total:" + "\t" + you.getSum());

    me.roll();
  
    System.out.println("My roll:" + "\t" + "DICE 1 = " + me.getDice1() + "\t" + "and DICE 2 = " + me.getDice2());
    System.out.println("My total:" + "\t" + me.getSum());


    if (you.getSum() > me.getSum()) {
      System.out.println("...Human Wins The Round!"+ "\n");
      youtotal += 1;
    }

    else if (you.getSum() < me.getSum()) {
      System.out.println("...Computer Wins The Round!" + "\n");
      metotal += 1;
    }

    else 
      System.out.println("...No Winner! It's A TIE!" + "\n");
    

//Round 6
    System.out.println("Round number 6, hit enter to roll the dice:");
    bufReader.readLine();

    you.roll();
  
    System.out.println("Your roll:" + "\t" + "DICE 1 = " + you.getDice1() + "\t" + "and DICE 2 = " + you.getDice2());
    System.out.println("Your total:" + "\t" + you.getSum());

    me.roll();
  
    System.out.println("My roll:" + "\t" + "DICE 1 = " + me.getDice1() + "\t" + "and DICE 2 = " + me.getDice2());
    System.out.println("My total:" + "\t" + me.getSum());


    if (you.getSum() > me.getSum()) {
      System.out.println("...Human Wins The Round!"+ "\n");
      youtotal += 1;
    }

    else if (you.getSum() < me.getSum()) {
      System.out.println("...Computer Wins The Round!" + "\n");
      metotal += 1;
    }

    else 
      System.out.println("...No Winner! It's A TIE!" + "\n");

//Final Results

    System.out.println("Game over ... final results:");
    System.out.println("\t" + "Human total:" + "\t" + youtotal);
    System.out.println("\t" + "Computer total:" + "\t" + metotal);

    if (youtotal > metotal)
      System.out.println("Human Wins!!!"+ "\n");
      

    else if (youtotal < metotal)
      System.out.println("Computer Wins!!!" + "\n");

    else 
      System.out.println("No Winner! This game is A TIE!" + "\n");
    


  }

}