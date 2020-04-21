import java.awt.color.ICC_Profile;
import java.util.Arrays;

public class Dices
{
    private int _sides;

   public Dices(int sides, int[] probabilities)
   {
         _sides= sides;
        setProbabilities(probabilities);
    }

    public int getSides()
    {
        return _sides;
    }

    public int[] setProbabilities(int[] probabilities)
    {
        int sum = 0;
        if(probabilities.length == 0 && getSides() == 6){
            probabilities = new int[]{1,1,1,1,1,1};
        }
        if(probabilities.length == 0 && getSides() == 10){
            probabilities = new int[]{1,1,1,1,1,1,1,1,1,1};
        }

        for(int x = 0; x< probabilities.length; ++x)
        {
            if(probabilities[x] < 0)
            {
                System.out.println("ERROR: negative probabilities not allowed");
                sum = 1;
                break;
            }
            sum += probabilities[x];
        }

        if(sum < 1){
            System.out.println("ERROR: probability sum must be greater than 0");
        }

        return probabilities;
    }


    void roll(){
        int val;
        int minimum = 1;
        int range = getSides() - minimum + 1;

        val = (int)(Math.random() * range) + minimum;
        System.out.println("Your lucky number = " + val);

    }
}
