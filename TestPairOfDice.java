//James Miller
//05-10-03
//CS5JA Programming Assignment 3
//TA: Rahul Nimral
//Discussion: Mon@10
/////////////////////////////////////////////////////////////////////////

import javax.swing.*;

public class TestPairOfDice {

  public static void main (String[] args) {
 
    System.out.println("Creating New Pair Of Dice with values 3 and 4..." + "\n" );
    PairOfDice test = new PairOfDice (3,4);
    System.out.println("Testing toString function..." + "\n" );
    System.out.println(test.toString());

    System.out.println("Rolling the dice...");
    test.roll();
    System.out.println(test.toString());

    System.out.println("Rolling the dice again..." + "\n" );
    test.roll();
    System.out.println(test.toString());

    System.out.println("Testing Class functions..." + "\n" );


    test.setDice1 (1);
    test.setDice2 (1);
    if (test.isSnakeEyes ())
    System.out.println("Snake Eyes Test Passed");
    else
    System.out.println("Snake Eyes Test Failed");

    test.setDice1 (1);
    test.setDice2 (5);
    if (test.isOneOne())
    System.out.println("One-One Test Passed");
    else
    System.out.println("One-One Test Failed");

    PairOfDice test2 = new PairOfDice ();
    test.setDice1 (1);
    test.setDice2 (5);
    test2.setDice1 (1);
    test2.setDice2 (5);

    if (test.isEqual(test2))
    System.out.println("Is Equal Test Passed");
    else
    System.out.println("Is Equal Test Failed");

    
    test.setDice1 (6);
    test.setDice2 (4);
    if (test.getSum () == 10)
    System.out.println("getSum Test Passed");
    else
    System.out.println("getSum Test Failed");

    test.setDice1 (3);
    test.setDice2 (5);
    if (test.getDice1 () == 3)
    System.out.println("Get Dice1 Test Passed");
    else
    System.out.println("Get Dice1 Test Failed");
    
    if (test.getDice2 () == 5)
    System.out.println("Get Dice2 Test Passed");
    else
    System.out.println("Get Dice2 Test Failed");
    }
}