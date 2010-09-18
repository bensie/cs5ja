//James Miller
//05-10-03
//CS5JA Programming Assignment 3
//TA: Rahul Nimral
//Discussion: Mon@10
/////////////////////////////////////////////////////////////////////////

public class PairOfDice {

    private int dice1;
    private int dice2;
   
    public PairOfDice() {
      dice1 = 1;
      dice2 = 6;   
    } //default constructor
    
    public PairOfDice(int a, int b) {
      if (a <= 6 && a >= 1)
        this.dice1 = a;
      else this.dice1 = 1; // make sure that dice is in range           

      if (b <= 6 && b >= 1)
        this.dice2 = b;
      else this.dice2 = 6; // make sure that dice is in range    

   } //constructor with input

   public void roll() {
       dice1 = (int)(Math.random()*6) + 1;
       dice2 = (int)(Math.random()*6) + 1;
   }
   
   public int getDice1() {
     return dice1;
   }
   
    public int getDice2() {
     return dice2;
    }
    public void setDice1(int x) {
      if (x <= 6 && x >= 1)
        this.dice1 = x;
      // Check if new value is in range, if not just leave it.
    }
    public void setDice2 (int x) {
       if (x <= 6 && x >= 1)
        this.dice2 = x;
    }
    public int getSum () {
      return dice1 + dice2;
    } 
    public boolean isSnakeEyes() {
      if (dice1 == 1 && dice2 == 1)
        return true;
      return false;
    }
    public boolean isOneOne () {
      if ((dice1 == 1 && dice2 != 1) || (dice1 != 1 && dice2 == 1))
        return true;
      return false;
    }

    public boolean isEqual (PairOfDice p) {
      if (p.getDice1() == dice1 && p.getDice2() == dice2)
        return true;
      return false;     
    }

    public String toString () {
      return "Dice 1 = " + dice1 + "\n" +
             "Dice 2 = " + dice2 + "\n";
    }

} // end class PairOfDice