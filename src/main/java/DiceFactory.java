public class DiceFactory
{

    DiceFactory()
    {

    }
    static void makeDie(int sides){
        int val;
        int minimum = 1;
        int range = sides - minimum + 1;

        val = (int)(Math.random() * range) + minimum;
        System.out.println("Your lucky number = " + val);
    }

}
