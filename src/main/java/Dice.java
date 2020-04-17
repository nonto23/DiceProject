public class Dice
{
    private  int value = 0;


    private final int MAX = 6;  // maximum face value
    private int faceValue;  // current value showing on the die

    public Dice()
    {

    }
    public Dice(int value)
    {
        faceValue = value;
    }

    // Rolls the die and returns the result.
    public int roll()
    {
        faceValue = (int)(Math.random() * MAX) + 1;

        return faceValue;
    }

    public void setFaceValue (int value)
    {
        faceValue = value;
    }
    public int getFaceValue()
    {
        return faceValue;
    }
    public String toString()
    {
        String result = Integer.toString(faceValue);
        return result;
    }

    public static void main(String[]args)
    {
        Dice die1, die2, die3;
        int sum;

//        die1 = new Dice(6);
//        die1.roll();
//
//        die2 = new Dice(20);
//        die2.roll();
//
//        System.out.println(die1.getFaceValue());
//        System.out.println(die2.getFaceValue());

        die1 = new Dice();
        die1.roll();
        die2 = new Dice();
        die2.roll();
        System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
      //  System.out.println ("Die One: " + die1 + ", Die Two: " + die2);



        int x = die1.roll();

//        System.out.println("Die 1 " + die1.roll());
//
//        die2.setFaceValue(4);
//        System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
//
//        sum = die1.getFaceValue() + die2.getFaceValue();
//        System.out.println ("Sum: " + sum);
//
//        sum = die1.roll() + die2.roll();
//        System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
//        System.out.println ("New sum: " + sum);
//
//        die3 = new Die(4);
//        System.out.println("Die Three : " + die3.getFaceValue());

    }

}
